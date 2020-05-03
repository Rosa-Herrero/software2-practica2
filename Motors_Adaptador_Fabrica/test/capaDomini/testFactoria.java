package capaDomini;

import static org.junit.Assert.*;
import org.junit.Test;

public class testFactoria {
	
	/*Pendent implementar
	private ????? motor;
	*/
	
	@Test
	public void testFactoriaMotorElectric() {
		System.out.println("\n******************Provar el Motor Elèctric*********************");
		//motor = //Pendent implementar
		this.testEncendre();
		this.testAccelerar();
		this.testApagar();
	}
	
	@Test
	public void testFactoriaMotorGasolina() {	
		System.out.println("\n******************Provar el Motor Gasolina*********************");
		//motor = //Pendent implementar
		this.testEncendre();
		this.testAccelerar();
		this.testApagar();
	}
	
	@Test
	public void testFactoriaMotorGasoil() {
		System.out.println("\n******************Provar el Motor Gasoil*********************");
		//motor = //Pendent implementar
		this.testEncendre();
		this.testAccelerar();
		this.testApagar();
	}


	private void testEncendre() {
		try {
			System.out.println(this.motor.encendre());
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}


	private void testAccelerar() {
		try {
			System.out.println(this.motor.accelerar());
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}


	private void testApagar() {
		try {
			System.out.println(this.motor.apagar());
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

}