package it.fmuia.apps.tapatalkapi.bean;

import it.fmuia.apps.tapatalkapi.PropertyName;

public class Config
{
	/**
	 * Forum system version without forum type like 3.0.9 and 4.1.4
	 */
	@PropertyName(name = "sys_version")
	private String sysVersion;

	/**
	 * Tapatalk plugin version. Plugin developers: Set "version=dev" in order to
	 * get your development environment verified by the Tapatalk Network.
	 */
	@PropertyName(name = "version")
	private String version;

	/**
	 * This value is to advise the app the API Level of this mobiquo plugin is
	 * currently at. Tapatalk API is currently at Level 3 ("api_level=3"). If
	 * this name/value pair is missing, the app would fall back to legacy mode
	 * for compatibility purpose. We plan to break the existing API into
	 * multiple levels so developer does not need to implement ALL the
	 * documented API for faster prototyping and improve time-to-market in
	 * phased basis. For plugin developer, please always return this key so the
	 * app will not fall back to legacy mode which may invoke undocumented
	 * functions.
	 */
	@PropertyName(name = "api_level")
	private String apiLevel;

	/**
	 * false: service is not available / true: service is available.
	 * Administrator can turn on/off by adjusting a value in a configuration
	 * file. If administrator set the entire forum system in maintenance mode,
	 * this should override this setting
	 */
	@PropertyName(name = "is_open")
	private boolean isOpen;

	/**
	 * false: guest access is not allowed / true: guess access is allowed.
	 * Administrator can turn on/off by adjusting a value in the configuration
	 * file. If the forum system allows only login user, then the system value
	 * should over this setting
	 */
	@PropertyName(name = "guest_okay")
	private boolean guestOkay;

	/**
	 * Return true to indicate the plugin support report_post function.
	 */
	@PropertyName(name = "report_post")
	private String reportPost;

	/**
	 * Return true to indicate the plugin support report_pm function.
	 */
	@PropertyName(name = "report_pm")
	private String reportPm;

	/**
	 * Please refer to get_thread_by_post for more details. Only use this flag
	 * if the plugin is only API Level 3 but want to enable this feature. This
	 * flag will no longer needed in API Level 4
	 */
	@PropertyName(name = "goto_post")
	private String gotoPost;

	/**
	 * Please refer to get_thread_by_unread for more details. Only use this flag
	 * if the plugin is only API Level 3 but want to enable this feature.
	 */
	@PropertyName(name = "goto_unread")
	private String gotoUnread;

	/**
	 * It should returns "1" or "0". If this key is missing, always assume "1".
	 * This is to indicate if the forum system support function mark_all_as_read
	 * . E.g. bbPress do not have read/unread function hence missing this
	 * functionality.
	 */
	@PropertyName(name = "mark_read")
	private String markRead = "1";

	/**
	 * It should returns "1" or "0". If this key is missing, always assume "0".
	 * This is to indicate if function mark_all_as_read can accept a parameter
	 * as forum id to mark a specified forum as read. Please refer to
	 * mark_all_as_read for more details. Only use this flag if the plugin is
	 * only API Level 3 but want to enable this feature.
	 */
	@PropertyName(name = "mark_forum")
	private String markForum = "0";

	/**
	 * It should returns "1" or "0". If this key is missing, always assume "0".
	 * Please refer to reply_post and save_raw_post for more details. Only use
	 * this flag if the plugin is only API Level 3 but want to enable this
	 * feature.
	 */
	@PropertyName(name = "no_refresh_on_post")
	private String noRefreshOnPost = "0";

	/**
	 * It should returns "1" or "0". If this key is missing, always assume "1".
	 * This is to indicate this forum system supports "Sub-Forum Subscription"
	 * feature. Please refer to get_subscribed_forum for more details
	 */
	@PropertyName(name = "subscribe_forum")
	private String subscribeForum = "1";

	/**
	 * It should returns "1" or "0". If this key is missing, always assume "0".
	 * This is to indicate this forum system does not support "get_latest_topic"
	 * function. Please refer to get_latest_topic for more details Please refer
	 * to get_latest_topic for more details
	 */
	@PropertyName(name = "get_latest_topic")
	private String getLatestTopic = "0";

