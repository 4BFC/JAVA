class OperatorEx23 {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = new String("abc");

		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc"); //t
		System.out.printf(" str1==\"abc\" ? %b%n",    str1=="abc"); //t
		System.out.printf(" str2==\"abc\" ? %b%n",    str2=="abc"); //t ->f
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc")); //t
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc")); //t
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC")); //f
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC")); //t
	}
}
