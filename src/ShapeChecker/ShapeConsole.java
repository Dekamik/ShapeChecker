package ShapeChecker;

public class ShapeConsole {
	
	private String shape = "";

	public String messageChooseShape() {
		return "Shape: (C)ircle or (R)ectangle?";
	}
	
	public String selectShape(String selection) {
		
		if (selection.equalsIgnoreCase("r")) {
			shape = "rectangle";
		}
		else if (selection.equalsIgnoreCase("c")) {
			shape = "circle";
		}
		return 
	}
}
