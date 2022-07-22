class OperatorEx5 {
	public static void main(String args[]) { 
		int a = 10;
		int b = 4;

		System.out.printf("%d + %d = %d\n",  a, b, a + b);//14
		System.out.printf("%d - %d = %d\n",  a, b, a - b);//6
		System.out.printf("%d * %d = %d\n",  a, b, a * b);//40
		System.out.printf("%d / %d = %d\n",  a, b, a / b);//2
		System.out.printf("%d / %f = %f\n",  a, (float)b, a / (float)b);//10,4.0,2.5(4.000000, 2.500000)
	}
}
