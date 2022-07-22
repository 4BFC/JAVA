class OperatorEx21 {
	public static void main(String args[]) { 
		System.out.printf("10 == 10.0f  \t %b\n", 10==10.0f); //t
		System.out.printf("'0'== 0      \t %b\n", '0'== 0); //f		
		//System.out.printf("'\\0'== 0    \t %b\n", '\0'== 0); //f -> t
		System.out.printf("'A'== 65     \t %b\n", 'A'== 65); //t
		System.out.printf("'A' > 'B'    \t %b\n", 'A' > 'B'); //f
		System.out.printf("'A'+1 != 'B' \t %b\n", 'A'+1 != 'B'); //f
	}
}
