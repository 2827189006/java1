package zuoye;

public class Triangle {

      int a;
      int b;
      int c;
      public Triangle(int a,int b,int c){
    	  this.a=a;
    	  this.b=b;
    	  this.c=c;
	}
    public int getZhouChang(){
	return a+b+c;
}
    public double getArea(){
	double area;
	double s;
	s=1.0/2*(a+b+c);
	area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
    return area;
}
  public boolean isTriangle(){
	  if(a+b>c||a+c>b||b+c>a){
		  return true;
	  }else{
		  return false;
	  }
  }
}
