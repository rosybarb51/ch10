package ch10;

import java.util.Scanner;

public class Won2Dollar extends Converter {
	private double val;
	
	public Won2Dollar(double ratio) {
		this.ratio = ratio;
	}
	
	@Override
	protected double convert(double src) {
		src = Math.round((src / ratio)*100)/100.0; //Math.round(숫자*100)/100.0 : 숫자의 소숫점 아래 둘 째 자리까지 나타내준다. 반올림해서 그래서 정수로 리턴시켜줌. 만약 셋 째 자리까지 원하면 1000곱하고 1000나누기
		return src;
	}

	@Override
	protected String srcString() {
		String result = Math.round(val) + "원";
		return result;
	}

	@Override
	protected String destString() {
		return "달러";
	}
	
	@Override
	public void run() {
	      Scanner scanner = new Scanner(System.in);
	      System.out.print("원을 입력하세요 >> ");
	      double val = scanner.nextDouble();
	      this.val = val; //사용자 입력받은 val 값을 저장해줬다. 메모리에
	      double res = convert(val);
	      System.out.println(srcString() + "을 " + destString() + "로 바꿉니다.");
	      System.out.println("변환 결과: " + res + destString() + "입니다");
	      scanner.close();
	   }
	}
//	won을 저장하는 걸 만들던가, 앞의 run을 오버라이딩해서 쓰자.
 

