package it.fmuia.apps.tapatalkapi;

import it.fmuia.apps.tapatalkapi.bean.Config;
import it.fmuia.apps.tapatalkapi.bean.Forum;
import it.fmuia.apps.tapatalkapi.bean.OnlineUser;
import it.fmuia.apps.tapatalkapi.bean.PartecipatedForum;
import it.fmuia.apps.tapatalkapi.bean.PushType;
import it.fmuia.apps.tapatalkapi.bean.Stats;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.ClassUtils;
import org.apache.log4j.Logger;

public class ResultsMapper
{
	private static final Logger LOGGER = Logger.getLogger(ResultsMapper.class);

	private static List<Class<?>> knowClasses;
	static
	{
		knowClasses = new ArrayList<Class<?>>();
		knowClasses.add(Forum.class);
		knowClasses.add(Config.class);
		knowClasses.add(PartecipatedForum.class);
		knowClasses.add(PushType.class);
		knowClasses.add(OnlineUser.class);
		knowClasses.add(Stats.class);
	}

	private static Field getField(Class<?> aClass, String name)
	{
		Field[] fields = aClass.getDeclaredFields();
		for (Field field : fields)
		{
			if (field.getName().equals(name))
			{
				return field;
			}
			else if (field.isAnnotationPresent(PropertyName.class))
			{
				PropertyName propertyName = field
						.getAnnotation(PropertyName.class);
				if (propertyName.name().equals(name))
				{
					return field;
				}
			}
		}
		return null;
	}

	public static <T> T mapResult(Class<T> result, Map<String, Object> data)
			throws Exception
	{

		T objResult = result.newInstance();
		Iterator<Map.Entry<String, Object>> iterator = data.entrySet()
				.iterator();
		while (iterator.hasNext())
		{
			Map.Entry<String, Object> entry = iterator.next();
			Field aField = ResultsMapper.getField(result, entry.getKey());
			if (aField != null)
			{
				ResultsMapper
						.setFieldValue(aField, objResult, entry.getValue());
			}else
			{
				LOGGER.debug("FIELD NOT FOUND [ key = "+entry.getKey()+", value = "+entry.getValue()+", class = "+entry.getValue().getClass()+"]");
			}
		}
		return objResult;
	}

	private static Constructor<?> getConstructor(Class<?> aClass, Class<?> param)
	{
		try
		{
			return aClass.getConstructor(param);
		}
		catch (Exception e)
		{
			return null;
		}
	}

	public static void setFieldValue(Field field, Object obj, Object value)
			throws Exception
	{
		Class<?> fieldClass = null;
		if (field.getType().isPrimitive())
		{
			fieldClass = ClassUtils.primitiveToWrapper(field.getType());
		}
		else
		{
			fieldClass = field.getType();
		}
		field.setAccessible(true);
		if (fieldClass.isAssignableFrom(value.getClass()))
		{
			field.set(obj, value);
		}
		else
		{
			if (fieldClass.isArray() && value.getClass().isArray())
			{
				LOGGER.debug("FIELDS ARRAYS");
				if(ResultsMapper.knowClasses.contains(fieldClass.getComponentType()))
				{
					LOGGER.debug("FIELDS CLASS IS KNOW");
					int length = Array.getLength(value);
					Object fieldValueArray = Array.newInstance(fieldClass.getComponentType(), length);
					for(int i = 0; i < length; i++)
					{
						 Object data = Array.get(value, i);
						 Object objFieldValue = ResultsMapper.mapResult(fieldClass.getComponentType(), (Map<String,Object>)data);
						 Array.set(fieldValueArray, i, objFieldValue);
					}
					field.set(obj, fieldValueArray);
				}
				
			}
			else if (ResultsMapper.knowClasses.contains(fieldClass))
			{
				Object objFieldValue = ResultsMapper.mapResult(fieldClass,(Map<String,Object>) value);
				field.set(obj, objFieldValue);
			}
			else
			{
				Constructor<?> constructor = ResultsMapper.getConstructor(
						fieldClass, value.getClass());
				if (constructor != null)
				{
					Object fieldValue = constructor.newInstance(value);
					field.set(obj, fieldValue);
				}
				else
				{
					LOGGER.debug("CLASSI NON CONGRUE [ campo = "+field.getName()+", classe campo = " + field.getType()
							+ ", classe valore = " + value.getClass()+", valore = "+value);
				}
			}
		}
	}

}
