/**
 * 
 */
package org.cuatrovientos.junit.exam.subject;

/**
 * Simple class representing a subject from school
 * @author Pello Altadill
 *
 */
public class Subject {
	private static final int DEFAULT_MARK = -1;
	private static final int MAXIMUM_MARK = 10;
	private static final int MINIMUM_MARK = 0;
	private static final float HOMEWORK_PERCENTAGE = 0.3f;
	private static final float EXAM_PERCENTAGE = 0.7f;
	private String name;
	private float examMark;
	private float homeworkMark;

	public Subject(String name) {
		this.name = name;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public void setExamMark(float examMark) {
		if (examMark >= MINIMUM_MARK && examMark <= MAXIMUM_MARK) {
			this.examMark = examMark;
		} else {
			this.examMark = DEFAULT_MARK;
		}
	}

	public float getExamMark() {
		return examMark;
	}

	/**
	 * @return the homeworkMark
	 */
	public float getHomeworkMark() {
		return homeworkMark;
	}

	/**
	 * @param homeworkMark the homeworkMark to set
	 */
	public void setHomeworkMark(float homeworkMark) {
		if (homeworkMark >= MINIMUM_MARK && homeworkMark <= MAXIMUM_MARK) {
			this.homeworkMark = homeworkMark;
		} else {
			this.homeworkMark = DEFAULT_MARK;
		}
	}

	/**
	 * works out final mark
	 * @return
	 */
	public float finalMark() {
		
		return examMark * EXAM_PERCENTAGE + homeworkMark * HOMEWORK_PERCENTAGE;
	}

}
