package entity.mobile;

import static org.junit.Assert.*;

/**
 *  <h1>la Classe DiamondTest.</h1>
 * 
 */

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DiamondTest {
	
	private Diamond diamond = new Diamond();
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
	 * Test du getter des diamonds
	 */
	@Test
	public void testGetDiamonds() {
		assertEquals(0, this.diamond.getDiamonds());
	}

}
