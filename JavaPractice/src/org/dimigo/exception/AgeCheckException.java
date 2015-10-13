/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 *     |_ AgeCheckException
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 9. 22.
 * </pre>
 *
 * @author			: 황진영
 * @version			: 1.0
 */
@SuppressWarnings("serial")
public class AgeCheckException extends Exception{
	  
		public AgeCheckException() {
			
		}  
		
		public AgeCheckException(Movie movie) {
			System.out.println(movie.getTitle() + "은 " + movie.getLimitAge() + "세 이용가 입니다.");
		}
		
}
