import java.util.*;

class FlowEx17 {
	public static void main(String[] args) { 
		int num = 0;

		System.out.print("*을 출력할 라인의 수를 입력하세요.>");

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();  // nextLine()메소드는 Enter를 치기 전까지 쓴 문자열을 모두 리턴한다는 것.
		num = Integer.parseInt(tmp);      // 

		for(int i=0;i<num;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	} //
}
