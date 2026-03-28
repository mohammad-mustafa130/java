class IntQueue {
	private int[] queue;
	private int front;
	private int rear;
	public IntQueue(int n) {
		queue = new int[n];
		front = -1;
		rear = -1;
	}
	public void enqueue(int data) {
		if(rear == queue.length-1) {
			System.out.println("Queue is full");
		} else {
			queue[++rear] = data;
			if(rear == 0) front = 0;
		}
	}
	public int dequeue() {
		if((rear == -1) && (front == -1)) {
			System.out.println("Queue is empty");
		}
		int data = queue[front++];
		if(rear < front) {
			rear = -1;
			front = -1;
		} 
		return data;
	}
}
