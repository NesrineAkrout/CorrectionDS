
public class Point {
	
		private double x;
		private double y;
		public Point(double x, double y) {
		this.x = x;
		this.y = y;
		}
		
		public double getX() {
		return this.x;
		}
		public double getY() {
		return this.y;
		}
		public double distanceTo(Point otherPoint) {
		     double dx = x - otherPoint.x;
		     double dy = y - otherPoint.y;
		     return Math.sqrt(dx * dx + dy * dy);
		}

		public void translate(double dx, double dy) {
		    this.x += dx;
		    this.y += dy;
		}
		public void homothetie(double scaleFactor) {
		    this.x *= scaleFactor;
		    this.y *= scaleFactor;
		}
		public static Point barycentre(Point[] points) {
		    double sumX = 0;
		    double sumY = 0;
		    int n = points.length;
		    for (Point p : points) {
		      sumX += p.x;
		      sumY += p.y;
		    }
		    
		return new Point(sumX / n, sumY / n);
		}
		}

