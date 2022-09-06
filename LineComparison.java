import java.util.*;

public class LineComparison
{
	public static void main(String[] args) {
		
		System.out.println("Enter the first co-ordinate");
		Scanner sc = new Scanner(System.in);
		
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		
		System.out.println("Enter the Second co-ordinate");
		int x2=sc.nextInt();
		int y2=sc.nextInt();

		System.out.println("The first Co-ordinate("+x1+","+y1+")");

		System.out.println("The second Co-ordinate("+x2+","+y2+")");

		double length2;

		int point3 = (x2-x1) * (x2-x1);
		int point4 = (y2-y1) * (y2-y1);

		length2 = Math.sqrt(point3+point4);

		System.out.println("length of the line is "+ length2);
	}
}
