package ch10;

public class Won2Dollar extends Converter {
	private double won;
	
	public Won2Dollar(double ratio) {
		this.ratio = ratio;
	}
	
	@Override
	protected double convert(double src) {
		src = src / ratio; 
		return src;
	}

	@Override
	protected String srcString() {
		String result = won + "원";
		return result;
	}

	@Override
	protected String destString() {
		return "달러";
	}
	
//	won을 저장하는 걸 만들던가, 앞의 run을 오버라이딩해서 쓰자.
 
}
