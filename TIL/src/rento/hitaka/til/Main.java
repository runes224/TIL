package rento.hitaka.til;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

	Point p1 = new Point(1, 2);
	Point p2 = new Point(1, 2);
	System.out.println(p1.equals(p2));
	
	Set<Point> points = new HashSet<>();
	points.add(p1);
	points.add(p2);
	System.out.println(p1);
	}

}
