import java.util.Scanner;

public class TableOfPowers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cont = "y";
		System.out.println("Learn your squares and cubes!");

		while (cont.equalsIgnoreCase("y")) {

			System.out.println("Enter an integer: ");
			int userNum = scan.nextInt();
			scan.nextLine();

			System.out.printf("%-10s %-10s %-10s \n", "Number", "Squared", "Cubed");
			System.out.printf("%-10s %-10s %-10s \n", "=======", "=======", "=======");

			for (int i = 1; i <= userNum; i++) {
				double userDouble = i;
				int cube = (int) Math.pow(userDouble, 2);
				int square = (int) Math.pow(userDouble, 3);
				System.out.printf("%-10d %-10d %-10d", i, cube, square);
				System.out.println();
			}

			System.out.println("Do you want to continue? (y/n): ");
			cont = scan.nextLine();
		}
		scan.close();
	}
}
