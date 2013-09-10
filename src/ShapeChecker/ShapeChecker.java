package ShapeChecker;

import java.util.Scanner;

public class ShapeChecker {
	
	public ShapeChecker() {
		
	}
	
	public void program() {
		ShapeConsole c = new ShapeConsole();
		Scanner sc = new Scanner(System.in);
		System.out.println(c.messageChooseShape());
		String command = sc.nextLine();
		System.out.println(c.selectShape(command));
		if (command.equalsIgnoreCase("r")) {
			System.out.println(c.rectA(Integer.parseInt(sc.nextLine())));
			System.out.println(c.rectB(Integer.parseInt(sc.nextLine())));
		}
		else if (command.equalsIgnoreCase("c")) {
			System.out.println(c.circleRadius(Integer.parseInt(sc.nextLine())));
		}
	}
	
	public void program2() {
		ShapeConsole c = new ShapeConsole();
		Scanner sc = new Scanner(System.in);
		System.out.println("Press any key to start.");
		while(!c.ended()) {
			System.out.println(c.input(sc.nextLine()));
		}
	}
	
	public static void main(String[]args) {
		ShapeChecker s = new ShapeChecker();
		s.program2();
		System.exit(0);
	}
}
