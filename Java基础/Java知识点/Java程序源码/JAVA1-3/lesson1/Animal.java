

public class Animal {
	private String name;
	private int bodySize;
	private String weight;
	
	public Animal(String name,int bodySize,float weight){
		this.name=name;
		this.bodySize=bodySize;
		this.weight=weight;
	}

	public void run(){//跑
		System.out.println("会跑");
	}
	public void walk(){//走
		System.out.println("会走");
		}
	public void jump(){//跳
		System.out.println("会跳");
	}
	public String getName(){
		return name;

	}
	public int getBodySize(){
		return bodySize;
	}
	public String getWeight(){
		return weight;

	}
	public String toString(){
		return ("这个动物叫："+name+",身体大小是"+bodySize+",体重是"+weight+".");
		
	}
	}

