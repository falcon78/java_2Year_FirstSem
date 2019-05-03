public class SampleMyPoint
{
    public static void main(String[] args) {
	MyPoint point1 = new MyPoint(10, 10);
	MyPoint point2 = new MyPoint(6, 8);
	MyPoint point3 = new MyPoint(-10, 10);
	MyPoint point4 = new MyPoint(-6, -8);

	System.out.println(point1 + " の r は " + point1.getR());
	System.out.println(point1 + " の theta は " + point1.getTheta());
	System.out.println(point2 + " の r は " + point2.getR());
	System.out.println(point2 + " の theta は " + point2.getTheta());
	System.out.println(point3 + " の r は " + point3.getR());
	System.out.println(point3 + " の theta は " + point3.getTheta());
	System.out.println(point4 + " の r は " + point4.getR());
	System.out.println(point4 + " の theta は " + point4.getTheta());
	System.out.println(point1 + " と " + point2 + " の距離は " + 
			   point1.distance(point2));
	System.out.println(point1 + " と " + point3 + " の距離は " + 
			   point1.distance(point3));
	System.out.println(point2 + " と " + point4 + " の距離は " + 
			   point2.distance(point4));
    }
}
