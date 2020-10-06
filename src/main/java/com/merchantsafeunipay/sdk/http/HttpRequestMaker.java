package com.merchantsafeunipay.sdk.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Map;

public class HttpRequestMaker {
	private String urlStr = null;
	private String responseData = null;

	public HttpRequestMaker(String url) {
		this.urlStr = url;
	}

	public String send(Map<String, String> requestBody) {
		OutputStreamWriter writer = null;
		BufferedReader rd = null;
		StringBuilder responseBuilder = new StringBuilder();
		try {
			StringBuffer buffer = new StringBuffer();
			requestBody.forEach((k, v) -> {
				buffer.append(urlEncode(k));
				buffer.append("=");
				if (v == null) {
					v = "";
				}
				buffer.append(urlEncode(v));
				buffer.append("&");
			});
			URL url = new URL(urlStr);
			URLConnection conn = url.openConnection();
			conn.setDoOutput(true);
			writer = new OutputStreamWriter(conn.getOutputStream(), "UTF-8");
			writer.write(buffer.toString());
			writer.flush();
			// Get the response
			rd = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
			String line;
			while ((line = rd.readLine()) != null) {
				responseBuilder.append(line);
			}
			this.responseData = responseBuilder.toString();
		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			if (rd != null) {
				try {
					rd.close();
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		}
		return responseBuilder.toString();
	}

	private String urlEncode(String input) {
		try {
			return URLEncoder.encode(input, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}

	public String getResponseData() {
		return this.responseData;
	}
}