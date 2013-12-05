package it.fmuia.apps.tapatalkapi;

import it.fmuia.apps.tapatalkapi.bean.InboxStat;
import it.fmuia.apps.tapatalkapi.bean.RecommendedUsers;
import it.fmuia.apps.tapatalkapi.bean.User;
import it.fmuia.apps.tapatalkapi.bean.UserPosts;
import it.fmuia.apps.tapatalkapi.bean.Topics;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

import javax.imageio.ImageIO;

public class UserServiceTest
{
	public void getAvatarTest() throws Exception
	{
		TapatalkServices service = new TapatalkServices("http://game-experience.it/mobiquo/mobiquo.php");
		// TapatalkServices service = new TapatalkServices(
		// "http://localhost:8080/gameexperience/mobiquo/mobiquo.php");
		// TapatalkServices service = new TapatalkServices(
		// "http://forum.html.it/forum/mobiquo/mobiquo.php");
		BufferedImage image = service.getUserService().getAvatar("", "francesco.muia");
		if (image != null)
		{
			ImageIO.write(image, "png", new File("c:/TEMP/prova.png"));
		}
	}

	public void loginTest() throws Exception
	{
		// TapatalkServices service = new TapatalkServices(
		// "http://game-experience.it/mobiquo/mobiquo.php");
		// TapatalkServices service = new TapatalkServices(
		// "http://localhost:8080/gameexperience/mobiquo/mobiquo.php?XDEBUG_SESSION_START=ECLIPSE_DBGP&KEY=138616074104811");
		TapatalkServices service = new TapatalkServices("http://forum.html.it/forum/mobiquo/mobiquo.php");
		User user = service.getUserService().login("francesco.muia", "tiamobibi", true, null);
		System.out.println(user);

	}

	public void getInboxStatTest() throws Exception
	{
		TapatalkServices service = new TapatalkServices("http://game-experience.it/mobiquo/mobiquo.php");
		// TapatalkServices service = new TapatalkServices(
		// "http://localhost:8080/gameexperience/mobiquo/mobiquo.php?XDEBUG_SESSION_START=ECLIPSE_DBGP&KEY=138616074104811");
		// TapatalkServices service = new TapatalkServices(
		// "http://forum.html.it/forum/mobiquo/mobiquo.php");
		service.getUserService().login("francesco.muia", "tiamobibi");
		InboxStat stat = service.getUserService().getInboxStat();
		System.out.println(stat);

	}

	public void logoutTest() throws Exception
	{
		TapatalkServices service = new TapatalkServices("http://game-experience.it/mobiquo/mobiquo.php");
		// TapatalkServices service = new TapatalkServices(
		// "http://localhost:8080/gameexperience/mobiquo/mobiquo.php?XDEBUG_SESSION_START=ECLIPSE_DBGP&KEY=138616074104811");
		// TapatalkServices service = new TapatalkServices(
		// "http://forum.html.it/forum/mobiquo/mobiquo.php");
		service.getUserService().login("francesco.muia", "tiamobibi");
		System.out.println(service.getUserService().logoutUser());

	}

	public void getOnlineUsersTest() throws Exception
	{
		// TapatalkServices service = new TapatalkServices(
		// "http://game-experience.it/mobiquo/mobiquo.php");
		// TapatalkServices service = new TapatalkServices(
		// "http://localhost:8080/gameexperience/mobiquo/mobiquo.php?XDEBUG_SESSION_START=ECLIPSE_DBGP&KEY=138616074104811");
		TapatalkServices service = new TapatalkServices("http://forum.html.it/forum/mobiquo/mobiquo.php");
		service.getUserService().login("francesco.muia", "tiamobibi");
		System.out.println(service.getUserService().getOnlineUsers());

	}

	public void getUserInfoByUsernameTest() throws Exception
	{
		TapatalkServices service = new TapatalkServices("http://game-experience.it/mobiquo/mobiquo.php");
		// TapatalkServices service = new TapatalkServices(
		// "http://localhost:8080/gameexperience/mobiquo/mobiquo.php?XDEBUG_SESSION_START=ECLIPSE_DBGP&KEY=138616074104811");
		// TapatalkServices service = new TapatalkServices(
		// "http://forum.html.it/forum/mobiquo/mobiquo.php");
		service.getUserService().login("francesco.muia", "tiamobibi");
		System.out.println(service.getUserService().getUserInfoByUsername("francesco.muia"));

	}

