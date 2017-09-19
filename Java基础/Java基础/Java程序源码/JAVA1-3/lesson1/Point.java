package zuoye;

public class Point {

  float x;
  float y;
  private void moveX(int x){
	  this.x+=x;
	}
  private void moveY(int y){
	  this.y+=y;

  }
/*计算两点间的距离*/
  public int distanceOfTwoPoint(int x1,int y1,int x2,int y2){
	  return((int)Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2, 2)));
  }

}

   