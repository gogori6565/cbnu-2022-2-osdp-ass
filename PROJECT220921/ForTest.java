public class ForTest {

	public static void main(String[] args) {
		int sum=0, i=0;
		for(;i<100;sum+=i,i+=2) {}
		System.out.println(sum);
	}
}