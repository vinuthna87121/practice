package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class MathUtilsTest {
	
	MathUtils mathutils;
	@BeforeAll
	static void beforeall() {
		System.out.println("Before all");
	}
	
	@BeforeEach
	void initialize() {
		mathutils =new MathUtils();
		
	}
	@AfterEach
	void cleanup() {
		System.out.println("cleaning up..");
	}
	
	@Nested
	class addTest {
		
	

	@Test
	void testadd() {
		
		
		assertEquals(4,mathutils.add(2, 2));
		
	}
	@Test
  void testaddnegative() {
		
		
		assertEquals(-6,mathutils.add(-3,-3));
		
	}
	}
	@DisplayName("Dividing numbers")
	@RepeatedTest(3)
	void testdivide() {
	
	assertThrows(ArithmeticException.class, ()-> mathutils.divide(5, 0));
	

}
	
	@Test
	@DisplayName("shouldn't run")
	@Disabled
	void disable() {
		fail("shouldnt run");
		
	}
	
}
