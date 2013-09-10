package ShapeChecker;

public class ShapeConsole {
	
	private int rectA = 0;
	private double pi = 3.14;
	private States state = States.START;

	public String messageChooseShape() {
		return "Shape: (C)ircle or (R)ectangle?";
	}
	
	public String selectShape(String selection) {
		if (selection.equalsIgnoreCase("r")) {
			state = States.RECTA;
			return rectangleSelected();
		}
		else if (selection.equalsIgnoreCase("c")) {
			state = States.CIRCLE;
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
	
	public String input(String str) {
		switch(state) {
		case START: state = States.SELECT; return messageChooseShape();
		case SELECT: return selectShape(str);
		case CIRCLE: state = States.END; return circleRadius(Integer.parseInt(str));
		case RECTA: state = States.RECTB; return rectA(Integer.parseInt(str));
		case RECTB: state = States.END; return rectB(Integer.parseInt(str));
		}
		return null;
	}
	
	public boolean ended() {
		if (state == States.END)
			return true;
		return false;
	}
	
	private enum States {
		START, SELECT, CIRCLE, RECTA, RECTB, END
	}
}
