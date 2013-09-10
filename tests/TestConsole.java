import static org.junit.Assert.*;
import org.junit.Test;
import ShapeChecker.*;


public class TestConsole {

	@Test
	public void testIO() {
		ShapeConsole s = new ShapeConsole();
		assertEquals("Shape: (C)ircle or (R)ectangle?", s.messageChooseShape());
		assertEquals("Rectangle side A length?", s.selectShape("r"));
	}
}
