import java.util.Scanner;

class Player{
	String name;
	String word;
	
	public Player(String name) {
		this.name=name;
	}
	
	public String rename() {
		return name;
	}
}

public class WordGameApp {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("끝말잇기 게임을 시작합니다...");
		System.out.print("게임에 참가하는 인원은 몇명입니까>>");
		int num=s.nextInt();
		Player [] player=new Player[num];
		
		for(int i=0;i<num;i++) { //참가지 이름 입력
			System.out.print("참가자의 이름을 입력하세요>>");
			String name=s.next();
			player[i]=new Player(name);
		}
		player[num-1].word="아버지"; //맨 처음 맞는 지 검사
		
		int run=0; //계속 할 건지
		System.out.println("시작하는 단어는 아버지입니다");
		
		while(true) { //끝말잇기 게임 시작
			for(int i=0;i<num;i++) {
				System.out.print(player[i].rename()+">>");
				String word=s.next();
				player[i].word=word;
				
				int index=i-1;
				if(index==-1) index=num-1;
				
				char first=word.charAt(0); //앞글자
				char last=player[index].word.charAt(player[index].word.length()-1); //그 전꺼의 뒷글자
				if(first!=last) {
					System.out.println(player[i].rename()+"이 졌습니다.");
					run=1;
					break;
				}
			}
			if(run==1) break;
		}
	}

}