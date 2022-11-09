package entity.mobile;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *  <h1>la Classe BoulderTest.</h1>
 * 
 */

public class BoulderTest {
	private Boulder boulder = new Boulder();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}
	/**
	 * Test sur le getter des diamonds
	 */
	@Test
	public void testGetDiamonds() {
		assertEquals(0, this.boulder.getDiamonds());
	}

}
