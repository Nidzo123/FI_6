import java.util.Scanner;

public class FI_6{

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int k;

		System.out.println("Vnesi K vrednost:");
		k = keyboard.nextInt();
		
		if(k > 6) {
			System.out.println(k);
		}else {
			System.out.println("Ne tochen vnes na k");
		}

	}

}