package cn.diao2;

public class Test {

	public static void main(String[] args) {
		Plane p=new Plane();
		p=new FighterPlane();
		p.fly();
		p=new AirLiner();
		p.fly();
	}

}
