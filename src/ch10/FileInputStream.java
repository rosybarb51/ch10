package ch10;

// AutoCloseable 인터페이스가 close() 메서드를 가지고 있어서 close() 가 필요한 부분을 자동으로 처리함
// 아래처럼 상속받아서 사용하면 됨.
public class FileInputStream implements AutoCloseable {
	private String file;
	
	public FileInputStream(String file) {
		this.file = file;
	}
	
	public void read() {
		System.out.println(file + " 을 읽었습니다.");
	}
	
//	자동으로 리소스 해제해주는 메서드
	@Override
	public void close() throws Exception {
		System.out.println(file + " 을 닫습니다.");
	}
}
