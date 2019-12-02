import java.util.Scanner;

public class TriangleThreeRunner {
	public static void main(String args[]) {
		int abaa = 1;
		TriangleThree one = new TriangleThree();
		Scanner i = new Scanner(System.in);
		while(true) {
			if(abaa == 0) {
				i.nextLine();
			}
			System.out.println("Type a character: ");
			String o = i.nextLine();
			System.out.println("How many rows would you like?");
			int a = i.nextInt();
			one.setTriangle(o, a);
			System.out.println(one.toString(o,a));
			abaa = 0;
		}
	}
}