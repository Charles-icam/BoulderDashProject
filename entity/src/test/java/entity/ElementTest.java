package entity;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import entity.mobile.Boulder;
import entity.mobile.MonsterG;
import entity.mobile.MonsterR;

/**
 *  <h1>la Classe ElementTest.</h1>
 * 
 */

public class ElementTest {
	static Boulder boulder;
	static MonsterG monsterG;
	static MonsterR monsterR;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void testElement() throws Exception {
		/**
		 * Instatiation des éléments
		 */
		boulder = new Boulder();
		monsterG = new MonsterG();
		monsterR = new MonsterR();
	}

	@Test
	public void testGetSprite() {
		//fail("Not yet implemented");
	}
	/**
	 * Test sur le getter de permeability
	 */
	@Test
	public void testGetPermeability() {
		//fail("Not yet implemented");
		Permeability testboulder = Permeability.BOULDER;
		Permeability testmonsterG = Permeability.KILLABLE;
		Permeability testmonsterR = Permeability.KILLABLE;
		assertEquals(testboulder, ElementTest.boulder.getPermeability());
		assertEquals(testmonsterG, ElementTest.monsterG.getPermeability());
		assertEquals(testmonsterR, ElementTest.monsterR.getPermeability());
	}
}
