package entity;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import entity.mobile.Boulder;
import entity.mobile.Diamond;
import entity.mobile.MonsterG;
import entity.mobile.MonsterR;

public class SpriteTest {
	static Boulder boulder;
	static MonsterG monsterG;
	static MonsterR monsterR;
	static Diamond diamond;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		boulder = new Boulder();
		monsterG = new MonsterG();
		monsterR = new MonsterR();
		diamond = new Diamond();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSpriteCharString() {
		//Tester si les valeurs attendues sont les mêmes
		String file = "boulder.png";
		assertEquals(file, SpriteTest.boulder.getSprite().getImageName());
		String file2 = "greenMonster.png";
		assertEquals(file2, SpriteTest.monsterG.getSprite().getImageName());
		String file3 = "redMonster.png";
		assertEquals(file3, SpriteTest.monsterR.getSprite().getImageName());
		String file4 = "diamond.png";
		assertEquals(file4, SpriteTest.diamond.getSprite().getImageName());
	}
}
