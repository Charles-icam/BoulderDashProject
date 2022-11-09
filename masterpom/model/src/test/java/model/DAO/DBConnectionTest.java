package model.DAO;

import static org.junit.Assert.*;

/**
 *  <h1>la Classe DBConnectionTest.</h1>
 * 
 */

import java.sql.Connection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DBConnectionTest {
	
	/**
	 * L'adresse URL
	 */
	private static String URL = "jdbc:mysql://localhost/jpublankproject1?autoReconnect=true&useSSL=false";
	/**
	 * l'utilisateur
	 */
	private static String USER = "root";
	/**
	 * le mot de passe 
	 */
	private static String PASSWD = "";

	private Connection connection = null;

	private DBConnection INSTANCE;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testGetInstance() {
		//fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testConnect() {
		//fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetConnection() {
		//fail("Not yet implemented"); // TODO
	}
	
	/**
	 * Test du getter de l'URL
	 */
	@Test
	public final void testGetURL() {
		//fail("Not yet implemented"); // TODO
		assertEquals(DBConnectionTest.URL, DBConnection.getURL());
	}
	
	/**
	 * Test du getter du USER
	 */
	@Test
	public final void testGetUSER() {
		assertEquals(DBConnectionTest.USER, DBConnection.getUSER());
	}

	/**
	 * Test du getter du PASSWD
	 */
	@Test
	public final void testGetPASSWD() {
		//fail("Not yet implemented"); // TODO
		assertEquals(DBConnectionTest.PASSWD, DBConnection.getPASSWD());
	}
}
