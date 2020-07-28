package ec.ups.edu.controlador;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;

import ec.ups.edu.ejb.PacienteFacade;
import ec.ups.edu.ejb.SignosVitalesFacade;
import ec.ups.edu.modelos.SignosVitales;

public class SignosVitalesBean implements Serializable {
	private static final long serialVersionUID = 1L;
	@EJB
	private SignosVitalesFacade ejbSignosVitalesCabecera;
	private String precion;
	private String frecuenciaC;
	private String  frecuenciaR;
	private String temperatura;
	private String saturacion;
	
	private List<SignosVitales>listaSignos;
	
	@PostConstruct
	public void init() {	
		listaSignos=ejbSignosVitalesCabecera.findAll();
		
	}
		
	public String getPrecion() {
		return precion;
	}
	public void setPrecion(String precion) {
		this.precion = precion;
	}
	public String getFrecuenciaC() {
		return frecuenciaC;
	}
	public void setFrecuenciaC(String frecuenciaC) {
		this.frecuenciaC = frecuenciaC;
	}
	public String getFrecuenciaR() {
		return frecuenciaR;
	}
	public void setFrecuenciaR(String frecuenciaR) {
		this.frecuenciaR = frecuenciaR;
	}
	public String getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}
	public String getSaturacion() {
		return saturacion;
	}
	public void setSaturacion(String saturacion) {
		this.saturacion = saturacion;
	}
	
	public String add() {
		System.out.println("precion"+this.precion);
		System.out.println("frecuencia c"+this.frecuenciaC);
		System.out.println("frecuencia r"+this.frecuenciaR);
		System.out.println("tem"+this.temperatura);
		System.out.println("saturacion"+this.saturacion);
		return null;
		
	}
}
