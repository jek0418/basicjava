package F_OOP2;

public class PointTest {
	public static void main(String[] args) {
		Point3D p3d = new Point3D(10,20,30);
		System.out.println("("+p3d.x+","+p3d.y+","+p3d.z+")");
		
	}
}

class Point2{
	
	int x ;
	int y;
	
	
	
	Point2 (int x, int y){
		this.x=x;
		this.y=y;
	}
	
}

class Point3D extends Point2{
	int z;
	Point3D(int x, int y, int z){
		super(x,y);
		this.z = z;

	}
	
}
