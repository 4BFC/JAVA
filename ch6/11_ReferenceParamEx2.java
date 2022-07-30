class ReferenceParamEx2 {
	public static void main(String[] args) 
  {
		int[] x = {10};  // 크기가 1인 배열, x[0] = 10;
		System.out.println("main() : x = " + x[0]);//10

		change(x);
		System.out.println("After change(x)");
		System.out.println("main() : x = " + x[0]);//10 -> 1000이다. 그 이유는 배열은 참조변수이다.
	}

	static void change(int[] x) { // 참조형 매개변수
		x[0] = 1000;
		System.out.println("change() : x = " + x[0]); // 1000
	}
}