	public void getUserTopicTest() throws Exception
	{
		// TapatalkServices service = new TapatalkServices(
		// "http://game-experience.it/mobiquo/mobiquo.php");
		TapatalkServices service = new TapatalkServices(
				"http://localhost:8080/gameexperience/mobiquo/mobiquo.php?XDEBUG_SESSION_START=ECLIPSE_DBGP&KEY=138616074104811");
		// TapatalkServices service = new TapatalkServices(
		// "http://forum.html.it/forum/mobiquo/mobiquo.php");
		service.getUserService().login("francesco.muia", "tiamobibi");
		List<Topics> topics = service.getUserService().getUserTopic("francesco.muia", "6847");
		System.out.println(topics);

	}

	public void getUserReplyPostTest() throws Exception
	{
		TapatalkServices service = new TapatalkServices("http://game-experience.it/mobiquo/mobiquo.php");
		// TapatalkServices service = new TapatalkServices(
		// "http://localhost:8080/gameexperience/mobiquo/mobiquo.php?XDEBUG_SESSION_START=ECLIPSE_DBGP&KEY=138616074104811");
		// TapatalkServices service = new TapatalkServices(
		// "http://forum.html.it/forum/mobiquo/mobiquo.php");
		service.getUserService().login("francesco.muia", "tiamobibi");
		List<UserPosts> topics = service.getUserService().getUserReplyPost("francesco.muia", null);
		System.out.println(topics);

	}

	public void getRecommendedUserTest() throws Exception
	{
		 TapatalkServices service = new TapatalkServices(
		 "http://game-experience.it/mobiquo/mobiquo.php");
//		 TapatalkServices service = new TapatalkServices(
//		 "http://localhost:8080/gameexperience/mobiquo/mobiquo.php?XDEBUG_SESSION_START=ECLIPSE_DBGP&KEY=138616074104811");
		// TapatalkServices service = new TapatalkServices(
		// "http://forum.html.it/forum/mobiquo/mobiquo.php");
		service.getUserService().login("francesco.muia", "tiamobibi");
		RecommendedUsers recommendedUsers = service.getUserService().getRecommendedUser(UserType.ALL_USER);
		System.out.println(recommendedUsers);

	}
	public void searchUserTest() throws Exception
	{
//		TapatalkServices service = new TapatalkServices(
//				"http://game-experience.it/mobiquo/mobiquo.php");
		 TapatalkServices service = new TapatalkServices(
		 "http://localhost:8080/gameexperience/mobiquo/mobiquo.php?XDEBUG_SESSION_START=ECLIPSE_DBGP&KEY=138616074104811");
		// TapatalkServices service = new TapatalkServices(
		// "http://forum.html.it/forum/mobiquo/mobiquo.php");
		service.getUserService().login("francesco.muia", "tiamobibi");
		List<User> users= service.getUserService().searchUser("*tiffano*");
		System.out.println(users);
		
	}
	public void ignoreUserTest() throws Exception
	{
//		TapatalkServices service = new TapatalkServices(
//				"http://game-experience.it/mobiquo/mobiquo.php");
		TapatalkServices service = new TapatalkServices(
				"http://localhost:8080/gameexperience/mobiquo/mobiquo.php?XDEBUG_SESSION_START=ECLIPSE_DBGP&KEY=138616074104811");
		// TapatalkServices service = new TapatalkServices(
		// "http://forum.html.it/forum/mobiquo/mobiquo.php");
		service.getUserService().login("francesco.muia", "tiamobibi");
		System.out.println(service.getUserService().ignoreUser("5", Operation.ADD));
		System.out.println(service.getUserService().getUserInfoByUsername("francesco.muia"));
		
	}

	public static void main(String[] args) throws Exception
	{
		new UserServiceTest().ignoreUserTest();
	}
}
