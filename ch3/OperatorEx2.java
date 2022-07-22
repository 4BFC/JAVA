class OperatorEx2 {
	public static void main(String args[]) {
		int i=5, j=0;

		j = i++; //대입이 먼저
		System.out.println("j=i++; 실행 후, i=" + i +", j="+ j); // i = 5, j = 6 -> i = 6, j = 5
		i=5;        //
		j=0;

		j = ++i;
		System.out.println("j=++i; 실행 후, i=" + i +", j="+ j); // i = 6, j = 6
	}
}
