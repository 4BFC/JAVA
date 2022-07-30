class FactorialTest2 {
	static long factorial(int n) {
		if(n<=0 || n>20) return -1;  
		// 매개변수의 유효성 검사. n<=0 : 0,-1,-2.. n>20 : 21,22,23,24..
		if(n<=1) //n<=1 : 1,0,-1,-2..
			 return 1;
	    return n * factorial(n-1); 
	}

	public static void main(String args[]) {
		int  n = 21;
		long result = 0;

		for(int i = 1; i <= n; i++) {//1~21
			result = factorial(i);//

			if(result==-1) {
				System.out.printf("유효하지 않은 값입니다.(0<n<=20):%d%n", n);
				break;//break문을 사용해서 멈춤
			}

			System.out.printf("%2d!=%20d%n", i, result);
		}
	} // main
}
