package controller;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.IModel;
import contract.IView;
import contract.UserOrder;

public class ControllerTest {

	private IView view;
	private IModel model;
	Controller controller = new Controller(view, model);
	UserOrder stackOrder;
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
	public void testKillPlayer() {
		//fail("Not yet implemented");
	}

	@Test
	public void testGravityDiamond() {
		//fail("Not yet implemented");
	}

	@Test
	public void testMoveGMonster() {
		//fail("Not yet implemented");
	}

	@Test
	public void testMGMoveRight() {
		//fail("Not yet implemented");
	}

	@Test
	public void testMGMoveLeft() {
		//fail("Not yet implemented");
	}

	@Test
	public void testMoveRMonster() {
		//fail("Not yet implemented");
	}

	@Test
	public void testGetOrderPerformer() {
		//fail("Not yet implemented");
		assertEquals(this, this.controller.getOrderPerformer());
	}

}
