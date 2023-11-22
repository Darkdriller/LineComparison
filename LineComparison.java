import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {
		System.out.println("Welcome to the Line Comparison Computation Program");
                int x1, y1, x2, y2, x3, y3, x4, y4;
		Scanner obj = new Scanner(System.in);
		// Line 1

                System.out.print("Enter x1: ");
		x1 = obj.nextInt();
		System.out.print("Enter y1: ");
		y1 = obj.nextInt();
		System.out.print("Enter x2: ");
		x2 = obj.nextInt();
		System.out.print("Enter y2: ");
		y2 = obj.nextInt();

                // Line 2

		System.out.print("Enter x3: ");
		x3 = obj.nextInt();
		System.out.print("Enter y3: ");
		y3 = obj.nextInt();
		System.out.print("Enter x4: ");
		x4 = obj.nextInt();
		System.out.print("Enter y4: ");
		y4 = obj.nextInt();

		double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
                String str1 = Double.toString(length1);

		double length2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
		String str2 = Double.toString(length2);

                final int EQUAL = 0, GREATER = 1, LESSER = -1;

                int comparisonResult = str1.compareTo(str2);
                int adjustedComparison;
                if (comparisonResult < 0) {
                   adjustedComparison = LESSER;
                } else if (comparisonResult > 0) {
                   adjustedComparison = GREATER;
                } else {
                   adjustedComparison = EQUAL;
                }
                
                switch(adjustedComparison){
                  case GREATER:
                     System.out.println("Line 1 greater than Line 2");
                     break;

                  case LESSER:
                     System.out.println("Line 1 Lesser than Line 2");
                     break;
                  
                  default:
                     System.out.println("Line 1 Equal to Line 2");
             }

	}
}
