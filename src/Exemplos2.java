import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplos2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String[] v = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(v[position]);
		}catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
			// Se ocorrer a exception de index inxistente apresentara a msg
			System.out.println("Exception: " + e);
		}
		sc.close();
	}
	
}
