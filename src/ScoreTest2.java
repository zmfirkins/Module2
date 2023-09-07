import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.AverageScores;

public class ScoreTest2 {
	 AverageScores two = new AverageScores("Alex", 13, 21, 16);
	@Before
	public void setUp() throws Exception {
	}
	@Test
	public void test() {
	assertEquals("Name: Alex Average Score: 16.0", two.Final());
		}
	@Test
	public void testNotNull() {
	assertNotNull(two.Final( ));
	}

}
