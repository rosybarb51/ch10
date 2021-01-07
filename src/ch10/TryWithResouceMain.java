// 잘 안됨.. 강사님꺼랑 비교하기 
package ch10;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResouceMain {

	public static void main(String[] args) throws Exception {
		
		File file = new File("c:\\java102\\reader.txt");
		
		FileReader fis1 = null;
		FileReader fis2 = null;
//		FileReader fr = null;
		
//		try {
//			fr = new FileReader(file);
//			
//			int i = 0;
//			
//			while ((i = fr.read()) != -1) {
//				System.out.println((char)i);
//			}
			
//			강제로 예외 발생
//			throw new Exception();
		
		try {
			fis1 = new FileInputStream(file);
			fis1.read();
			throw new Exception(); // 강제 오류 발생
		}
		catch (IOException e) {
			System.out.println("일반 예외처리가 실행되었습니다.");
		}
		finally {
			try {
				if (fis1 != null) {
					fis1.close();
				}
			}
			catch (Exception e) {
				System.out.println("finally에서 예외처리가 실행되었습니다.");
			}
		}
		
		System.out.println("\n---- Try With Resource ----\n");

//		try에 ()를 추가하여 해당 괄호 안에 close() 를 사용할 객체를 생성
//		2라인 이상으로 입력할 경ㅇ
//		(
//		FileInputStream fs1 = new FileInputStream();
//		FileInputStream fs2 = new FileInputStream();
//		)
//		형식으로 사용이 가능함
		
		try (FileInputStream fis2 = new FileInputStream(file)) {
			
			fis2.read();
			
			throw new Exception(); // 강제 오류 발생
			
		}
		catch (IOException e) {
			System.out.println("try with resource 예외 처리가 실행되었습니다.");
		}
	}
	

}
















