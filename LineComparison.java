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
                Point point1Line1 = new Point(x1, y1);
		System.out.print("Enter x2: ");
		x2 = obj.nextInt();
		System.out.print("Enter y2: ");
		y2 = obj.nextInt();
                Point point2Line1 = new Point(x2,y2);

                // Line 2

		System.out.print("Enter x3: ");
		x3 = obj.nextInt();
		System.out.print("Enter y3: ");
		y3 = obj.nextInt();
                Point point1Line2 = new Point(x3,y3); 
		System.out.print("Enter x4: ");
		x4 = obj.nextInt();
		System.out.print("Enter y4: ");
		y4 = obj.nextInt();
                Point point2Line2 = new Point(x4,y4);
                Line line1 = new Line(point1Line1, point2Line1);
                Line line2 = new Line(point1Line2, point2Line2);

                // Compare lengths
                compareLines(line1, line2);
                }

            private static void compareLines(Line line1, Line line2) {
                    double length1 = line1.length();
                    double length2 = line2.length();

                    final int EQUAL = 0, GREATER = 1, LESSER = -1;

                    String str1 = Double.toString(length1);
                    String str2 = Double.toString(length2);

                    int comparisonResult = str1.compareTo(str2);
                    int adjustedComparison;
                    if (comparisonResult < 0) {
                        adjustedComparison = LESSER;
                    } else if (comparisonResult > 0) {
                        adjustedComparison = GREATER;
                    } else {
                        adjustedComparison = EQUAL;
                    }

                    switch (adjustedComparison) {
                        case GREATER:
                            System.out.println("Line 1 is greater than Line 2");
                            break;
                        case LESSER:
                            System.out.println("Line 1 is lesser than Line 2");
                            break;
                        default:
                            System.out.println("Line 1 is equal to Line 2");
                    }
                }


               static class Point {
                   private int x;
                   private int y;

                   public Point(int x, int y) {
                       this.x = x;
                       this.y = y;
                   }

                   public int getX() {
                       return x;
                   }

                   public int getY() {
                       return y;
                   }
               }

               static class Line {
                   private Point startPoint;
                   private Point endPoint;

                   public Line(Point startPoint, Point endPoint) {
                       this.startPoint = startPoint;
                       this.endPoint = endPoint;
                   }

                   public double length() {
                       return Math.sqrt(Math.pow(endPoint.getX() - startPoint.getX(), 2) + Math.pow(endPoint.getY() - startPoint.getY(), 2));
                   }
               }


	}
