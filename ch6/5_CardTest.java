class CardTest{
	public static void main(String args[]) {
		// System.out.println("Card.width = "  + Card.width); //100 cv
		// System.out.println("Card.height = " + Card.height); //250 cv

		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;

		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;

		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")" );//heart, 7, 100, 250
		System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")" );		//spade, 4, 100, 250

		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
		c1.width = 50; // (static일 떄)iv가 아니라 cv이다. 다만 인스턴스변수를 이용해서 값 변경이 가능하다.
		//Card.width = 50; //cv
		c1.height = 80; // (static일 떄)iv가 아니라 cv이다. 다만 인스턴스변수를 이용해서 값 변경이 가능하다.
		//Card.height = 80; //cv
		c2.width = 190;
		c2.height = 900;

		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")" );
		System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")" );
	}
 }

class Card {
	String kind ;				
	int number;				    
	// static int width = 100;		//cv
	// static int height = 250;		//cv
	int width = 100;		//iv
	int height = 250;		//iv
}
