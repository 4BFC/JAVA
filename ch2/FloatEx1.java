class FloatEx1 {
	public static void main(String[] args) {
		float  f   = 9.12345678901234567890f;
		float  f2  = 1.2345678901234567890f;
		double d   = 9.12345678901234567890d;

		System.out.printf("     123456789012345678901234%n");
		System.out.printf("f  : %f%n", f); // �Ҽ��� ���� 6°�ڸ����� ���.
		System.out.printf("f  : %24.20f%n", f); //24자리 중에 20자리 소수점 이하의 수를 출력하라는 뜻
		System.out.printf("f2 : %24.20f%n", f2);
		System.out.printf("d  : %24.20f%n", d);
	}
}