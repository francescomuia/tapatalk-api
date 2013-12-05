package it.fmuia.apps.tapatalkapi;

import it.fmuia.apps.tapatalkapi.bean.Topics;

import java.util.List;

public class TopicServiceTest
{
	public void getTopicStatusTest() throws Exception
	{
		// TapatalkServices service = new
		// TapatalkServices("http://game-experience.it/mobiquo/mobiquo.php");
//		TapatalkServices service = new TapatalkServices("http://localhost:8080/gameexperience/mobiquo/mobiquo.php");
		 TapatalkServices service = new TapatalkServices(
		 "http://forum.html.it/forum/mobiquo/mobiquo.php");
		List<Topics> topics = service.getTopicServices().getTopicStatus("2899978");
		System.out.println(topics);
	}

	public static void main(String[] args) throws Exception
	{
		new TopicServiceTest().getTopicStatusTest();
	}
}
