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
		float expected = -1;
		float actual = Empleado.CalculaNominaEmpleado(Empleado.TipoEmpleado.otro,0, 0);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculaNominaVMnNegativa() {
		float expected = -1;
		float actual = Empleado.CalculaNominaEmpleado(Empleado.TipoEmpleado.Vendedor,-56, 0);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculaNominaVMmenor1000() {
		float expected = 2000;
		float actual = Empleado.CalculaNominaEmpleado(Empleado.TipoEmpleado.Vendedor,56, 0);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculaNominaVM1000_1500() {
		float expected = 2000+100;
		float actual = Empleado.CalculaNominaEmpleado(Empleado.TipoEmpleado.Vendedor,1000, 0);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculaNominaVMMayor1500() {
		float expected = 2000+200;
		float actual = Empleado.CalculaNominaEmpleado(Empleado.TipoEmpleado.Vendedor,1500, 0);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculaNominaHXPositivas() {
		float expected = 2000+30*30;
		float actual = Empleado.CalculaNominaEmpleado(Empleado.TipoEmpleado.Vendedor,0, 30);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculaNominaHXNegativa() {
		float expected = -1;
		float actual = Empleado.CalculaNominaEmpleado(Empleado.TipoEmpleado.Vendedor,0, -30);
		assertEquals(expected, actual);
	}

	@Test
	void testCalculoNominaNetaNegativa() {
		float expected = -1;
		float actual = Empleado.calculoNominaNeta(-21);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaNetaMenos2100() {
		float expected = 1500;
		float actual = Empleado.calculoNominaNeta(1500);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaNetaEntre2100_2500() {
		float expected = 2200*(1-0.15f);
		float actual = Empleado.calculoNominaNeta(2200);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaNetaMayor2500() {
		float expected = 3000*(1-0.18f);
		float actual = Empleado.calculoNominaNeta(3000);
		assertEquals(expected, actual);
	}

}
