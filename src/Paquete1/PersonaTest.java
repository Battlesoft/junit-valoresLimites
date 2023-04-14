package Paquete1;

import org.junit.Test;
import static org.junit.Assert.*;


public class PersonaTest {
	
	@Test public void test2() {
		Persona p = new Persona(17);
		assertFalse(p.isMayorDeEdad());
	}
	
	@Test public void test3() {
		Persona p = new Persona(0);
		assertFalse(p.isMayorDeEdad());
	}
	
	@Test public void test4() {
		Persona p = new Persona(17);
		assertFalse(p.isMayorDeEdad());
	}
	
	@Test public void test5() {
		Persona p = new Persona(0);
		assertFalse(p.isMayorDeEdad());
	}
	
	@Test public void test6() {
		Persona p = new Persona(17);
		assertFalse(p.isMayorDeEdad());
	}
	
	@Test (expected = AssertionError.class)
	
	public void test1() {
		Persona p = new Persona(-1);
		assertFalse(p.isMayorDeEdad());
	}
	
	
	
	
}
