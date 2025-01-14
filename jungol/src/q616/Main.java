package q616;

import java.util.*;
 
class Triangle {
    int x1, x2, x3, y1, y2, y3;
 
    public Triangle(double x1, double x2, double x3, double y1, double y2, double y3) {
        x1 = x1;
        x2 = x2;
        x3 = x3;
        y1 = y1;
        y2 = y2;
        y3 = y3;
    }
}
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1, x2, x3, y1, y2, y3;
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        x3 = sc.nextDouble();
        y3 = sc.nextDouble();
 
        System.out.println("(" + Math.round(((x1 + x2 + x3) / 3) * 10.0) / 10.0 + ", "
                + Math.round(((y1 + y2 + y3) / 3) * 10.0) / 10.0 + ")");
    }
}