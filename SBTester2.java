class SBTester2 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Lucknow");
		System.out.println(sb.length() + " " + sb.capacity());
		
		sb.append(" Junction");
		System.out.println(sb.length() + " " + sb.capacity());
		
		sb.append(" East");
		System.out.println(sb.length() + " " + sb.capacity());
	}
}
