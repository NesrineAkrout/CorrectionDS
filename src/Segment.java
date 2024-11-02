
public class Segment {
	private Point point1;
	private Point point2;
	public Segment(Point point1, Point point2) {
	this.point1 = point1;
	this.point2 = point2;
	}
	
	public Point getPoint1() {
	return this.point1;
	}
	public Point getPoint2() {
	return this.point2;
	}
	public double length() {
	return this.point1.distanceTo(this.point2);
	}
}
