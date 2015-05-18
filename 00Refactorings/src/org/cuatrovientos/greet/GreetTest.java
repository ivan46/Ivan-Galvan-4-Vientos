package org.cuatrovientos.greet;
import static org.junit.Assert.*;

import org.junit.Test;


/**
 * @author Bad Taste 
 * test class for greet haha, you got it?
 * you're testing greet. It's brilliant
 */
public class GreetTest {

	@Test
	public void testGreetMethod() {
		Greet myGreet  = new Greet();

		String expected = "hola";
		String target = myGreet.greet(0, 1);
		assertEquals("Testing spanish greet once", expected, target);

		expected = "hellohello";
		target = myGreet.greet(1, 2);
		assertEquals("Testing english greet twice", expected, target);

		expected = "kaixokaixokaixokaixo";
		target = myGreet.greet(2, 4);
		assertEquals("Testing basque greet four times", expected, target);

	}

}
