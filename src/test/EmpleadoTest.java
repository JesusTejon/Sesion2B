package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Empleado;
import pkg.Empleado.TipoEmpleado;

class EmpleadoTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCalculaNominaEmpleadoEncargado() {
		float expected = 2500;
		float actual = Empleado.CalculaNominaEmpleado(Empleado.TipoEmpleado.Encargado,0, 0);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculaNominaVendedor() {
		float expected = 2000;
		float actual = Empleado.CalculaNominaEmpleado(Empleado.TipoEmpleado.Vendedor,0, 0);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculaNominaOtro() {
		float expected = 0;
		float actual = Empleado.CalculaNominaEmpleado(Empleado.TipoEmpleado.otro,0, 0);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculaNominaVMnNegativa() {
		fail("Not yet implemented");
	}
	
	@Test
	void testCalculaNominaVMmenor1000() {
		fail("Not yet implemented");
	}
	
	@Test
	void testCalculaNominaVM1000_1500() {
		fail("Not yet implemented");
	}
	
	@Test
	void testCalculaNominaVMMayor1500() {
		fail("Not yet implemented");
	}
	
	@Test
	void testCalculaNominaHXPositivas() {
		fail("Not yet implemented");
	}
	
	@Test
	void testCalculaNominaHXNegativa() {
		fail("Not yet implemented");
	}

	@Test
	void testCalculoNominaNetaNegativa() {
		fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaNetaMenos2100() {
		fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaNetaEntre2100_2500() {
		fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaNetaMayor2500() {
		fail("Not yet implemented");
	}

}
