package ShapeChecker;

import java.util.Scanner;

public class ShapeChecker {
	
	public ShapeChecker() {
		
	}
	
	public void program() {
		ShapeConsole c = new ShapeConsole();
		Scanner sc = new Scanner(System.in);
		System.out.println("Press any key to start.");
		while(!c.ended()) {
			System.out.println(c.input(sc.nextLine()));
		}
	}
	
	public static void main(String[]args) {
		ShapeChecker s = new ShapeChecker();
		s.program();
		System.exit(0);
	}
}
