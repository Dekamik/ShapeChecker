package ShapeChecker;

public class ShapeConsole {
	
	private String shape = "";
	private int rectA = 0;
	private double pi = 3.14;

	public String messageChooseShape() {
		return "Shape: (C)ircle or (R)ectangle?";
	}
	
	public String selectShape(String selection) {
		if (selection.equalsIgnoreCase("r")) {
			return rectangleSelected();
		}
		else if (selection.equalsIgnoreCase("c")) {
			return circleSelected();
		}
		return null;
	}
	
	public String rectangleSelected() {
		return "Rectangle side A length?";
	}
	
	public String rectA(int rectA) {
		this.rectA = rectA;
		return "Rectangle side B length?";
	}
	
	public String rectB(int rectB) {
		int area = (rectA * rectB);
		int circumference = (rectA * 2) + (rectB * 2);
		return "Area="+area+"\nCircumference="+circumference;
	}
	
	public String circleSelected() {
		return "Circle radius?";
	}
	
	public String circleRadius(int radius) {
		double area = pi * (radius * radius);
		double circumference = 2 * pi * radius;
		return "Area="+area+"\nCircumference="+circumference;
	}
}
