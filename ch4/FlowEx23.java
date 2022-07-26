class FlowEx23 {
	public static void main(String[] args) { 
		int i= 5;

		while(i--!=0) { //0이 아니다
			System.out.println(i + " - I can do it."); //0이 출력되는 이유는 --가 후위 계산이라 그렇다.
		}
	} 
}
