package com.practicas.simulador_hipotecas.modelo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HipotecaTest {

	Hipoteca hipoteca2;
	Amortizacion amortizacion;
	List<Amortizacion> amortizaciones = new ArrayList<>();
	
	@BeforeEach
	void setUp() throws Exception {
		
		hipoteca2 = new Hipoteca(25000.0,200000.0,40000.0,80000.0,1000.0,1,2,1.0f,InteresTipo.fijo, null, new Date(),15000.0,2500.0,1000.0,true);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testHipotecaDoubleDoubleDoubleDoubleIntFloatInteresTipoListOfAmortizacionInt() {
		assertAll("Constructor hipoteca2 1",
				()-> assertEquals(120000.0, hipoteca2.getCapitalInmueble()),
				()-> assertEquals(40000.0, hipoteca2.getCapitalAportado()),
				()-> assertEquals(80000.0, hipoteca2.getPrestamo()),
				()-> assertEquals(1000.0, hipoteca2.getCuota()),
				()-> assertEquals(1, hipoteca2.getPlazo()),
				()-> assertEquals(1.0f, hipoteca2.getTasaInteres()),
				()-> assertEquals(InteresTipo.fijo, hipoteca2.getTipoInteres()),
				()-> assertEquals(amortizaciones, hipoteca2.getAmortizaciones()),
				()-> assertEquals(1, hipoteca2.getPlazoRestante())
				);
	}

	@Test
	void testHipotecaDoubleDoubleDoubleDoubleDoubleIntIntFloatInteresTipoListOfAmortizacionDateDoubleDoubleDoubleBoolean() {
		assertAll("Constructor hipoteca2 2",
				()-> assertEquals(25000.0, hipoteca2.getTotalIntereses()),
				()-> assertEquals(200000.0, hipoteca2.getCapitalInmueble()),
				()-> assertEquals(40000.0, hipoteca2.getCapitalAportado()),
				()-> assertEquals(80000.0, hipoteca2.getPrestamo()),
				()-> assertEquals(1000.0, hipoteca2.getCuota()),
				()-> assertEquals(1, hipoteca2.getPlazo()),
				()-> assertEquals(2, hipoteca2.getPlazoRestante()),
				()-> assertEquals(1.0f, hipoteca2.getTasaInteres()),
				()-> assertEquals(InteresTipo.fijo, hipoteca2.getTipoInteres()),
				()-> assertEquals(null, hipoteca2.getAmortizaciones()),
				()-> assertEquals(new Date(), hipoteca2.getEdad()),	//DA ERROR
				()-> assertEquals(15000.0, hipoteca2.getAhorros()),
				()-> assertEquals(2500.0, hipoteca2.getNomina()),
				()-> assertEquals(1000.0, hipoteca2.getOtrosPrestamos()),
				()-> assertEquals(true, hipoteca2.isPrimeraVivienda())
				);
	}

	@Test
	void testHipotecaHipoteca() {
		assertNotEquals(null, hipoteca2);
	}

	@Test
	void testGetCapitalInmueble() {
		assertEquals(120000.0, hipoteca2.getCapitalInmueble());
	}

	@Test
	void testSetCapitalInmueble() {
		hipoteca2.setCapitalInmueble(1000.0);
		assertEquals(1000.0, hipoteca2.getCapitalInmueble());
	}

	@Test
	void testGetCapitalAportado() {
		assertEquals(40000.0, hipoteca2.getCapitalAportado());
	}

	@Test
	void testSetCapitalAportado() {
		hipoteca2.setCapitalAportado(1000.0);
		assertEquals(1000.0, hipoteca2.getCapitalAportado());
	}

	@Test
	void testGetPrestamo() {
		assertEquals(80000.0, hipoteca2.getPrestamo());
	}

	@Test
	void testSetPrestamo() {
		hipoteca2.setPrestamo(1000.0);
		assertEquals(1000.0, hipoteca2.getPrestamo());
	}

	@Test
	void testGetCuota() {
		assertEquals(1000.0, hipoteca2.getCuota());
	}

	@Test
	void testSetCuota() {
		hipoteca2.setCuota(10000.0);
		assertEquals(10000.0, hipoteca2.getCuota());
	}

	@Test
	void testGetPlazo() {
		assertEquals(1, hipoteca2.getPlazo());
	}

	@Test
	void testSetPlazo() {
		hipoteca2.setPlazo(5);
		assertEquals(5, hipoteca2.getPlazo());
	}

	@Test
	void testGetTasaInteres() {
		assertEquals(1.0f, hipoteca2.getTasaInteres());
	}

	@Test
	void testSetTasaInteres() {
		hipoteca2.setTasaInteres(5.0f);
		assertEquals(5.0f, hipoteca2.getTasaInteres());
	}

	@Test
	void testGetTipoInteres() {
		assertEquals(InteresTipo.fijo, hipoteca2.getTipoInteres());
	}

	@Test
	void testSetTipoInteres() {
		hipoteca2.setTipoInteres(InteresTipo.variable);
		assertEquals(InteresTipo.variable, hipoteca2.getTipoInteres());
	}

	@Test
	void testGetAmortizaciones() {
		assertEquals(amortizaciones, hipoteca2.getAmortizaciones());
	}

	@Test
	void testSetAmortizaciones() {
		hipoteca2.setAmortizaciones(null);
		assertEquals(null, hipoteca2.getAmortizaciones());
	}

	@Test
	void testGetTotalIntereses() {
		assertEquals(25000.0, hipoteca2.getTotalIntereses());
	}

	@Test
	void testSetTotalIntereses() {
		hipoteca2.setTotalIntereses(35000.0);
		assertEquals(60000.0, hipoteca2.getTotalIntereses());	//ES UN +=
	}

	@Test
	void testGetPlazoRestante() {
		 assertEquals(2, hipoteca2.getPlazoRestante());
	}

	@Test
	void testSetPlazoRestante() {
		hipoteca2.setPlazoRestante(5);
		assertEquals(5, hipoteca2.getPlazoRestante());
	}

	@Test
	void testHipoteca() {
		assertNotEquals(null, hipoteca2);	
	}

	@Test
	void testGetEdad() {
		assertEquals(new Date(), hipoteca2.getEdad());
	}

	@Test
	void testSetEdad() {
		hipoteca2.setEdad(new Date());
		assertEquals(new Date(), hipoteca2.getEdad());
	}

	@Test
	void testGetAhorros() {
		assertEquals(15000.0, hipoteca2.getAhorros());
	}

	@Test
	void testSetAhorros() {
		hipoteca2.setAhorros(1000.0);
		assertEquals(1000.0, hipoteca2.getAhorros());
	}

	@Test
	void testGetNomina() {
		assertEquals(2500.0, hipoteca2.getNomina());
	}

	@Test
	void testSetNomina() {
		hipoteca2.setNomina(1000.0);
		assertEquals(1000.0, hipoteca2.getNomina());
	}

	@Test
	void testGetOtrosPrestamos() {
		assertEquals(1000.0, hipoteca2.getOtrosPrestamos());
	}

	@Test
	void testSetOtrosPrestamos() {
		hipoteca2.setOtrosPrestamos(2000.0);
		assertEquals(2000.0, hipoteca2.getOtrosPrestamos());
	}

	@Test
	void testIsPrimeraVivienda() {
		assertEquals(true, hipoteca2.isPrimeraVivienda());
	}

	@Test
	void testSetPrimeraVivienda() {
		hipoteca2.setPrimeraVivienda(false);
		assertEquals(false, hipoteca2.isPrimeraVivienda());
	}

	@Test
	void testAnadirAmortizacion() {
		fail("Not yet implemented");
	}

	@Test
	void testEsTipoFijo() {
		assertEquals(InteresTipo.fijo, hipoteca2.getTipoInteres());
	}

	@Test
	void testCalcularValorDelPrestamo() {
		fail("Not yet implemented");
	}

	@Test
	void testCalcularNCuotas() {
		assertEquals(12, hipoteca2.getPlazo()*12);
	}

	@Test
	void testRecalcularPlazoRestante() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		
	}

}