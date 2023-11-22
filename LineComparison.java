import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {
		System.out.println("Welcome to the Line Comparison Computation Program");
                int x1, y1, x2, y2;
		Scanner obj = new Scanner(System.in);
		// User inputs the coordinates
		System.out.print("Enter x1: ");
		x1 = obj.nextInt();
		System.out.print("Enter y1: ");
		y1 = obj.nextInt();
		System.out.print("Enter x2: ");
		x2 = obj.nextInt();
		System.out.print("Enter y2: ");
		y2 = obj.nextInt();
		double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("Length of a First Line Segment = " + length1);
	}
}
