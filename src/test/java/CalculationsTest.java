
//import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.sushma.application.Calculations;
public class CalculationsTest {
	static Calculations calc;

	@BeforeClass
	public static void InitClass() {
		System.out.println("CalculationsTest.InitClass()");
		calc = new Calculations();
	}

	@Before
	public void beforeEachMEehod() {
		System.out.println("CalculationsTest.beforeEachMEehod()");
	}

	/*
	 * @After public void afterEachMethod() {
	 * System.out.println("CalculationsTest.afterEachMethod()"); }
	 */
	
	@Test
	public void checkAddition() {
		System.out.println("CalculationsTest.checkAddition()");
		// System.out.println(calc.addition(12, 15));

		Assert.assertEquals(27, calc.addition(12, 15));
	}

	@Test
	public void checkMultiplication() {
		System.out.println("CalculationsTest.checkMultiplication()");
		Assert.assertEquals(200, calc.multiply(10, 20));

	}

	
    

	@Test
	@Ignore
	public void checkSubstraction() {
		Assert.assertEquals(8, calc.substraction(20, 12));
	}
 
}
