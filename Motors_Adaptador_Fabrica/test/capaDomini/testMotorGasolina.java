package capaDomini;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class testMotorGasolina {
	
	private static MotorGasolina motor;
	
	@BeforeClass
	public static void initialization(){
		System.out.println("\n******************Provar el Motor de Gasolina*********************");
		
		motor = new MotorGasolina();
	}

	@Test
	public void testEncendre() {
		try {
			System.out.println(motor.encendre());
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testAccelerar() {
		try {
			System.out.println(motor.accelerar());
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testApagar() {
		try {
			System.out.println(motor.apagar());
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

}
