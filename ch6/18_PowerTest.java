class PowerTest { 
	public static void main(String[] args) { 
		int x = 2; 
		int n = 5; 
		long result = 0; 

		for(int i=1; i<=n; i++) { //1,2,3,4,5
			result += power(x, i); //2+
		} 

		System.out.println(result); 
	} 

	static long power(int x, int n) { //x=2 
		if(n==1) return x; 

		return x * power(x, n-1); //
	} 
}
