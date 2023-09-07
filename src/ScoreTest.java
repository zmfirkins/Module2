import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.AverageScores;

public class ScoreTest {

	
	 AverageScores one = new AverageScores("Zoie", 12, 43, 21);
	@Before
	public void setUp() throws Exception {
	}
	@Test
	public void test() {
	assertEquals("Name: Zoie Average Score: 25.0", one.Final());
	}
}
	

