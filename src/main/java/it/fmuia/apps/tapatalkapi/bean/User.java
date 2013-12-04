package it.fmuia.apps.tapatalkapi.bean;

import it.fmuia.apps.tapatalkapi.PropertyName;

import java.util.Arrays;
import java.util.Date;

public class User
{
	/**
	 * Return this user ID.
	 */
	@PropertyName(name = "user_id")
	private String userId;

	/**
	 * Return user's display name if the forum system support display name
	 * feature.
	 */
	@PropertyName(name = "username")
	private String username;

	/**
	 * Return a list of usergroup ID that this user belongs to.
	 */
	@PropertyName(name = "usergroup_id")
	private String[] usergroupId;

	/**
	 * URL ICON
	 */
	@PropertyName(name = "icon_url")
	private String iconUrl;

	/**
	 * email
	 */
	@PropertyName(name = "email")
	private String email;

	/**
	 * Return total number of post of this user
	 */
	@PropertyName(name = "post_count")
	private int postCount;

	/**
	 * This instructs the app to hide the "Messaging" tab so user will not be
	 * able to use the PM features in the app.
	 */
	@PropertyName(name = "can_pm")
	private boolean canPm;

	/**
	 * This instructs the app to disable "Send PM" feature, however it still
	 * allows user to read Private Message, just that the user cannot send
	 * private message.
	 */
	@PropertyName(name = "can_send_pm")
	private boolean canSendPm;

	/**
	 * Return true if this particular user has moderation capability. Moderation
	 * is an extension and not part of the Tapatalk API Level 3
	 */
	@PropertyName(name = "can_moderate")
	private boolean canModerate;

	/**
	 * Return false if users do not have permission to search in this forum
	 */
	@PropertyName(name = "can_search")
	private boolean canSearch;

	/**
	 * Return false if this user does not have permission to see current list of
	 * online user
	 */
	@PropertyName(name = "can_whosonline")
	private boolean canWhosonline;

	/**
	 * Return false if this user does not have permission to user profile page
	 * (get_user_info)
	 */
	@PropertyName(name = "can_profile")
	private boolean canProfile;

	/**
	 * Return true if this user can modify his avatar
	 */
	@PropertyName(name = "can_upload_avatar")
	private boolean canUploadAvatar;

	/**
	 * Return the maximum allowed attachments the user can be uploaded in a
	 * single post. If max_attachment is missing, it assumes the plugin does not
	 * support attachment upload. If a user is restricted from uploading
	 * attachment, it should use the "can_upload" flag in get_topic and
	 * get_thread to determine whether user can upload attachment, regardless
	 * how many attachments user can upload within a single post.
	 */
	@PropertyName(name = "max_attachment")
	private int maxAttachment;

	/**
	 * Return the maximum allowed PNG file size that the user can upload. This
	 * field is used in conjunction with the Attachment section. This number
	 * should be in byte.
	 */
	@PropertyName(name = "max_png_size")
	private int maxPngSize;

	/**
	 * Return the maximum allowed JPEG file size that the user can upload. This
	 * field is used in conjunction with the Attachment section. This number
	 * should be in byte.
	 */
	@PropertyName(name = "max_jpg_size")
	private int maxJpgSize;

	/**
	 * A list of ignored user id, separated with comma. Posts from ignored user
	 * will be hidden in thread list.
	 */
	@PropertyName(name = "ignored_uids")
	private String ignoredUids;

	@PropertyName(name = "push_type")
	private PushType[] pushTipe;

	@PropertyName(name = "ignore_uids")
	private String ignoreUids;

	@PropertyName(name = "user_type")
	private String userType;

	@PropertyName(name = "is_online")
	private boolean isOnline;

	@PropertyName(name = "reg_time")
	private Date regTime;

	@PropertyName(name = "display_text")
	private String display_text;

	@PropertyName(name = "current_activity")
	private String currentActivity;

	@PropertyName(name = "timestamp")
	private String timestamp;

	@PropertyName(name = "current_action")
	private String currentAction;

	@PropertyName(name = "accept_pm")
	private boolean acceptPm;

	@PropertyName(name = "last_activity_time")
	private Date lastActivityTime;

	@PropertyName(name = "timestamp_reg")
	private String timestampReg;

	public String getUserId()
	{
		return userId;
	}

