package ch10;

public class StringStack implements Stack {
	String stack[];
	int num;
	int top;
	
	StringStack(int num) {
		this.num = num;
		stack = new String[this.num];
		top = this.num;
	}
	@Override
	public int length() {
		return num - top;
	}

	@Override
	public int capacity() {
		return top;
	}

	@Override
	public String pop() {
		int t = top;
		top++;
		return stack[t];
	}

	@Override
	public boolean push(String st) {
		if(top > 0) {
			stack[top-1] = st;
			top--;
			return true;
		}
		else {
			return false;
		}
	}
}