	/**
	 * It should returns "1" or "0". If this key is missing, always assume "0".
	 * This is to indicate this forum system does not support get_id_by_url
	 * function. Please refer to get_id_by_url for more details
	 */
	@PropertyName(name = "get_id_by_url")
	private String getIdByUrl = "0";

	/**
	 * Return true if the plugin support a delete reason parameter. Please refer
	 * to m_delete_post and m_delete_topic .
	 */
	@PropertyName(name = "delete_reason")
	private String deleteReason;

	/**
	 * Returns "1" if supported. This is to indicate this forum system supports
	 * a centralized view to list all topics / posts pending to be approved.
	 * Please refer to m_get_moderate_topic for more details
	 */
	@PropertyName(name = "m_approve")
	private String mApprove;

	/**
	 * Returns "1" if supported. This is to indicate this forum system supports
	 * a centralized view to list all topics / posts that has been soft-deleted,
	 * allowing moderator to undelete topics / posts. Please refer to
	 * m_get_delete_topic for more details
	 */
	@PropertyName(name = "m_delete")
	private String mDelete;

	/**
	 * Returns "1" if supported. This is to indicate this forum system supports
	 * a centralized view to list all topics / posts that have been reported by
	 * the users and need moderator attention. Please refer to m_get_report for
	 * more details
	 */
	@PropertyName(name = "m_report")
	private String mReport;

	/**
	 * Returns "1" if guest user can search in this forum without logging in.
	 * This is helpful as the app can enable search function under guest mode
	 */
	@PropertyName(name = "guest_search")
	private String guestSearch;

	/**
	 * Return 1 if plugin support anonymous login. Check function login for
	 * details.
	 */
	@PropertyName(name = "anonymous")
	private String anonymous;

	/**
	 * Return "1" if guest user can see who is currently online
	 */
	@PropertyName(name = "guest_whosonline")
	private String guestWhosOnline;

	/**
	 * Return "1" if search-related function like get_latest_topic /
	 * get_unread_topic / get_participated_topic / search_topic / search_post
	 * can support searchid pagination.
	 */
	@PropertyName(name = "searchid")
	private String searchId;

	/**
	 * Return "1" if the plugin support get user avatar by avatar.php entry
	 * file. Please refer to avatar.php for more details
	 */
	@PropertyName(name = "avatar")
	private String avatar;

	/**
	 * Return "1" if get_box support pagination.
	 */
	@PropertyName(name = "pm_load")
	private String pm_load;

	/**
	 * Return "1" if get_subscribed_topic support pagination.
	 */
	@PropertyName(name = "subscribe_load")
	private String subscribeLoad;

	/**
	 * Minimum string length for search_topic / search_post / search within
	 * forum.
	 */
	@PropertyName(name = "min_search_length")
	private int minSearchLength;

	/**
	 * Return "1" if the plugin support pm and subscribed topic unread number
	 * since last check time. For more, please check function get_inbox_stat
	 */
	@PropertyName(name = "inbox_stat")
	private String inboxStat;

	/**
	 * Return 1 if the plugin support multi quote. Check more in get_quote_post
	 */
	@PropertyName(name = "multi_quote")
	private String multiQuote;

	/**
	 * Forum default smilie set support. If set to "0" To indicate this forum
	 * has turned off default smilies support.
	 */
	@PropertyName(name = "default_smilies")
	private String defaultSmilies;

	/**
	 * It should returns "1" or "0". If this key is missing, always assume "1".
	 * If it set to "0", indicate this forum does not support Unread feature.
	 * E.g. bbPress 1.1 does not have Unread feature so app side need to hide
	 * all the related functions.
	 */
	@PropertyName(name = "can_unread")
	private String canUnread = "1";

	/**
	 * It should returns "1" or "0". If this key is missing, always assume "1".
	 * This instructs the app to hide/show the "Announcement" tab in topic view
	 */
	@PropertyName(name = "announcement")
	private String announcement = "1";

