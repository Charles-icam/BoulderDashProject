package model;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import entity.IMap;
import entity.mobile.IMobile;

public class BoulderDashModelTest {
	private String mapFile;
	private int myPlayerStartX;
	private int myPlayerStartY;
	
	private IMap map;

	/** MON JEU. */
	private IMobile myPlayer;
	
	private final BoulderDashModel boulderDash = new BoulderDashModel(mapFile, 0, 0);
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testBoulderDashModel() {
		//fail("Not yet implemented");
	}

	@Test
	public void testGetMap() {
		assertEquals(this.map, this.boulderDash.getMap());
	}

	@Test
	public void testGetMyPlayer() {
		//fail("Not yet implemented");
	}

}
