import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("양의 정수 10개를 입력하시오>>");
		
		//배열에 정수 10개 입력받기
		int arr[]=new int[10];
		for(int i=0;i<10;i++)
			arr[i]=s.nextInt();
		
		System.out.print("3의 배수는 ");
		for(int i=0;i<10;i++) {
			if(arr[i]%3==0)
				System.out.print(arr[i]+" ");
		}
		
		s.close();
	}

}