	/**
	 * Return 1 to indicate the plugin contains emoji package
	 */
	@PropertyName(name = "emoji")
	private String emoji;

	/**
	 * Return 1 to indicate the plugin support md5 password. Like in vbulletin
	 * plugin
	 */
	@PropertyName(name = "support_md5")
	private String supportMd5;

	/**
	 * Return 1 to indicate the plugin support sha1 password. (To be implemented
	 * in app)
	 */
	@PropertyName(name = "support_sha1")
	private String supportSha1;

	/**
	 * Return 1 if the plugin support conversation pm (currently only Xenforo
	 * plugin support conversation pm. IPB plugin should support it later.
	 */
	@PropertyName(name = "conversation")
	private String conversation;

	/**
	 * Return 1 if the plugin support function get_forum with two parameters for
	 * description control and sub forum id filter.
	 */
	@PropertyName(name = "get_forum")
	private String getForum;

	/**
	 * Return 1 if the plugin support function get_topic_status
	 */
	@PropertyName(name = "get_topic_status")
	private String getTopicStatus;

	/**
	 * Return 1 if the plugin support function get_participated_forum
	 */
	@PropertyName(name = "get_participated_forum")
	private String getParticipatedForum;

	/**
	 * Return 1 if the plugin support function get_forum_status
	 */
	@PropertyName(name = "get_forum_status")
	private String getForumStatus;

	/**
	 * Return 1 if the plugin support function get_smilies
	 */
	@PropertyName(name = "get_smilies")
	private String getSmilies;

	/**
	 * Return 1 if the plugin support get_online_users with forum and thread
	 * filter, and also pagination
	 */
	@PropertyName(name = "advanced_online_users")
	private String advancedOnlineUsers;

	/**
	 * Return 1 if the plugin support function mark_pm_unread or
	 * mark_conversation_unread
	 */
	@PropertyName(name = "mark_pm_unread")
	private String markPmUnread;

	/**
	 * Return 1 if the plugin support function search
	 */
	@PropertyName(name = "advanced_search")
	private String advancedSearch;

	/**
	 * Return 1 if the plugin support id 'ALL' in unsubscribe_topic /
	 * unsubscribe_forum
	 */
	@PropertyName(name = "massSubscribe")
	private String mass_subscribe;

	/**
	 * Indicate the function get_participated_topic / get_user_info /
	 * get_user_topic / get_user_reply_post support request with user id.
	 */
	@PropertyName(name = "user_id")
	private String userId;

	/**
	 * Return '1' if the plugin support both soft and hard delete.
	 */
	@PropertyName(name = "advanced_delete")
	private String advancedDelete;

	/**
	 * Return 1 if the plugin support function mark_topic_read
	 */
	@PropertyName(name = "markTopicRead")
	private String mark_topic_read;

	/**
	 * returns "0" if this forum system does not support First Unread feature.
	 * Assume "1" if missing.
	 */
	@PropertyName(name = "first_unread")
	private String firstUnread = "1";

	/**
	 * Indicate if the plugin support function get_alert
	 */
	@PropertyName(name = "alert")
	private String alert;

	/**
	 * Indicate if user can unsubscribe_topic / unsubscribe_forum with
	 * subscribed id, not topic/forum id.
	 */
	@PropertyName(name = "direct_unsubscribe")
	private String directUnsubscribe;

	/**
	 * Indicate if the plugin support function get_activity
	 */
	@PropertyName(name = "get_activity")
	private String getActivity;

	/**
	 * Supported push
	 */
	@PropertyName(name = "push")
	private Integer push;

	/**
	 * Supported push type, joined with ','.
	 * Sample:ann,conv,pm,sub,like,thank,quote,newtopic,tag
	 */
	@PropertyName(name = "push_type")
	private String pushType;

	/**
	 * return 1 if plugin support prefix update in function m_rename_topic
	 */
	@PropertyName(name = "prefix_edit")
	private String prefixEdit;