	public void setUserId(String userId)
	{
		this.userId = userId;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String[] getUsergroupId()
	{
		return usergroupId;
	}

	public void setUsergroupId(String[] usergroupId)
	{
		this.usergroupId = usergroupId;
	}

	public String getIconUrl()
	{
		return iconUrl;
	}

	public void setIconUrl(String iconUrl)
	{
		this.iconUrl = iconUrl;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public int getPostCount()
	{
		return postCount;
	}

	public void setPostCount(int postCount)
	{
		this.postCount = postCount;
	}

	public boolean isCanPm()
	{
		return canPm;
	}

	public void setCanPm(boolean canPm)
	{
		this.canPm = canPm;
	}

	public boolean isCanSendPm()
	{
		return canSendPm;
	}

	public void setCanSendPm(boolean canSendPm)
	{
		this.canSendPm = canSendPm;
	}

	public boolean isCanModerate()
	{
		return canModerate;
	}

	public void setCanModerate(boolean canModerate)
	{
		this.canModerate = canModerate;
	}

	public boolean isCanSearch()
	{
		return canSearch;
	}

	public void setCanSearch(boolean canSearch)
	{
		this.canSearch = canSearch;
	}

	public boolean isCanWhosonline()
	{
		return canWhosonline;
	}

	public void setCanWhosonline(boolean canWhosonline)
	{
		this.canWhosonline = canWhosonline;
	}

	public boolean isCanProfile()
	{
		return canProfile;
	}

	public void setCanProfile(boolean canProfile)
	{
		this.canProfile = canProfile;
	}

	public boolean isCanUploadAvatar()
	{
		return canUploadAvatar;
	}

	public void setCanUploadAvatar(boolean canUploadAvatar)
	{
		this.canUploadAvatar = canUploadAvatar;
	}

	public int getMaxAttachment()
	{
		return maxAttachment;
	}

	public void setMaxAttachment(int maxAttachment)
	{
		this.maxAttachment = maxAttachment;
	}

	public int getMaxPngSize()
	{
		return maxPngSize;
	}

	public void setMaxPngSize(int maxPngSize)
	{
		this.maxPngSize = maxPngSize;
	}

	public int getMaxJpgSize()
	{
		return maxJpgSize;
	}

	public void setMaxJpgSize(int maxJpgSize)
	{
		this.maxJpgSize = maxJpgSize;
	}

	public String getIgnoredUids()
	{
		return ignoredUids;
	}

	public void setIgnoredUids(String ignoredUids)
	{
		this.ignoredUids = ignoredUids;
	}

	public PushType[] getPushTipe()
	{
		return pushTipe;
	}

	public void setPushTipe(PushType[] pushTipe)
	{
		this.pushTipe = pushTipe;
	}

	public String getUserType()
	{
		return userType;
	}

	public void setUserType(String userType)
	{
		this.userType = userType;
	}

	public String getIgnoreUids()
	{
		return ignoreUids;
	}

	public void setIgnoreUids(String ignoreUids)
	{
		this.ignoreUids = ignoreUids;
	}

	public boolean isOnline()
	{
		return isOnline;
	}

	public void setOnline(boolean isOnline)
	{
		this.isOnline = isOnline;
	}

	public Date getRegTime()
	{
		return regTime;
	}

	public void setRegTime(Date regTime)
	{
		this.regTime = regTime;
	}

	public String getDisplay_text()
	{
		return display_text;
	}

	public void setDisplay_text(String display_text)
	{
		this.display_text = display_text;
	}

	public String getCurrentActivity()
	{
		return currentActivity;
	}

	public void setCurrentActivity(String currentActivity)
	{
		this.currentActivity = currentActivity;
	}

	public String getTimestamp()
	{
		return timestamp;
	}

	public void setTimestamp(String timestamp)
	{
		this.timestamp = timestamp;
	}

	public String getCurrentAction()
	{
		return currentAction;
	}

	public void setCurrentAction(String currentAction)
	{
		this.currentAction = currentAction;
	}

	public boolean isAcceptPm()
	{
		return acceptPm;
	}

	public void setAcceptPm(boolean acceptPm)
	{
		this.acceptPm = acceptPm;
	}

	public Date getLastActivityTime()
	{
		return lastActivityTime;
	}

	public void setLastActivityTime(Date lastActivityTime)
	{
		this.lastActivityTime = lastActivityTime;
	}

	public String getTimestampReg()
	{
		return timestampReg;
	}

	public void setTimestampReg(String timestampReg)
	{
		this.timestampReg = timestampReg;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("User [userId=");
		builder.append(userId);
		builder.append(", username=");
		builder.append(username);
		builder.append(", usergroupId=");
		builder.append(Arrays.toString(usergroupId));
		builder.append(", iconUrl=");
		builder.append(iconUrl);
		builder.append(", email=");
		builder.append(email);
		builder.append(", postCount=");
		builder.append(postCount);
		builder.append(", canPm=");
		builder.append(canPm);
		builder.append(", canSendPm=");
		builder.append(canSendPm);
		builder.append(", canModerate=");
		builder.append(canModerate);
		builder.append(", canSearch=");
		builder.append(canSearch);
		builder.append(", canWhosonline=");
		builder.append(canWhosonline);
		builder.append(", canProfile=");
		builder.append(canProfile);
		builder.append(", canUploadAvatar=");
		builder.append(canUploadAvatar);
		builder.append(", maxAttachment=");
		builder.append(maxAttachment);
		builder.append(", maxPngSize=");
		builder.append(maxPngSize);
		builder.append(", maxJpgSize=");
		builder.append(maxJpgSize);
		builder.append(", ignoredUids=");
		builder.append(ignoredUids);
		builder.append(", pushTipe=");
		builder.append(Arrays.toString(pushTipe));
		builder.append(", ignoreUids=");
		builder.append(ignoreUids);
		builder.append(", userType=");
		builder.append(userType);
		builder.append(", isOnline=");
		builder.append(isOnline);
		builder.append(", regTime=");
		builder.append(regTime);
		builder.append(", display_text=");
		builder.append(display_text);
		builder.append(", currentActivity=");
		builder.append(currentActivity);
		builder.append(", timestamp=");
		builder.append(timestamp);
		builder.append(", currentAction=");
		builder.append(currentAction);
		builder.append(", acceptPm=");
		builder.append(acceptPm);
		builder.append(", lastActivityTime=");
		builder.append(lastActivityTime);
		builder.append(", timestampReg=");
		builder.append(timestampReg);
		builder.append("]");
		return builder.toString();
	}
}
