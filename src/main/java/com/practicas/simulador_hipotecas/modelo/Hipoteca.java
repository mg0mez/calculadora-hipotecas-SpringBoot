package com.practicas.simulador_hipotecas.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 
 * Clase para contener los datos de una hipoteca
 * 
 * @author Marcos
 * @author Pablo
 *
 */
public class Hipoteca{
	
	public static final int NMENSUALIDADES = 12;

	// Atributos
	private double capitalInmueble;
	private double capitalAportado;
	private double totalIntereses;
	private double prestamo;
	private double cuota;
	private int plazo;
	private int plazoRestante;
	private float tasaInteres;
	private InteresTipo tipoInteres;
	public List<Amortizacion> amortizaciones = new ArrayList<>();
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date edad;
	private double ahorros;
	private double nomina;
	private double otrosPrestamos;
	private boolean primeraVivienda;

	// Constructores
	/////////////////////////////////////////////////////////////////
	
	/**
	 * 
	 * Constructor por defecto con datos por defecto
	 * 
	 */
	public Hipoteca() {
		
		this.capitalInmueble = 120000.0;
		this.capitalAportado = 40000.0;
		this.plazo = 2;
		this.tipoInteres = InteresTipo.fijo;
		this.ahorros = 0.0;
		this.nomina = 1000.0;
		this.otrosPrestamos = 10000.0;
		this.primeraVivienda = true;
		
	}

	/**
	 * 
	 * Constructor con parámetros
	 * 
	 * @param double totalIntereses
	 * @param double capitalInmueble
	 * @param double capitalAportado
	 * @param double prestamo
	 * @param double cuota
	 * @param int plazo
	 * @param int plazoRestante
	 * @param float tasaInteres
	 * @param InteresTipo tipoInteres
	 * @param List<Amortizacion> amortizaciones
	 * @param edad 
	 * @param double ahorros
	 * @param double nomina
	 * @param double otrosPrestamos
	 * @param boolean primeraVivienda
	 */
	public Hipoteca(double totalIntereses, double capitalInmueble, double capitalAportado, double prestamo,
			double cuota, int plazo, int plazoRestante, float tasaInteres, InteresTipo tipoInteres,
			List<Amortizacion> amortizaciones, Date edad, double ahorros, double nomina, double otrosPrestamos,
			boolean primeraVivienda) {
		super();
		this.totalIntereses = totalIntereses;
		this.capitalInmueble = capitalInmueble;
		this.capitalAportado = capitalAportado;
		this.prestamo = prestamo;
		this.cuota = cuota;
		this.plazo = plazo;
		this.plazoRestante = plazoRestante;
		this.tasaInteres = tasaInteres;
		this.tipoInteres = tipoInteres;
		this.amortizaciones = amortizaciones;
		this.edad = edad;
		this.ahorros = ahorros;
		this.nomina = nomina;
		this.otrosPrestamos = otrosPrestamos;
		this.primeraVivienda = primeraVivienda;
	}

	/**
	 * 
	 * Constructor que permite clonar una instancia de Hipoteca
	 * 
	 * @param Hipoteca hipoteca, objeto que se quiere clonar
	 */
	public Hipoteca(Hipoteca hipoteca) {
		this.capitalInmueble = hipoteca.getCapitalInmueble();
		this.capitalAportado = hipoteca.getCapitalAportado();
		this.prestamo = hipoteca.getPrestamo();
		this.cuota = hipoteca.getCuota();
		this.plazo = hipoteca.getPlazo();
		this.plazoRestante = hipoteca.getPlazoRestante();
		this.tasaInteres = hipoteca.getTasaInteres();
		this.tipoInteres = hipoteca.getTipoInteres();
	}

	/////////////////////////////////////////////////////////////////
	// Métodos de acceso
	////////////////////////////////////////////////////////////////

	public double getCapitalInmueble() {
		return capitalInmueble;
	}

	public void setCapitalInmueble(double capitalInmueble) {
		this.capitalInmueble = capitalInmueble;
	}

	public double getCapitalAportado() {
		return capitalAportado;
	}

	public void setCapitalAportado(double capitalAportado) {
		this.capitalAportado = capitalAportado;
	}

	public double getPrestamo() {
		return prestamo;
	}

