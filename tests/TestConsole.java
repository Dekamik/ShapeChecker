import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import ShapeChecker.*;

public class TestConsole {

	@Test
	public void testRect() {
		ShapeConsole s = new ShapeConsole();
		assertEquals("Shape: (C)ircle or (R)ectangle?", s.messageChooseShape());
		assertEquals("Rectangle side A length?", s.selectShape("r"));
		assertEquals("Rectangle side B length?", s.rectA(5));
		assertEquals("Area=50\nCircumference=30", s.rectB(10));
	}
	
	@Test
	public void testCircle() {
		ShapeConsole s = new ShapeConsole();
		assertEquals("Shape: (C)ircle or (R)ectangle?", s.messageChooseShape());
		assertEquals("Circle radius?", s.selectShape("c"));
		assertEquals("Area=254.34\nCircumference=56.52", s.circleRadius(9));
	}
	
	@Test
	public void testRectParse() {
		ShapeConsole s = new ShapeConsole();
		assertEquals("Shape: (C)ircle or (R)ectangle?", s.input(""));
		assertEquals("Rectangle side A length?", s.input("r"));
		assertEquals("Rectangle side B length?", s.input("5"));
		assertEquals("Area=50\nCircumference=30", s.input("10"));
	}
	
	@Test
	public void testCircleParse() {
		ShapeConsole s = new ShapeConsole();
		assertEquals("Shape: (C)ircle or (R)ectangle?", s.input(""));
		assertEquals("Circle radius?", s.input("c"));
		assertEquals("Area=254.34\nCircumference=56.52", s.input("9"));
	}
}