import java.util.Scanner;

public class TableOfPowers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cont = "y";
		System.out.println("Learn your squares and cubes!");
		System.out.println("Enter an integer: ");
		int userNum = scan.nextInt();
		

		while (cont.equalsIgnoreCase("y")) {

			System.out.println("Number	Squared	Cubed");
			System.out.println("======	======	======");

			for (int i = 1; i <= userNum; i++) {
				System.out.print(i);
				double userDouble = i;
				System.out.print("	" + (int) Math.pow(userDouble, 2));
				System.out.println("	" + (int) Math.pow(userDouble, 3));
			}

			System.out.println("Continue? (y/n): ");
			scan.nextLine();
			cont = scan.nextLine();
		}
		scan.close();
	}
}
