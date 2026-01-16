class RightShiftOperatorWithCarry {
	public static void main(String[] args) {
		byte x = -10;
		byte a = (byte)(x >>> 1);
		byte b = (byte)(x >>> 2);
		byte c = (byte)(x >>> 3);
		byte d = (byte)(x >>> 4);
		System.out.println(a+" "+b+" "+c+" "+d);
	}
}
