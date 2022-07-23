import java.util.*; // Scanner클래스를 사용하기 위해 추가

class FlowEx3 {
	public static void main(String[] args) {  
		int input;

		System.out.print("숫자를 하나 입력하세요.>");

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // 
		input = Integer.parseInt(tmp);   // 

		if(input==0) {
			System.out.println("입력하신 숫자는 0입니다.");	
		} else { 
			System.out.println("입력하시 숫자는 0이 아닙니다.");
		}
	} 
}