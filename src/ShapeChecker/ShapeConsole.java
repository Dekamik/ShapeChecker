package ShapeChecker;

public class ShapeConsole {
	
	private States state = States.START;
	private ShapeMethods m = new ShapeMethods();

	public String messageChooseShape() {
		return "Shape: (C)ircle or (R)ectangle?";
	}
	
	public String selectShape(String selection) {
		if (selection.equalsIgnoreCase("r")) {
			state = States.RECTA;
			return m.rectangleSelected();
		}
		else if (selection.equalsIgnoreCase("c")) {
			state = States.CIRCLE;
			return m.circleSelected();
		}
		return null;
	}
	
	public String input(String str) {
		switch(state) {
		case START: state = States.SELECT; return messageChooseShape();
		case SELECT: return selectShape(str);
		case CIRCLE: state = States.END; return m.circleRadius(Integer.parseInt(str));
		case RECTA: state = States.RECTB; return m.rectA(Integer.parseInt(str));
		case RECTB: state = States.END; return m.rectB(Integer.parseInt(str));
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
