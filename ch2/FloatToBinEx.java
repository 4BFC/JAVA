class FloatToBinEx {
	public static void main(String args[]) {
		float f = -9.1234567f;
		float f1 = 9.1234567f;
		int i = Float.floatToIntBits(f);
		int ii = Float.floatToIntBits(f1);
		
		System.out.printf("%f%n", f);
		System.out.printf("%X%n", i); // 
		System.out.printf("%f%n",f1);
		System.out.printf("%X%n",ii);
		System.out.println("Hello");
		
	} 
}
