/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 *     |_ Movie
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 9. 22.
 * </pre>
 *
 * @author			: 황진영
 * @version			: 1.0
 */
public class Movie {
		String title;
		int limitAge;

		public Movie(String title, int limitAge) {
			super();
			this.title = title;
			this.limitAge = limitAge;
		}

		public String getTitle() {
			return title;
		}

		public int getLimitAge() {
			return limitAge;
		}
		
}
