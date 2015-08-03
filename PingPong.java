import java.io.Console;

public class PingPong {
	public static void main(String[] args) {
		Console console = System.console();

		System.out.println("What is your number?");
		String stringYourNumber = console.readLine();
		Integer integerYourNumber = Integer.parseInt(stringYourNumber);

		for (Integer yourNumber = 1 ; yourNumber <= integerYourNumber ; yourNumber++ ) {
			if ( ( yourNumber % 3 == 0 ) && ( yourNumber % 5 == 0 ) ) {
				System.out.println("ping-pong");
			}	else if	( yourNumber % 3 == 0 ) {
				System.out.println("ping");
			}	else if ( yourNumber % 5 == 0 ) {
				System.out.println("pong");
			}	else {
				System.out.println(String.valueOf(yourNumber));
			}
		}
	}
}