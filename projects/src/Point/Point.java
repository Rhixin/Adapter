package Point;

import java.util.Comparator;

public class Point implements Comparable<Point> {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        int a = o.y - this.y;
        if(a == 0){
            return -(this.x - o.y);
        }

        return a;
    }

//    @Override
//    public int compareTo(Point other) {
//        int compareY = Integer.compare(other.y, this.y);
//        if (compareY != 0) {
//            return compareY;
//        }
//        return Integer.compare(this.x, other.x);
//    }



    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public static class DistanceComparator implements Comparator<Point> {
        private Point target;

        public DistanceComparator(Point target) {
            this.target = target;
        }

        @Override
        public int compare(Point p1, Point p2) {
            double distance1 = pointFormula(target, p1);
            double distance2 = pointFormula(target, p2);
            return Double.compare(distance1, distance2);
        }

        private double pointFormula(Point p1, Point p2) {
            int distance_x = p2.x - p1.x;
            int distance_y = p2.y - p1.y;
            int d_x_squared = distance_x * distance_x;
            int d_y_squared = distance_y * distance_y;
            return Math.sqrt(d_x_squared + d_y_squared);
        }
    }
}