

public class Animal {
	private String name;
	private int bodySize;
	private String weight;
	
	public Animal(String name,int bodySize,float weight){
		this.name=name;
		this.bodySize=bodySize;
		this.weight=weight;
	}

	public void run(){//��
		System.out.println("����");
	}
	public void walk(){//��
		System.out.println("����");
		}
	public void jump(){//��
		System.out.println("����");
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
		return ("�������У�"+name+",�����С��"+bodySize+",������"+weight+".");
		
	}
	}

