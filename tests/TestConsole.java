import static org.junit.Assert.*;
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
		assertEquals("Area=78.5\nCircumference=31.400000000000002", s.circleRadius(5));
	}
}