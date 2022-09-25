import java.util.Scanner;

public class DevideByZeroHandling {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("나뉨수를 입력하시오 : ");
			int dividend = scanner.nextInt(); //나뉨수
			System.out.print("나눗수를 입력하시오 : ");
			int divisor = scanner.nextInt(); //나눗수
			
			try {
				System.out.println(dividend+"를 "+divisor+"로 나누면 몫은 "+dividend/divisor+"입니다.");
				break; //정상으로 완료되면 while 빠져나가기
			}
			catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요");
			}
		}
		scanner.close();
	}

}
