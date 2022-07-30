class Data { int x; }

class PrimitiveParamEx {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x); // 10

		change(d.x); //지역변수처럼 change()함수 안에서만 이루어 진다.
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x); // 1000
	}

	static void change(int x) {  // 기본형 매개변수
		//int x라는 lv(loctaion value)이다.
		x = 1000;
		System.out.println("change() : x = " + x);
	}
}
