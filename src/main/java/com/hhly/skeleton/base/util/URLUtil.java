package com.hhly.skeleton.base.util;

import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public abstract class URLUtil {
	public static String encodeURL(String url) {
		String result = null;
		if (StringUtil.isBlank(url))
			return result;
		try {
			result = URLEncoder.encode(url, "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return result;
	}

	public static String decodeUrl(String url) {
		String result = null;
		if (StringUtil.isBlank(url))
			return result;
		try {
			result = URLDecoder.decode(url, "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return result;
	}

	public static boolean isEncoded(String url) {
		if (StringUtil.isBlank(url))
			return false;

		String str = decodeUrl(url);
		return (!(url.equals(str)));
	}

	public static Map<String, String> getParamMap(String url) {
		if (StringUtil.isBlank(url))
			return null;
		try {
			URL ul = new URL(url);
			String query = ul.getQuery();
			if (StringUtil.isBlank(query))
				return null;

			Map ht = new LinkedHashMap();
			StringTokenizer st = new StringTokenizer(query, "&");
			while (st.hasMoreTokens()) {
				String pair = st.nextToken();
				int pos = pair.indexOf(61);
				if (pos == -1)
					ht.put(pair, "");
				else
					ht.put(pair.substring(0, pos), pair.substring(pos + 1));
			}

			return ht;
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String getParam(String url, String paramName) {
		Map paramMap = getParamMap(url);
		if (ObjectUtil.isBlank(paramMap))
			return null;

		return ((String) paramMap.get(paramName));
	}

	public static String removeParam(String url, String paramName) {
		if (!(containsParam(url, paramName)))
			return url;

		Map paramMap = getParamMap(url);
		paramMap.remove(paramName);
		String path = getFullPath(url);
		return appendParam(path, paramMap);
	}

	public static boolean containsParam(String url, String paramName) {
		Map paramMap = getParamMap(url);
		if (ObjectUtil.isBlank(paramMap))
			return false;

		return paramMap.containsKey(paramName);
	}

	public static String appendOrReplaceParam(String url, String paramName, String paramValue) {
		Map paramMap = getParamMap(url);
		if (ObjectUtil.isBlank(paramMap)) {
			Map param = new HashMap(1);
			param.put(paramName, paramValue);
			return appendParam(url, param);
		}
		paramMap.put(paramName, paramValue);
		String path = getFullPath(url);
		return appendParam(path, paramMap);
	}

	public static String appendOrReplaceParam(String url, Map<String, String> params) {
		Map paramMap = getParamMap(url);
		if (ObjectUtil.isBlank(paramMap))
			return appendParam(url, params);

		paramMap.putAll(params);
		String path = getFullPath(url);
		return appendParam(path, paramMap);
	}

	public static String appendParam(String url, Map<String, String> params) {
		if (StringUtil.isBlank(url))
			return null;

		if (ObjectUtil.isBlank(params))
			return url;

		StringBuffer buffer = new StringBuffer(url);
		if (ObjectUtil.isBlank(getParamMap(url)))
			buffer.append("?");
		else
			buffer.append("&");

		for (Iterator localIterator = params.keySet().iterator(); localIterator.hasNext();) {
			String key = (String) localIterator.next();
			buffer.append(key).append("=").append(params.get(key)).append("&");
		}
		String result = buffer.toString();
		result = result.substring(0, result.length() - 1);
		return result;
	}

	public static String getHost(String url) {
		if (StringUtil.isBlank(url))
			return null;
		try {
			URL ul = new URL(url);
			return ul.getHost();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String getProtocol(String url) {
		if (StringUtil.isBlank(url))
			return null;
		try {
			URL ul = new URL(url);
			return ul.getProtocol();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String getRef(String url) {
		if (StringUtil.isBlank(url))
			return null;
		try {
			URL ul = new URL(url);
			return ul.getRef();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String getPath(String url) {
		if (StringUtil.isBlank(url))
			return null;
		try {
			URL ul = new URL(url);
			return ul.getPath();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String getPort(String url) {
		if (StringUtil.isBlank(url))
			return null;
		try {
			URL ul = new URL(url);
			int port = ul.getPort();
			if (port == -1)
				return null;

			return String.valueOf(port);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String getFullPath(String url) {
		if (StringUtil.isBlank(url))
			return null;

		String protocol = getProtocol(url);
		String host = getHost(url);
		String port = getPort(url);
		String path = getPath(url);
		StringBuffer buffer = new StringBuffer();
		buffer.append(protocol).append("://").append(host);
		if (!(StringUtil.isBlank(port)))
			buffer.append(":").append(port);

		buffer.append(path);
		return buffer.toString();
	}

	public static String getQuery(String url) {
		if (StringUtil.isBlank(url))
			return null;
		try {
			URL ul = new URL(url);
			return ul.getQuery();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String[] getIp(String domain) {
		if (StringUtil.isBlank(domain))
			return null;

		InetAddress[] addresses = null;
		try {
			addresses = InetAddress.getAllByName(domain);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		if (addresses == null)
			return null;

		String[] ips = new String[addresses.length];
		for (int i = 0; i < addresses.length; ++i)
			ips[i] = addresses[i].getHostAddress();

		return ips;
	}

	public static boolean isUrl(String resourceLocation) {
		if (resourceLocation == null)
			return false;
		try {
			new URL(resourceLocation);
			return true;
		} catch (MalformedURLException ex) {
		}
		return false;
	}

	public static String getBasePath(String url) {
		if (StringUtil.isBlank(url))
			return null;

		String protocol = getProtocol(url);
		String host = getHost(url);
		String port = getPort(url);
		StringBuffer buffer = new StringBuffer();
		buffer.append(protocol).append("://").append(host);
		if (!(StringUtil.isBlank(port)))
			buffer.append(":").append(port);

		return buffer.toString();
	}
}