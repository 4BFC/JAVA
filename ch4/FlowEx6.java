import java.util.*;

class FlowEx6 {
	public static void main(String[] args) { 
		int month = 0;

		System.out.print("현재 월을 입력하세요.>");

		Scanner scanner = new Scanner(System.in);
		//String tmp = scanner.nextLine(); //Enter -> return to string
		String tmp = scanner.next(); //Enter -> return to string
		month = Integer.parseInt(tmp);   

		switch(month) {
			case 3: 
			case 4: 
			case 5:
				System.out.println("현재의 계절은 봄입니다.");
				break;
			case 6: case 7: case 8:
				System.out.println("현재의 계절은 여름입니다.");
				break;
			case 9: case 10: case 11:
				System.out.println("현재의 계절은 가을입니다.");
				break;
		//	default: //-> default를 사용하면 조금 더 안정적인 코드가 된다. 다시말해 case에서 확인하지 못하는 결과 값이 들어오면 아무것도 발생하지 않는다. 이를 방지하기 위해 사용한다.
			case 12: case 1: case 2:
				System.out.println("현재의 계절은 겨울입니다.");
				break;
			default:
			 	System.out.println("잘못 입력했습니다.");
		}
	} 
}
