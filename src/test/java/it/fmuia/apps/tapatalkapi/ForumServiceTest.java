package it.fmuia.apps.tapatalkapi;

import it.fmuia.apps.tapatalkapi.bean.BoardStat;
import it.fmuia.apps.tapatalkapi.bean.Forum;
import it.fmuia.apps.tapatalkapi.bean.PartecipatedForum;
import it.fmuia.apps.tapatalkapi.bean.Smilies;
import it.fmuia.apps.tapatalkapi.exception.TapatalkApiException;
import it.fmuia.apps.tapatalkapi.exception.UnsupportedFunction;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ForumServiceTest extends TestTapatalkApi
{
	public ForumServiceTest() throws Exception
	{
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void testGetForum() throws TapatalkApiException
	{
		List<TapatalkServices> services = this.getAllServices();
		for (TapatalkServices tapatalkService : services)
		{
			Forum[] forums = tapatalkService.getForumService().getForum();
			assertNotNull(forums);
		}
	}

	@Test
	public void testGetParticipatedForum() throws TapatalkApiException
	{
		List<TapatalkServices> services = this.getServices40();
		for (TapatalkServices tapatalkService : services)
		{
			if (tapatalkService.getForumConfig().getGetParticipatedForum() != null
					&& tapatalkService.getForumConfig().getGetParticipatedForum().equals(1))
			{
				try
				{
					this.login(tapatalkService);
					PartecipatedForum forums = tapatalkService.getForumService().getParticipatedForum();

					assertNotNull(forums);
				}
				catch (UnsupportedFunction e)
				{
					fail(e.getMessage());
				}
			}
			else
			{
				try
				{
					this.login(tapatalkService);
					tapatalkService.getForumService().getParticipatedForum();
				}
				catch (UnsupportedFunction e)
				{

				}
			}
		}
	}

	@Test
	public void testGetBoardStat() throws TapatalkApiException
	{
		List<TapatalkServices> services = this.getServices40();
		for (TapatalkServices tapatalkService : services)
		{
			BoardStat forums = tapatalkService.getForumService().getBoardStat();
			assertNotNull(forums);
		}
	}

	@Test
	public void testGetForumStatus() throws TapatalkApiException
	{
		List<TapatalkServices> services = this.getAllServices();
		for (TapatalkServices tapatalkService : services)
		{
			Forum[] forums = tapatalkService.getForumService().getForum();
			String[] forumIds = new String[forums.length];
			for (int i = 0; i < forums.length; i++)
			{
				forumIds[i] = forums[i].getForumId();
			}

			try
			{
				forums = tapatalkService.getForumService().getForumStatus(forumIds);
				assertNotNull(forums);
			}
			catch (UnsupportedFunction e)
			{
				if (tapatalkService.getForumConfig().getGetForumStatus() != null && tapatalkService.getForumConfig().getGetForumStatus().equals(1))
				{
					fail("Il metodo ha lanciato unsupportedFunction ma doveva rispondere correttamente");
				}
			}

		}
	}

	@Test
	public void testGetSmilies()
	{
		List<TapatalkServices> services = this.getAllServices();
		for (TapatalkServices tapatalkService : services)
		{
			try
			{
				List<Smilies> smilies = tapatalkService.getForumService().getSmilies();
				assertNotNull(smilies);
			}
			catch (UnsupportedFunction e)
			{
				if ("1".equals(tapatalkService.getForumConfig().getGetSmilies()))
				{
					fail("Il metodo ha lanciato unsupportedFunction ma doveva rispondere correttamente");
				}
			}

		}
	}

}