	/**
	 * Indicate if mod can delete user's post/topic when do ban and how the
	 * content will be deleted. Optional type: soft_delete, hard_delete,
	 * unapprove, none. 'none' means mod can not update user's post/topic status
	 * when do ban
	 */
	@PropertyName(name = "ban_delete_type")
	private String banDeleteType;

	/**
	 * Indicate if plugin support anonymous login
	 */
	@PropertyName(name = "anonymous_login")
	private String anonymousLogin;

	/**
	 * Return 1 to indicate plugin support search_user function
	 */
	@PropertyName(name = "search_user")
	private String searchUser;

	/**
	 * Return 1 to indicate plugin support get_recommended_user function
	 */
	@PropertyName(name = "user_recommended")
	private String userRecommended;

	/**
	 * Indicate if account related functions are supported ot not. Including
	 * forget_password , update_password , update_email , register
	 */
	@PropertyName(name = "inappreg")
	private String inAppReg;

	/**
	 * indicate function sign_in, prefetch_account, login status return was
	 * supported or not
	 */
	@PropertyName(name = "inappsignin")
	private String inAppSignin;

	/**
	 * Indicate if the plugin support function ignore_user
	 */
	@PropertyName(name = "ignore_user")
	private String ignoreUser;

	@PropertyName(name = "disable_subscribe_forum")
	private String disableSubscribeForum;

	@PropertyName(name = "reg_url")
	private String regUrl;

	@PropertyName(name = "hide_forum_id")
	private String hideForumId;

	@PropertyName(name = "mod_report")
	private String modReport;

	@PropertyName(name = "charset")
	private String charset;

	@PropertyName(name = "forum_signature")
	private String forumSignature;

	@PropertyName(name = "stats")
	private Stats stats;

	@PropertyName(name = "get_online_users")
	private String getOnlineUsers;

	@PropertyName(name = "mod_delete")
	private String modDelete;

	@PropertyName(name = "mod_approve")
	private String modApprove;

	@PropertyName(name = "sign_in")
	private String signIn;

	@PropertyName(name = "disable_bbcode")
	private String disableBBcode;

	@PropertyName(name = "allow_moderate")
	private String allowModerate;

	public String getSysVersion()
	{
		return sysVersion;
	}

	public void setSysVersion(String sysVersion)
	{
		this.sysVersion = sysVersion;
	}

	public String getVersion()
	{
		return version;
	}

	public void setVersion(String version)
	{
		this.version = version;
	}

	public String getApiLevel()
	{
		return apiLevel;
	}

	public void setApiLevel(String apiLevel)
	{
		this.apiLevel = apiLevel;
	}

	public boolean isOpen()
	{
		return isOpen;
	}

	public void setOpen(boolean isOpen)
	{
		this.isOpen = isOpen;
	}

	public boolean isGuestOkay()
	{
		return guestOkay;
	}

	public void setGuestOkay(boolean guestOkay)
	{
		this.guestOkay = guestOkay;
	}

	public String getReportPost()
	{
		return reportPost;
	}

	public void setReportPost(String reportPost)
	{
		this.reportPost = reportPost;
	}

	public String getReportPm()
	{
		return reportPm;
	}

	public void setReportPm(String reportPm)
	{
		this.reportPm = reportPm;
	}

	public String getGotoPost()
	{
		return gotoPost;
	}

	public void setGotoPost(String gotoPost)
	{
		this.gotoPost = gotoPost;
	}

	public String getGotoUnread()
	{
		return gotoUnread;
	}

	public void setGotoUnread(String gotoUnread)
	{
		this.gotoUnread = gotoUnread;
	}

	public String getMarkRead()
	{
		return markRead;
	}

	public void setMarkRead(String markRead)
	{
		this.markRead = markRead;
	}

	public String getMarkForum()
	{
		return markForum;
	}

	public void setMarkForum(String markForum)
	{
		this.markForum = markForum;
	}

	public String getNoRefreshOnPost()
	{
		return noRefreshOnPost;
	}

	public void setNoRefreshOnPost(String noRefreshOnPost)
	{
		this.noRefreshOnPost = noRefreshOnPost;
	}

