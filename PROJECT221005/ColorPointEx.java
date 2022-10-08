class Point{
	private int x,y;
	public void set(int x, int y) {
		this.x=x;this.y=y;
	}
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint extends Point{
	private String color;
	public void setColor(String color) {
		this.color=color;
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint(); // Point 클래스의 showPoint() 호출
	}
}

public class ColorPointEx {

	public static void main(String[] args) {
		Point p=new Point();
		p.set(1, 2);
		p.showPoint();
		
		ColorPoint cp=new ColorPoint();
		cp.set(3, 4); // Point의 set() 호출
		cp.setColor("red"); // ColorPoint의 setColor() 호출
		cp.showColorPoint(); // 컬러와 좌표 출력
	}

}
