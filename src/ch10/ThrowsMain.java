// 잘 안됨... 강사님꺼랑 비교하기..
package ch10;

public class ThrowsMain {

	public static void main(String[] args) throws ClassNotFoundException {
//		만약 main 메서드에서도 throws 를 사용 시 JVM에서 오류를 처리함
		findClass();
		try {
//			findClass() 를 호출한 main 메서드에서 try/catch 를 사용하여 예외처리를 해줌.
			findClass(); 
			method1();
		}
		catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다. (main 메서드에서 오류처리)");
		}
		catch (NullPointerException e) {
			System.out.println("변환할 수 없습니다.(main 메서드에서 오류처리");
		}
	}
	public static void findClass() throws ClassNotFoundException {
//		예외가 발생하는 영역에 직접 try/catch를 사용하여 예외처리를 해야하지만(맨 아래처럼..) throws를 사용하게 되면 해당 메서드를 호출한 곳에서 try/catch를 사용하여 예외 처리를 할 수 있음
		Class clazz = Class.forName("java.lang.String2"); //일부러 String2라고 오류내게 함 
		
//		try {
//			Class clazz = Class.forName("java.lang.String");
//		} catch (ClassNotFoundException e) {
//			System.out.println("클래스가 존재하지 않습니다. (findClass에서 오류처리)");
//		}
	}
	
	public static void method1(String data) throws NullPointerException {
		String data = null;
		System.out.println(data.toString());
	}

}
