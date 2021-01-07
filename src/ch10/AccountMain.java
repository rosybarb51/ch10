package ch10;

public class AccountMain {

	public static void main(String[] args) {
		Account acc = new Account();
		
		acc.deposit(10000);
		System.out.println("예금액 : " + acc.getBalance());
		
		try {
			acc.withDraw(30000);
		}
		catch (BalanceException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
//			우리가 printStackTrace()는 만들지 않았지만, 부모 클래스인 Exception에 있기 때문에 사용할 수 있다.
		}
	}

}


// 문제1) 사용자 입력값이 정수가 아닐 경우 예외를 발생시키는 사용자 정의 예외 클래스를 선언하고 해당 예외 클래스를 사용하여 사칙연산을 하는 계산기 프로그램을 작성하세요. 
// 조건1. 예외 클래스를 따로 선언
// 조건2. 계산기 프로그램에서 예외처리 부분이 반드시 필요함

// 문제2) 문제 1의 소스를 예외 던지기를 사용하는 방식으로 수정하세요.


































