package it.fmuia.apps.tapatalkapi;

import it.fmuia.apps.tapatalkapi.bean.BoardStat;
import it.fmuia.apps.tapatalkapi.bean.Config;
import it.fmuia.apps.tapatalkapi.bean.Forum;
import it.fmuia.apps.tapatalkapi.bean.PartecipatedForum;
import it.fmuia.apps.tapatalkapi.bean.Smilies;
import it.fmuia.apps.tapatalkapi.exception.UnsupportedFunction;

import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.List;

import org.apache.xmlrpc.XmlRpcException;

public class ForumServiceTest
{

//	public void getConfigTest() throws MalformedURLException, XmlRpcException
//	{
//		// ForumService service = new
//		// ForumService("http://game-experience.it/mobiquo/mobiquo.php");
//		ForumService service = new ForumService(
//				"http://forum.html.it/forum/mobiquo/mobiquo.php");
//		Config config = service.getConfig();
//		System.out.println(config);
//	}
//
//	public void getForumTest() throws MalformedURLException
//	{
//		// ForumService service = new ForumService(
//		// "http://game-experience.it/mobiquo/mobiquo.php");
//		// ForumService service = new ForumService(
//		// "http://localhost:8080/gameexperience/mobiquo/mobiquo.php");
//		ForumService service = new ForumService(
//				"http://forum.html.it/forum/mobiquo/mobiquo.php");
//		Forum[] forum = service.getForum();
//		for (Forum forum2 : forum)
//		{
//			System.out.println(forum2);
//		}
//	}
//
//	public void getPartecipantTest() throws MalformedURLException,
//			UnsupportedFunction
//	{
//		// ForumService service = new ForumService(
//		// "http://game-experience.it/mobiquo/mobiquo.php");
//		// ForumService service = new ForumService(
//		// "http://localhost:8080/gameexperience/mobiquo/mobiquo.php");
//		ForumService service = new ForumService(
//				"http://forum.html.it/forum/mobiquo/mobiquo.php");
//		PartecipatedForum forum = service.getParticipatedForum();
//		System.out.println(forum);
//	}
//
//	public void markAllReadTest() throws MalformedURLException,
//			UnsupportedFunction
//	{
//		// ForumService service = new ForumService(
//		// "http://game-experience.it/mobiquo/mobiquo.php");
//		ForumService service = new ForumService(
//				"http://localhost:8080/gameexperience/mobiquo/mobiquo.php");
//		// ForumService service = new ForumService(
//		// "http://forum.html.it/forum/mobiquo/mobiquo.php");
//		service.markAllAsRead("1");
//
//	}
//
//	public void loginForumTest() throws MalformedURLException,
//			UnsupportedFunction
//	{
//		// ForumService service = new ForumService(
//		// "http://game-experience.it/mobiquo/mobiquo.php");
//		ForumService service = new ForumService(
//				"http://localhost:8080/gameexperience/mobiquo/mobiquo.php");
//		// ForumService service = new ForumService(
//		// "http://forum.html.it/forum/mobiquo/mobiquo.php");
//		service.loginForum("102", "tiamobibi");
//
//	}
//
//	public void getIdByUrlTest() throws MalformedURLException,
//			UnsupportedFunction
//	{
//		// ForumService service = new ForumService(
//		// "http://game-experience.it/mobiquo/mobiquo.php");
////		ForumService service = new ForumService(
////				"http://localhost:8080/gameexperience/mobiquo/mobiquo.php");
//		 ForumService service = new ForumService(
//		 "http://forum.html.it/forum/mobiquo/mobiquo.php");
//		String[] result = service
//				.getIdByUrl("http://localhost:8080/gameexperience/viewtopic.php?f=769&t=41437&sid=34c17412994b198360f7b8c078e6abf2");
//		System.out.println(Arrays.toString(result));
//	}
//
//	public void getForumStatusTest() throws MalformedURLException,
//			UnsupportedFunction
//	{
//		// ForumService service = new ForumService(
//		// "http://game-experience.it/mobiquo/mobiquo.php");
//		// ForumService service = new ForumService(
//		// "http://localhost:8080/gameexperience/mobiquo/mobiquo.php");
//		ForumService service = new ForumService(
//				"http://forum.html.it/forum/mobiquo/mobiquo.php");
//		Forum[] forums = service.getForumStatus(new String[]
//		{ "79" });
//		for (Forum forum : forums)
//		{
//			System.out.println(forum);
//		}
//
//	}
//
//	public void getSmiliesTest() throws MalformedURLException,
//			UnsupportedFunction
//	{
////		ForumService service = new ForumService(
////				"http://game-experience.it/mobiquo/mobiquo.php");
////		 ForumService service = new ForumService(
////		 "http://localhost:8080/gameexperience/mobiquo/mobiquo.php");
//		ForumService service = new ForumService(
//				"http://forum.html.it/forum/mobiquo/mobiquo.php");
//		List<Smilies> lists  =service.getSmilies();
//		System.out.println(lists);
//	}
//
//	public void getBoardStatTest() throws MalformedURLException,
//			UnsupportedFunction
//	{
//		// ForumService service = new ForumService(
//		// "http://game-experience.it/mobiquo/mobiquo.php");
//		ForumService service = new ForumService(
//				"http://localhost:8080/gameexperience/mobiquo/mobiquo.php");
//		// ForumService service = new ForumService(
//		// "http://forum.html.it/forum/mobiquo/mobiquo.php");
//		BoardStat stat = service.getBoardStat();
//		System.out.println(stat);
//	}
//
//	public static void main(String[] args) throws MalformedURLException,
//			XmlRpcException, UnsupportedFunction
//	{
//		new ForumServiceTest().getSmiliesTest();
//	}
}
