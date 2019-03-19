import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTest {

	@Test
	public void test() {
		Student<Character> s1 = new Student<Character>('A');
		assertEquals('A', s1.getGrade().charValue());
		
		Student<Integer> s2 = new Student<Integer>(91);
		assertEquals(91, s2.getGrade().intValue());
	}

}
