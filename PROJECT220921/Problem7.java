import java.util.Random;

public class Problem7 {

	public static void main(String[] args) {
		Random random = new Random();
		int arr[] = new int[10];
		double sum=0; 
		
		for(int i=0;i<10;i++) {
			arr[i]=random.nextInt(10)+1; //1~10까지의 난수
			sum+=arr[i];
		}
	
		System.out.print("랜덤한 정수들 : ");
		for(int i=0;i<10;i++)
			System.out.print(arr[i]+" ");
		
		System.out.print("\n평균은 "+sum/10.0);
	}

}