	public String getSubscribeForum()
	{
		return subscribeForum;
	}

	public void setSubscribeForum(String subscribeForum)
	{
		this.subscribeForum = subscribeForum;
	}

	public String getGetLatestTopic()
	{
		return getLatestTopic;
	}

	public void setGetLatestTopic(String getLatestTopic)
	{
		this.getLatestTopic = getLatestTopic;
	}

	public String getGetIdByUrl()
	{
		return getIdByUrl;
	}

	public void setGetIdByUrl(String getIdByUrl)
	{
		this.getIdByUrl = getIdByUrl;
	}

	public String getDeleteReason()
	{
		return deleteReason;
	}

	public void setDeleteReason(String deleteReason)
	{
		this.deleteReason = deleteReason;
	}

	public String getmApprove()
	{
		return mApprove;
	}

	public void setmApprove(String mApprove)
	{
		this.mApprove = mApprove;
	}

	public String getmDelete()
	{
		return mDelete;
	}

	public void setmDelete(String mDelete)
	{
		this.mDelete = mDelete;
	}

	public String getmReport()
	{
		return mReport;
	}

	public void setmReport(String mReport)
	{
		this.mReport = mReport;
	}

	public String getGuestSearch()
	{
		return guestSearch;
	}

	public void setGuestSearch(String guestSearch)
	{
		this.guestSearch = guestSearch;
	}

	public String getAnonymous()
	{
		return anonymous;
	}

	public void setAnonymous(String anonymous)
	{
		this.anonymous = anonymous;
	}

	public String getGuestWhosOnline()
	{
		return guestWhosOnline;
	}

	public void setGuestWhosOnline(String guestWhosOnline)
	{
		this.guestWhosOnline = guestWhosOnline;
	}

	public String getSearchId()
	{
		return searchId;
	}

	public void setSearchId(String searchId)
	{
		this.searchId = searchId;
	}

	public String getAvatar()
	{
		return avatar;
	}

	public void setAvatar(String avatar)
	{
		this.avatar = avatar;
	}

	public String getPm_load()
	{
		return pm_load;
	}

	public void setPm_load(String pm_load)
	{
		this.pm_load = pm_load;
	}

	public String getSubscribeLoad()
	{
		return subscribeLoad;
	}

	public void setSubscribeLoad(String subscribeLoad)
	{
		this.subscribeLoad = subscribeLoad;
	}

	public int getMinSearchLength()
	{
		return minSearchLength;
	}

	public void setMinSearchLength(int minSearchLength)
	{
		this.minSearchLength = minSearchLength;
	}

	public String getInboxStat()
	{
		return inboxStat;
	}

	public void setInboxStat(String inboxStat)
	{
		this.inboxStat = inboxStat;
	}

	public String getMultiQuote()
	{
		return multiQuote;
	}

	public void setMultiQuote(String multiQuote)
	{
		this.multiQuote = multiQuote;
	}

	public String getDefaultSmilies()
	{
		return defaultSmilies;
	}

	public void setDefaultSmilies(String defaultSmilies)
	{
		this.defaultSmilies = defaultSmilies;
	}

	public String getCanUnread()
	{
		return canUnread;
	}

	public void setCanUnread(String canUnread)
	{
		this.canUnread = canUnread;
	}

	public String getAnnouncement()
	{
		return announcement;
	}

	public void setAnnouncement(String announcement)
	{
		this.announcement = announcement;
	}

	public String getEmoji()
	{
		return emoji;
	}

	public void setEmoji(String emoji)
	{
		this.emoji = emoji;
	}

	public String getSupportMd5()
	{
		return supportMd5;
	}

	public void setSupportMd5(String supportMd5)
	{
		this.supportMd5 = supportMd5;
	}

	public String getSupportSha1()
	{
		return supportSha1;
	}

	public void setSupportSha1(String supportSha1)
	{
		this.supportSha1 = supportSha1;
	}

	public String getConversation()
	{
		return conversation;
	}

