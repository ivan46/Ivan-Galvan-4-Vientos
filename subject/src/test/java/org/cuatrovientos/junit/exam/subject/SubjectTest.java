/**
 * 
 */
package org.cuatrovientos.junit.exam.subject;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Iván Galván.
 *
 */
public class SubjectTest {



	@Test
	public void testConstructor() {
		Subject target = new Subject("Entornos");
		String expected = "Entornos";
		String actual = target.getName();
		
		assertEquals("Subject name ok", expected, actual);
	}

	@Test
	public void testExamMark() {
		Subject target = new Subject("Entornos");
		target.setExamMark(8.0f);
		float expected = 8.0f;
		float actual = target.getExamMark();
		
		assertEquals("Exam mark", expected, actual,0.01f);
	}
	
	@Test
	public void testHomeworkMark() {
		Subject target = new Subject("Entornos");
		target.setHomeworkMark(-8.0f);
		float expected = -1;
		float actual = target.getHomeworkMark();
		
		assertEquals("Homework mark", expected, actual,0.01f);
	}
	
	@Test
	public void testFinalMark() {
		Subject target = new Subject("Entornos");
		target.setHomeworkMark(5f);
		target.setExamMark(10f);
		float expected = 8.5f;
		float actual = target.finalMark();
		
		assertEquals("Final mark", expected, actual,0.01f);
	}
}
