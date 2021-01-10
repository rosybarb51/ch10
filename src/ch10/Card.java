package ch10;
import java.util.Scanner;
public class Card {
     public static void main(String[] args) {
     int rn = (int)(Math.random()*100) +1;
     System.out.println("1~100 사이의 숫자를 골랐으니 숫자를 맞춰 보시오.");
     Scanner scanner = new Scanner(System.in);
     int count = 1;

          while(true){
               System.out.print("숫자 입력 >");
               int sn = scanner.nextInt();
               if(rn != sn && rn > sn){
                    System.out.println("틀렸습니다, 제가 고른 숫자는 더 큰 수 입니다.");
                    count++;
               }else if(rn != sn && rn < sn){
                    System.out.println("틀렸습니다, 제가 고른 숫자는 더 작은 수 입니다.");
                    count++;
               }else if(rn == sn){
                    System.out.println("정답입니다!!," + count + "번 만에 맞추셨습니다.");
                    System.exit(0); // 정답을 맞추면 프로그램종료
               }
          }
     }
}