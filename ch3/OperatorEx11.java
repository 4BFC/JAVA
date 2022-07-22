class OperatorEx11 {
	public static void main(String args[]) { 
		char a = 'a'; //97
		char d = 'd'; //100

		char zero = '0'; //48
		char two  = '2'; //50

		System.out.printf("'%c' - '%c' = %d\n", d, a, d - a); // 'd' - 'a' = 3
		System.out.printf("'%c' - '%c' = %d\n", two, zero, two - zero); // 2
		System.out.printf("'%c'=%d\n", a, (int)a); //
		System.out.printf("'%c'=%d\n", d, (int)d); //100
		System.out.printf("'%c'=%d\n", zero, (int)zero); //
		System.out.printf("'%c'=%d\n", two,  (int)two); //
	}
}
