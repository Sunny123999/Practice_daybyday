package com.lihuan.job.短信推送;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.*;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author 动力思维
 * 动力思维短信接口实现类
 *
 */
public class LxSdkImpl {

	/**
	 * 短信发送
	 * 
	 * @param accName
	 *            乐信账号
	 * @param accPwd
	 *            乐信密码
	 * @param aimcodes
	 *            接收者手机号
	 * @param content
	 *            短信内容(包含内容和签名)
	 * @return
	 */
	private String sendSms(String accName, String accPwd, String aimcodes, String content) {
		try {
			Map<String, String> params = new HashMap<>();
			params.put("accName", accName);
			params.put("accPwd", MD5.getMd5String(accPwd));
			params.put("content", URLEncoder.encode(content,"UTF-8"));
			String url = "https://www.lx598.com/sdk/send";
			params.put("aimcodes",aimcodes);
			params.put("dataType","json");
			String res = post(url,params,"www.lx598.com",80,"UTF-8");
			return res;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

/**
	 * 获取连接
	 * @param urlStr
	 * @param host
	 * @param port
	 * @return
	 */
	public static HttpURLConnection getConnection(String urlStr,String host,int port) {
		HttpURLConnection uc = null;
		try {
			Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(host, port));
			URL url = new URL(urlStr);
			uc = (HttpURLConnection)url.openConnection(proxy);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return uc;
	}

	/**
	 * 使用代理post请求
	 * @param url
	 * @param params
	 * @param host
	 * @param port
	 * @param chart
	 * @return
	 */
	public static String post(String url, Map<String, String> params, String host, int port, String chart) {
		String msg = "";
		try {
			HttpURLConnection httpURLConnection = getConnection(url, host, port);

			//设置是否向connection输出，因为这个是post请求，参数要放在http正文内，因此需要设为true
			httpURLConnection.setDoOutput(true);
			httpURLConnection.setDoInput(true);
			// 默认是 GET方式
			httpURLConnection.setRequestMethod("POST");
			// Post 请求不能使用缓存
			httpURLConnection.setUseCaches(false);
			httpURLConnection.setInstanceFollowRedirects(true);
			httpURLConnection.setRequestProperty("Content-Type",
					"application/x-www-form-urlencoded");
			httpURLConnection.setRequestProperty("contentType", chart);
			//POST请求
			DataOutputStream out = new DataOutputStream(httpURLConnection.getOutputStream());
			StringBuffer params2 = new StringBuffer();
			for (String  key : params.keySet()) {
				params2.append(key).append("=").append(params.get(key)).append("&");
			}
			String paramsStr = params2.toString();
			int len = paramsStr.lastIndexOf("&");
			paramsStr =paramsStr.substring(0, len);
			byte[] bypes = paramsStr.toString().getBytes();
			out.write(bypes);
			out.flush();
			out.close();

			//读取响应
			BufferedReader reader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(),chart));
			String lines;
			StringBuffer sb = new StringBuffer("");
			while ((lines = reader.readLine()) != null) {
				lines = new String(lines.getBytes());
				sb.append(lines);
			}
			msg = sb.toString();
			reader.close();
			// 断开连接
			httpURLConnection.disconnect();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}


	/**
	 * 查询余额
	 * 
	 * @param accName
	 *            乐信账号
	 * @param accPwd
	 *            乐信密码
	 * @return
	 */
	private String qryBalance(String accName, String accPwd) {
		StringBuffer sb = new StringBuffer("http://www.lx598.com/sdk/qryBalance?");
		try {
			sb.append("&accName=" + accName);
			sb.append("&accPwd=" + MD5.getMd5String(accPwd));
			URL url = new URL(sb.toString());
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("POST");
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
			return in.readLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 回复短信查询
	 * 
	 * @param accName
	 *            乐信账号
	 * @param accPwd
	 *            乐信密码
	 * @return
	 */
	private String receiveSms(String accName, String accPwd) {
		StringBuffer sb = new StringBuffer("http://www.lx598.com/sdk/receiveSms?");
		try {
			sb.append("&accName=" + accName);
			sb.append("&accPwd=" + MD5.getMd5String(accPwd));
			URL url = new URL(sb.toString());
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("POST");
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
			return in.readLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 回执报告查询
	 * 
	 * @param accName
	 *            乐信账号
	 * @param accPwd
	 *            乐信密码
	 * @return
	 */
	private String qryReport(String accName, String accPwd) {
		StringBuffer sb = new StringBuffer(" http://sdk.lx198.com/sdk/qryReport?");
		try {
			sb.append("&accName=" + accName);
			sb.append("&accPwd=" + MD5.getMd5String(accPwd));
			URL url = new URL(sb.toString());
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("POST");
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
			return in.readLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}


	
}
