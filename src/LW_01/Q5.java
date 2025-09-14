package LW_01;

import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter inner radius: ");
        double ri = scanner.nextDouble();
        System.out.print("Enter outer radius: ");
        double ro = scanner.nextDouble();

        Circle inner = new Circle(ri);
        Circle outer = new Circle(ro);
        double outerCircleArea  = outer.computeArea();
        double innerCircleArea  =inner.computeArea();

        double shadedArea = outerCircleArea - innerCircleArea;

        System.out.println("Shaded circular region area: " + shadedArea);
    }
}