	public void setConversation(String conversation)
	{
		this.conversation = conversation;
	}

	public String getGetForum()
	{
		return getForum;
	}

	public void setGetForum(String getForum)
	{
		this.getForum = getForum;
	}

	public String getGetTopicStatus()
	{
		return getTopicStatus;
	}

	public void setGetTopicStatus(String getTopicStatus)
	{
		this.getTopicStatus = getTopicStatus;
	}

	public String getGetParticipatedForum()
	{
		return getParticipatedForum;
	}

	public void setGetParticipatedForum(String getParticipatedForum)
	{
		this.getParticipatedForum = getParticipatedForum;
	}

	public String getGetForumStatus()
	{
		return getForumStatus;
	}

	public void setGetForumStatus(String getForumStatus)
	{
		this.getForumStatus = getForumStatus;
	}

	public String getGetSmilies()
	{
		return getSmilies;
	}

	public void setGetSmilies(String getSmilies)
	{
		this.getSmilies = getSmilies;
	}

	public String getAdvancedOnlineUsers()
	{
		return advancedOnlineUsers;
	}

	public void setAdvancedOnlineUsers(String advancedOnlineUsers)
	{
		this.advancedOnlineUsers = advancedOnlineUsers;
	}

	public String getMarkPmUnread()
	{
		return markPmUnread;
	}

	public void setMarkPmUnread(String markPmUnread)
	{
		this.markPmUnread = markPmUnread;
	}

	public String getAdvancedSearch()
	{
		return advancedSearch;
	}

	public void setAdvancedSearch(String advancedSearch)
	{
		this.advancedSearch = advancedSearch;
	}

	public String getMass_subscribe()
	{
		return mass_subscribe;
	}

	public void setMass_subscribe(String mass_subscribe)
	{
		this.mass_subscribe = mass_subscribe;
	}

	public String getUserId()
	{
		return userId;
	}

	public void setUserId(String userId)
	{
		this.userId = userId;
	}

	public String getAdvancedDelete()
	{
		return advancedDelete;
	}

	public void setAdvancedDelete(String advancedDelete)
	{
		this.advancedDelete = advancedDelete;
	}

	public String getMark_topic_read()
	{
		return mark_topic_read;
	}

	public void setMark_topic_read(String mark_topic_read)
	{
		this.mark_topic_read = mark_topic_read;
	}

	public String getFirstUnread()
	{
		return firstUnread;
	}

	public void setFirstUnread(String firstUnread)
	{
		this.firstUnread = firstUnread;
	}

	public String getAlert()
	{
		return alert;
	}

	public void setAlert(String alert)
	{
		this.alert = alert;
	}

	public String getDirectUnsubscribe()
	{
		return directUnsubscribe;
	}

	public void setDirectUnsubscribe(String directUnsubscribe)
	{
		this.directUnsubscribe = directUnsubscribe;
	}

	public String getGetActivity()
	{
		return getActivity;
	}

	public void setGetActivity(String getActivity)
	{
		this.getActivity = getActivity;
	}

	public String getPushType()
	{
		return pushType;
	}

	public void setPushType(String pushType)
	{
		this.pushType = pushType;
	}

	public String getPrefixEdit()
	{
		return prefixEdit;
	}

	public void setPrefixEdit(String prefixEdit)
	{
		this.prefixEdit = prefixEdit;
	}

	public String getBanDeleteType()
	{
		return banDeleteType;
	}

	public void setBanDeleteType(String banDeleteType)
	{
		this.banDeleteType = banDeleteType;
	}

	public String getAnonymousLogin()
	{
		return anonymousLogin;
	}

	public void setAnonymousLogin(String anonymousLogin)
	{
		this.anonymousLogin = anonymousLogin;
	}

	public String getSearchUser()
	{
		return searchUser;
	}

	public void setSearchUser(String searchUser)
	{
		this.searchUser = searchUser;
	}

	public String getUserRecommended()
	{
		return userRecommended;
	}

	public void setUserRecommended(String userRecommended)
	{
		this.userRecommended = userRecommended;
	}

