package ch10;
import java.util.Scanner;
	
public class RcpPlay {
		private Scanner sc;
		private String input1;
		private String input2;
		
		public RcpPlay() {
			sc = new Scanner(System.in);
			
		}
		
		public void input() {
			System.out.println("가위 바위 보 게임입니다. 연달아서 가위, 바위, 보 중에서 입력하세요.");
			String input1 = sc.next();
			this.input1 = input1;
			String input2 = sc.next();
			this.input2 = input2;
			System.out.println("철수 >> " + input1);
			System.out.println("영희 >> " + input2);
		}
		
		public void result() {
			switch(input1) {
			case "가위":
				if (input2 == "가위") {
					System.out.println("비겼습니다.");
				}
				else if(input2 == "바위") {
					System.out.println("영희가 이겼습니다.");
				}
				else {
					System.out.println("철수가 이겼습니다.");
				}
				break;
				
			case "바위":
				if (input2 == "가위") {
					System.out.println("철수가 이겼습니다.");
				}
				else if(input2 == "바위") {
					System.out.println("비겼습니다.");
				}
				else {
					System.out.println("영희가 이겼습니다.");
				}
				break;
				
			case "보":
				if (input2 == "가위") {
					System.out.println("영희가 이겼습니다.");
				}
				else if(input2 == "바위") {
					System.out.println("철수가 이겼습니다.");
				}
				else {
					System.out.println("비겼습니다.");
				}
				break;
			}

		}
		
		public void run() {
			
			input();
			result();
			System.out.println("프로그램을 종료합니다.");
	}	
}
