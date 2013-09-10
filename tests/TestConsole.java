import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import ShapeChecker.*;

public class TestConsole {
	
	@Test
	public void testRect() {
		ShapeConsole s = new ShapeConsole();
		assertEquals("Shape: (C)ircle or (R)ectangle?", s.input(""));
		assertEquals("Rectangle side A length?", s.input("r"));
		assertEquals("Rectangle side B length?", s.input("5"));
		assertEquals("Area=50\nCircumference=30", s.input("10"));
	}
	
	@Test
	public void testCircle() {
		ShapeConsole s = new ShapeConsole();
		assertEquals("Shape: (C)ircle or (R)ectangle?", s.input(""));
		assertEquals("Circle radius?", s.input("c"));
		assertEquals("Area=254.34\nCircumference=56.52", s.input("9"));
	}
}