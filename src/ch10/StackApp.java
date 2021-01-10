package ch10;

import java.util.Scanner;
// 강사님 이 문제는 감이 안 잡혀서 인터넷 참고 많이 했습니다... 
public class StackApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		String st;
		
		System.out.println("총 스택 저장 공간의 크기 입력 >> ");
		num = sc.nextInt();
		StringStack sta1 = new StringStack(num);
		while(true) {
			System.out.println("문자열 입력 >> ");
			st = sc.next();
			
			if(st.equals("그만")) {
				int len = sta1.length();
				if(len == 0) {
					System.out.println("현재 스택에 저장된 문자열이 없습니다.");
				}
				else {
					System.out.println("스택에 저장된 모든 문자열 팝 : ");
					for (int i = 0; i <len; i++)
						System.out.println(sta1.pop() + " " );
				}
				break;
			}
			else {
				if(!sta1.push(st))
					System.out.println("스택이 꽉 차서 푸시 불가");
			}
		}
	}

}
