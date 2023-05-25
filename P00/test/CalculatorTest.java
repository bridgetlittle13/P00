import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	//code executed before all test methods
	
	@Before
	public void setUp() throws Exception {
		//code executed before each test method
	}
	
	@Test
	public void testAddExp() {
		//fail("Not yet implemented");
		int a=2*2*2*2;
		int b=3*3*3;
		
		Calculator cal= new Calculator();
		int actual=cal.add(a, b);
		
		int expected=43;
		assertEquals(expected,actual);
	}
	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a=4321;
		int b=1234;
		
		Calculator cal= new Calculator();
		int actual=cal.add(a, b);
		
		int expected=5555;
		assertEquals(expected,actual);
	}
	@Test
	public void testErrorAdd() {
		//fail("Not yet implemented");
		int a=-4321;
		int b=1234;
		
		Calculator cal=new Calculator();
		int actual=cal.add(a, b);
		
		int unexpected=-5555;
		assertNotEquals(unexpected,actual);
	}
	@Test
	public void testSubtract() {
		//fail("Not yet implemented");
		int a=3000;
		int b=1000;
		
		Calculator cal=new Calculator();
		int actual=cal.subtract(a, b);
		
		int expected=2000;
		assertEquals(expected,actual);
	}
	@Test
	public void testErrorSubtract() {
		//fail("Not yet implemented");
		int a=1000;
		int b=3000;
		
		Calculator cal=new Calculator();
		int actual=cal.subtract(a, b);
		
		int unexpected=2000;
		assertNotEquals(unexpected,actual);
	}
	
	@Test
	public void testMultiply() {
		//fail("Not yet implemented");
		int a=40;
		int b=30;
		
		Calculator cal=new Calculator();
		int actual=cal.multiply(a, b);
		
		int expected=1200;
		assertEquals(expected,actual);
	}
	@Test
	public void testErrorMultiply() {
		//fail("Not yet implemented");
		int a=-4;
		int b=0;
		
		Calculator cal=new Calculator();
		int actual=cal.multiply(a, b);
		
		int unexpected=0;
		assertEquals(unexpected,actual);
	}
	@Test
	public void testDivide() {
		//fail("Not yet implementation");
		int a=5000;
		int b=5;
		
		Calculator cal=new Calculator();
		int actual=cal.divide(a, b);
		
		int expected=1000;
		assertEquals(expected,actual);
		
	}
	//loa
	@Test
	public void testErrorDivide() {
		//fail("Not yet implemented");
		int a=-10;
		int b=2;
		
		Calculator cal=new Calculator();
		int actual=cal.divide(a, b);
		
		int unexpected=-5;
		assertEquals(unexpected,actual);
	}
	
	@After
	public void tearDown() throws Exception {
		//code executed after each test method
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//code executed after each test method
	}

}
