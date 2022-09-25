public class Problem11_Average {

	public static void main(String[] args) {
		double sum=0;
		for(int i=0;i<args.length;i++)
			sum+=Integer.parseInt(args[i]); //문자열 정수변환 : Integer.parseInt(문자열)
		System.out.println(sum/(double)args.length);
	}
}