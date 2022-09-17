public class Hello {
	public static int sum(int n, int m) {
		return n+m;
	}

	public static void main(String[] args) {
		int i=20;
		int s;
		char a;
		
		s=sum(i,10);
		a='?';
		System.out.println(a); //문자 a 출력
		System.out.println("Hello");
		System.out.println(s); //정수 s 출력
	}
}