	public String getInAppReg()
	{
		return inAppReg;
	}

	public void setInAppReg(String inAppReg)
	{
		this.inAppReg = inAppReg;
	}

	public String getInAppSignin()
	{
		return inAppSignin;
	}

	public void setInAppSignin(String inAppSignin)
	{
		this.inAppSignin = inAppSignin;
	}

	public String getIgnoreUser()
	{
		return ignoreUser;
	}

	public void setIgnoreUser(String ignoreUser)
	{
		this.ignoreUser = ignoreUser;
	}

	public Integer getPush()
	{
		return push;
	}

	public void setPush(Integer push)
	{
		this.push = push;
	}

	public String getDisableSubscribeForum()
	{
		return disableSubscribeForum;
	}

	public void setDisableSubscribeForum(String disableSubscribeForum)
	{
		this.disableSubscribeForum = disableSubscribeForum;
	}

	public String getRegUrl()
	{
		return regUrl;
	}

	public void setRegUrl(String regUrl)
	{
		this.regUrl = regUrl;
	}

	public String getHideForumId()
	{
		return hideForumId;
	}

	public void setHideForumId(String hideForumId)
	{
		this.hideForumId = hideForumId;
	}

	public String getModReport()
	{
		return modReport;
	}

	public void setModReport(String modReport)
	{
		this.modReport = modReport;
	}

	public String getCharset()
	{
		return charset;
	}

	public void setCharset(String charset)
	{
		this.charset = charset;
	}

	public String getForumSignature()
	{
		return forumSignature;
	}

	public void setForumSignature(String forumSignature)
	{
		this.forumSignature = forumSignature;
	}

	public Stats getStats()
	{
		return stats;
	}

	public void setStats(Stats stats)
	{
		this.stats = stats;
	}

	public String getGetOnlineUsers()
	{
		return getOnlineUsers;
	}

	public void setGetOnlineUsers(String getOnlineUsers)
	{
		this.getOnlineUsers = getOnlineUsers;
	}

	public String getModDelete()
	{
		return modDelete;
	}

	public void setModDelete(String modDelete)
	{
		this.modDelete = modDelete;
	}

	public String getModApprove()
	{
		return modApprove;
	}

	public void setModApprove(String modApprove)
	{
		this.modApprove = modApprove;
	}

	public String getSignIn()
	{
		return signIn;
	}

	public void setSignIn(String signIn)
	{
		this.signIn = signIn;
	}

	public String getDisableBBcode()
	{
		return disableBBcode;
	}

	public void setDisableBBcode(String disableBBcode)
	{
		this.disableBBcode = disableBBcode;
	}

	public String getAllowModerate()
	{
		return allowModerate;
	}

