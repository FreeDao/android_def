package com.wi360.mobile.wallet.https;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IoUtil {
	/**
	 * @param is
	 * @return inputStream到String
	 * @throws IOException
	 */
	public static String convertStreamToString(InputStream is) throws IOException {
		if (is != null) {
			StringBuilder sb = new StringBuilder();
			String line;
			try {
				// BufferedReader reader = new BufferedReader(new InputStreamReader(is, "gbk"));
				BufferedReader reader = new BufferedReader(new InputStreamReader(is));
				while ((line = reader.readLine()) != null) {
					// sb.append(line);
					sb.append(line).append("\n");
				}
			} finally {
				is.close();
			}
			return sb.toString();
		} else {
			return "";
		}
	}
}
