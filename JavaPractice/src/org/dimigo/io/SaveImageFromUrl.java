/**
 * 
 */
package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/**
 * <pre>
 * org.dimigo.io
 *     |_ SaveImageFromUrl
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 10. 22.
 * </pre>
 *
 * @author			: 황진영
 * @version			: 1.0
 */
public class SaveImageFromUrl {
	
	public static void main(String[] args) {
		
		String imageUrl = "http://img.naver.net/static/www/u/2013/0731/nmms_224940510.gif";
		
		try {
			URL url = new URL(imageUrl);
			
			InputStream is = url.openStream();
			OutputStream os = new FileOutputStream("files/logo.png");
			
			//파일에 write하기
			int result;
			byte[] buf = new byte[100];
			
			while((result = is.read(buf)) != -1) {
				os.write(buf, 0, result);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
