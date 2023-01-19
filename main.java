import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		System.out.println("Geben Sie ein wie viele Minuten Sie fahren");
		Scanner scanner = new Scanner(System.in);
		int inputMinuten = scanner.nextInt();
		
		int grundpreis = 2; 
		double variablerPreis = 0.25; 
		
		double endpreis = inputMinuten * variablerPreis + grundpreis; 
		
		System.out.println("Ihr Endpreis ist: " + endpreis + "€");
		
	}
}
