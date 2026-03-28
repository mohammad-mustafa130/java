class IntStack {
	private int[] stack;
	private int top;
	public IntStack(int n) {
		stack = new int[n];
		top = -1;
	}
	public void push(int data) {
		if(top == stack.length-1) {
			System.out.println("Stackoverflow");
		} else {
			stack[++top] = data;
		}
	}
	int getSize() {
		return top+1;
	}
	public int pop() {
		if(top == -1) {
			return Integer.MIN_VALUE;
		}
		return stack[top--];
	}
}