	public void setPrestamo(double prestamo) {
		this.prestamo = prestamo;
	}

	public double getCuota() {
		return cuota;
	}

	public void setCuota(double cuota) {
		this.cuota = cuota;
	}

	public int getPlazo() {
		return plazo;
	}

	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}

	public float getTasaInteres() {
		return tasaInteres;
	}

	public void setTasaInteres(float tasaInteres) {
		this.tasaInteres = tasaInteres;
	}

	public InteresTipo getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(InteresTipo tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	public List<Amortizacion> getAmortizaciones() {
		return amortizaciones;
	}

	public void setAmortizaciones(List<Amortizacion> amortizaciones) {
		this.amortizaciones = amortizaciones;
	}
	
	public double getTotalIntereses() {
		return totalIntereses;
	}

	public void setTotalIntereses(double totalIntereses) {
		this.totalIntereses += totalIntereses;
	}
	
	public int getPlazoRestante() {
		return plazoRestante;
	}

	public void setPlazoRestante(int plazoRestante) {
		this.plazoRestante = plazoRestante;
	}
	
	public Date getEdad() {
		return edad;
	}

	public void setEdad(Date edad) {
		this.edad = edad;
	}

	public double getAhorros() {
		return ahorros;
	}

	public void setAhorros(double ahorros) {
		this.ahorros = ahorros;
	}

	public double getNomina() {
		return nomina;
	}

	public void setNomina(double nomina) {
		this.nomina = nomina;
	}

	public double getOtrosPrestamos() {
		return otrosPrestamos;
	}

	public void setOtrosPrestamos(double otrosPrestamos) {
		this.otrosPrestamos = otrosPrestamos;
	}

	public boolean isPrimeraVivienda() {
		return primeraVivienda;
	}

	public void setPrimeraVivienda(boolean primeraVivienda) {
		this.primeraVivienda = primeraVivienda;
	}
	
	/////////////////////////////////////////////////////////////////
	// Métodos

	/**
	 * Método para añadir una amortizacion a la hipoteca
	 * 
	 * @param Amortizacion amortizacion
	 */
	public void anadirAmortizacion(Amortizacion amortizacion) {
		this.amortizaciones.add(amortizacion);
	}
	
	/**
	 * 
	 * Método para comprobar si la hipoteca es de tipo fijo
	 * 
	 * @return boolean true, si es una hipoteca de tipo fijo
	 */
	public boolean esTipoFijo() {
		if(this.tipoInteres == (InteresTipo.fijo)) return true;
		return false;
	}

	/**
	 * 
	 * Método para calcular el importe final del préstamo
	 * 
	 * 
	 */
	public void calcularValorDelPrestamo() {
		
		double capitalInmueble = this.getCapitalInmueble();
		double capitalAportado = this.getCapitalAportado();
		
		double prestamo = capitalInmueble-capitalAportado;
		this.setPrestamo(prestamo);
			
	}
	
	/**
	 * 
	 * Método para transformar el plazo en años en mensualidades
	 * 
	 * @return int número de mensualidades
	 */
	public int calcularNCuotas () {
		
		return this.plazo * Hipoteca.NMENSUALIDADES;
		
	}
	
	/**
	 * 
	 * Método para recalcular los plazos restantes de la hipoteca
	 * 
	 * @param Hipoteca hipoteca
	 */
	public void recalcularPlazoRestante(Hipoteca hipoteca) {
		
		hipoteca.setPlazoRestante(hipoteca.getPlazoRestante()-Hipoteca.NMENSUALIDADES);
		
	}
	
	@Override
	public String toString() {
		return "Hipoteca [totalIntereses=" + totalIntereses + ", capitalInmueble=" + capitalInmueble
				+ ", capitalAportado=" + capitalAportado + ", prestamo=" + prestamo + ", cuota=" + cuota + ", plazo="
				+ plazo + ", plazoRestante=" + plazoRestante + ", tasaInteres=" + tasaInteres + ", tipoInteres="
				+ tipoInteres + ", amortizaciones=" + amortizaciones + ", edad=" + edad + ", ahorros=" + ahorros
				+ ", nomina=" + nomina + ", otrosPrestamos=" + otrosPrestamos + ", primeraVivienda=" + primeraVivienda
				+ "]";
	}
	




}
