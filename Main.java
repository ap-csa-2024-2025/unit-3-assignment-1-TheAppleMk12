import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
		Scanner sc = new Scanner(System.in);

    System.out.print("What is the width of Rectangle 1?: ");
    double w1 = sc.nextDouble();
    System.out.print("\nWhat is the length of Rectangle 1?: ");
    double l1 = sc.nextDouble();

    System.out.print("\nWhat is the width of Rectangle 2?: ");
    double w2 = sc.nextDouble();

    System.out.print("\nWhat is the length of Rectangle 2?: ");
    double l2 = sc.nextDouble();

    Rectangle r1 = new Rectangle(l1, w1);
		Rectangle r2 = new Rectangle(l2, w2);

    boolean isRotated = (r1.getLength() == r2.getWidth()) && (r1.getWidth() == r2.getLength());
    System.out.println("Rectangle 2 is the rotation of rectangle 1: " + isRotated);

		boolean isCongruent = isRotated || r1.equals(r2);
    System.out.println("Rectangle 1 and 2 and congruent with each other: " + isCongruent);

		boolean isSimilar = isCongruent || ((r1.getLength()/r2.getLength()) == (r1.getWidth()/r2.getWidth()));
    System.out.println("Rectangle 1 and 2 are similar: " + isSimilar);
	}
  }

