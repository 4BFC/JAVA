class FactorialTest {
	public static void main(String args[]) {
		System.out.println(factorial(4)); // FactorialTest.factorial(4)
	}

	static long factorial(int n) {
		long result=0;

		if (n == 1) return 1;		

		return n * factorial(n-1); // 다시 메서드 자신을 호출한다. -> 4* (3* (2* (1))) = 24
	}
}
