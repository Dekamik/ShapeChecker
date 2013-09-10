package ShapeChecker;

import java.util.Scanner;

public class ShapeChecker {
	
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
	
	public static void main(String[]args) {
		ShapeChecker s = new ShapeChecker();
		s.program();
		System.exit(0);
	}
}
