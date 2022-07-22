class OperatorEx3 {
	public static void main(String args[]) {
		int i=5, j=5;

		System.out.println(i++);	// 6 -> 5, i값이 증가되기 전에 참조되므로 5가 나온다.
		System.out.println(++j);	// 6
		System.out.println("i = " + i + ", j = " +j); //6 6 
	}
}
