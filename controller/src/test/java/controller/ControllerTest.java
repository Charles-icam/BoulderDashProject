package controller;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.IModel;
import contract.IOrderPerformer;
import contract.IView;
import contract.UserOrder;

/**
 *  <h1>la Classe ControllerTest.</h1>
 * 
 */

public class ControllerTest {
	private IView view;
	private IModel model;

	private final Controller controller = new Controller(view, model);
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
	public void testGetOrderPerformer() {
		//assertEquals(this, this.controller.getOrderPerformer());
	}

	@Test
	public void testOrderPerform() {
		//fail("Not yet implemented");
	}

}