	public void setAllowModerate(String allowModerate)
	{
		this.allowModerate = allowModerate;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Config [sysVersion=");
		builder.append(sysVersion);
		builder.append(", version=");
		builder.append(version);
		builder.append(", apiLevel=");
		builder.append(apiLevel);
		builder.append(", isOpen=");
		builder.append(isOpen);
		builder.append(", guestOkay=");
		builder.append(guestOkay);
		builder.append(", reportPost=");
		builder.append(reportPost);
		builder.append(", reportPm=");
		builder.append(reportPm);
		builder.append(", gotoPost=");
		builder.append(gotoPost);
		builder.append(", gotoUnread=");
		builder.append(gotoUnread);
		builder.append(", markRead=");
		builder.append(markRead);
		builder.append(", markForum=");
		builder.append(markForum);
		builder.append(", noRefreshOnPost=");
		builder.append(noRefreshOnPost);
		builder.append(", subscribeForum=");
		builder.append(subscribeForum);
		builder.append(", getLatestTopic=");
		builder.append(getLatestTopic);
		builder.append(", getIdByUrl=");
		builder.append(getIdByUrl);
		builder.append(", deleteReason=");
		builder.append(deleteReason);
		builder.append(", mApprove=");
		builder.append(mApprove);
		builder.append(", mDelete=");
		builder.append(mDelete);
		builder.append(", mReport=");
		builder.append(mReport);
		builder.append(", guestSearch=");
		builder.append(guestSearch);
		builder.append(", anonymous=");
		builder.append(anonymous);
		builder.append(", guestWhosOnline=");
		builder.append(guestWhosOnline);
		builder.append(", searchId=");
		builder.append(searchId);
		builder.append(", avatar=");
		builder.append(avatar);
		builder.append(", pm_load=");
		builder.append(pm_load);
		builder.append(", subscribeLoad=");
		builder.append(subscribeLoad);
		builder.append(", minSearchLength=");
		builder.append(minSearchLength);
		builder.append(", inboxStat=");
		builder.append(inboxStat);
		builder.append(", multiQuote=");
		builder.append(multiQuote);
		builder.append(", defaultSmilies=");
		builder.append(defaultSmilies);
		builder.append(", canUnread=");
		builder.append(canUnread);
		builder.append(", announcement=");
		builder.append(announcement);
		builder.append(", emoji=");
		builder.append(emoji);
		builder.append(", supportMd5=");
		builder.append(supportMd5);
		builder.append(", supportSha1=");
		builder.append(supportSha1);
		builder.append(", conversation=");
		builder.append(conversation);
		builder.append(", getForum=");
		builder.append(getForum);
		builder.append(", getTopicStatus=");
		builder.append(getTopicStatus);
		builder.append(", getParticipatedForum=");
		builder.append(getParticipatedForum);
		builder.append(", getForumStatus=");
		builder.append(getForumStatus);
		builder.append(", getSmilies=");
		builder.append(getSmilies);
		builder.append(", advancedOnlineUsers=");
		builder.append(advancedOnlineUsers);
		builder.append(", markPmUnread=");
		builder.append(markPmUnread);
		builder.append(", advancedSearch=");
		builder.append(advancedSearch);
		builder.append(", mass_subscribe=");
		builder.append(mass_subscribe);
		builder.append(", userId=");
		builder.append(userId);
		builder.append(", advancedDelete=");
		builder.append(advancedDelete);
		builder.append(", mark_topic_read=");
		builder.append(mark_topic_read);
		builder.append(", firstUnread=");
		builder.append(firstUnread);
		builder.append(", alert=");
		builder.append(alert);
		builder.append(", directUnsubscribe=");
		builder.append(directUnsubscribe);
		builder.append(", getActivity=");
		builder.append(getActivity);
		builder.append(", push=");
		builder.append(push);
		builder.append(", pushType=");
		builder.append(pushType);
		builder.append(", prefixEdit=");
		builder.append(prefixEdit);
		builder.append(", banDeleteType=");
		builder.append(banDeleteType);
		builder.append(", anonymousLogin=");
		builder.append(anonymousLogin);
		builder.append(", searchUser=");
		builder.append(searchUser);
		builder.append(", userRecommended=");
		builder.append(userRecommended);
		builder.append(", inAppReg=");
		builder.append(inAppReg);
		builder.append(", inAppSignin=");
		builder.append(inAppSignin);
		builder.append(", ignoreUser=");
		builder.append(ignoreUser);
		builder.append(", disableSubscribeForum=");
		builder.append(disableSubscribeForum);
		builder.append(", regUrl=");
		builder.append(regUrl);
		builder.append(", hideForumId=");
		builder.append(hideForumId);
		builder.append(", modReport=");
		builder.append(modReport);
		builder.append(", charset=");
		builder.append(charset);
		builder.append(", forumSignature=");
		builder.append(forumSignature);
		builder.append(", stats=");
		builder.append(stats);
		builder.append(", getOnlineUsers=");
		builder.append(getOnlineUsers);
		builder.append(", modDelete=");
		builder.append(modDelete);
		builder.append(", modApprove=");
		builder.append(modApprove);
		builder.append(", signIn=");
		builder.append(signIn);
		builder.append(", disableBBcode=");
		builder.append(disableBBcode);
		builder.append(", allowModerate=");
		builder.append(allowModerate);
		builder.append("]");
		return builder.toString();
	}

}
