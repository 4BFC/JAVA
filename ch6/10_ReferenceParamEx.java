class Data { int x; }

class ReferenceParamEx {
	public static void main(String[] args) {

		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x); // 10

		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x); // 1000

	}

	static void change(Data d) { // 참조형 매개변수
		//Data d 라는 cv이다.
		d.x = 1000; //cv이기에 Data의 x를 참조해 바꾼 것.
		System.out.println("change() : x = " + d.x);
	}
}

