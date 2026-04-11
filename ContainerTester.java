class ContainerTester {
	public static void main(String[] args) {
		DataPacket<String> dp = new DataPacket<>("Lucknow");
		System.out.println(dp.x);

		DataPacket<Integer> dp2 = new DataPacket<>(10);
		System.out.println(dp2.x);
	}
}
