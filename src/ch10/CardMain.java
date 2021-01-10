package ch10;

import java.util.Scanner;

public class CardMain {
		public static void main(String[] args) {
			int num = (int)(Math.random()*100) -1;
			System.out.println("수를 결정하였습니다. 맞추어 보세요.\n0-99");
			Scanner sc = new Scanner(System.in);
			int count = 1;
				while(true){
					
					System.out.print(count + " >>");
					
					int snum = sc.nextInt();
					
					if(num != snum && num > snum){
						System.out.println("더 높게");
						count++;
					}
					else if(num != snum && num < snum){
						System.out.println("더 낮게");
						count++;
					}
					else if (num == snum){
						System.out.println("정답입니다.\n다시 하시겠습니까?(y/n)\n>>");
						String ans = sc.next();
						if (ans == "y") {
							System.out.println("수를 결정하였습니다. 맞추어 보세요.\n0-99");	
							return;
						}
						else {
							System.out.println("프로그램을 종료합니다.");
							break;
						}
					}
					else {
						System.out.println("잘못입력했습니다.");
						break;
					}
				}
			}

	}


