/*
 * @author Kamal
 * 
 * @since 2021
 * 
 * @version 1.0
 */
package com.cricket.commons.utils;

public final class Constant {

	/** The device type. */
	public static final String DEVICE_TYPE = "DEVICE-TYPE";

	/** The app version. */
	public static final String APP_VERSION = "VER";

	/** The seperator. */
	public static final String PIPE_SEPERATOR = "|";

	public static final String COMMA_SEPERATOR = ",";

	/** The upload path. */
	public static final String UPLOAD_PATH = "/uploads";

	/** The upload path. */
	public static final String CANNED_PATH = "/canned";

	/** The file upload api path. */
	public static final String[] FILE_UPLOAD_API_PATH = { UPLOAD_PATH };

	/** The Request id. */
	public static final String REQUEST_ID = "SessionId";

	/** The Request key. */
	public static final String REQUEST_KEY = "SessionKey";

	public static final String TIMEZONE = "UTC";

	public static final String DATE_PATTEREN_WITHOUT_UTC = "MM-dd-yyyy HH:mm:ss";

	public static final String DATE_PATTEREN = DATE_PATTEREN_WITHOUT_UTC + " SSS Z";

}
