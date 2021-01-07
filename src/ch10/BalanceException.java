// 이 부분 혼자 만들 수 있을까? 연습하자. 

package ch10;

// 사용자 정의 예외 클래스 선언
// Exception 클래스를 상속한 사용 정의 예외 클래스
public class BalanceException extends Exception {
//	생성자 2개 필요
//	기본 생성자, 매개변수가 있는 생성자
//	우리가 이름 지정해서 예외 만든 거임. 
	public BalanceException() {
		
	}
	
	public BalanceException(String message) {
		super(message);
//		여기서 super는 Exception 클래스임. 부모 클래스
//		호출하면서 우리가 입력한 message를 집어넣음
	}
}
