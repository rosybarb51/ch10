package ch10;

//import java.io.FileReader;
//import java.io.IOException;
//정확히는 위 두개를 import 해줘야 하는데 그냥 *로 전체 import 하는 게 편하다.
import java.io.*;

public class FileReaderMain {

	public static void main(String[] args) {
//		자바의 특징 : GC가 존재하여 사용되지 않는 변수, 메서드, 클래스, 객체 등을 자동으로 메모리에서 삭제함
//		GC가 동작하지 않는 부분이 존재(하두웨어 리소스, 네트워크 등)
//		->이럴 땐 사용자가 직접 메모리를 해제해야함
//		그래서 fr.close(); 란 부분으로 메모리를 해제해줌.
		
//		File 클래스 : 컴퓨터 내부에 있는 파일을 연결하겠다는 말.
//		File file = new File("C:\\java102\\reader.txt");
//		파일읽어오는 클래스 - 글자 한 자씩 읽어오는 애.
//		FileReader fr = new FileReader(file);
		
//		int i = 0;
		
//		read() : 파일의 문자를 1글자 읽어옴, 읽어올 글자가 없을 경우 -1을 출력
//		while ((i = fr.read()) != -1) {
//			char는 글자 출력, 유니코드로 출력 
//			System.out.print((char)i);
//		}
		
//		사용자가 직접 FileReader의 메모리를 해제함
//		try / catch 문을 사용하지 않았을 경우 오류가 발생하면 FileReader의 객체가 메모리에 살아있음. 왜냐하면 위에서 while 에서 오류가 발생하면 아래의 fr.close()는 실행되지 않으니까.
//		===>그래서 finally를 사용하는 것이다.
//		fr.close();
		
//		아래의 부분은 오류가 날 가능성이 극히 드물기 때문에 try 바깥으로 빼준다.
		File file = new File("C:\\java102\\reader.txt");
		FileReader fr = null;
		
		try {
			fr = new FileReader(file);
			
			int i = 0;
			
			while ((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
//			try 영역에서 오류가 없을 경우 정상적으로 메모리해제가 이루어 지지만, 오류가 발생하면 FileReader가 메모리에서 해제되지 않음.
//			fr.close(); 
		}
		catch (IOException e) {
//			fr.close();
			System.out.println("파일을 읽는 도중 오류가 발생했습니다.");
		}
		finally {
			try {
				if (fr != null) {
					fr.close();
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
























