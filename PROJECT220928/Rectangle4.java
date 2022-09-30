public class Rectangle4 {

	int x,y,width,height;
	
	public Rectangle4(int x, int y, int w, int h) {
		this.x=x; this.y=y; this.width=w; this.height=h;
	}
	
	public int square() {
		return width*height;
	}
	
	public void show() {
		System.out.println("("+x+","+y+")에서 크기가 "+width+"x"+height+"인 사각형");
	}
	
	public boolean contains(Rectangle4 r) {
		if(x<r.x&&y<r.y&&x+width>r.x+r.width&&y+height>r.y+r.height) return true;
		else return false;
	}
	
	public static void main(String[] args) {
		Rectangle4 r=new Rectangle4(2,2,8,7);
		Rectangle4 s=new Rectangle4(5,5,6,6);
		Rectangle4 t=new Rectangle4(1,1,10,10);
		
		r.show();
		System.out.println("s의 면적은 "+s.square());
		if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
		if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
	}

}
