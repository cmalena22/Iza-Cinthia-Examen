package ec.ups.edu.controlador;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.ups.edu.ejb.SignosVitalesFacade;

import ec.ups.edu.modelos.SignosVitales;



@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class signosBean implements Serializable {
	private static final long serialVersionUID = 1L;
	@EJB
	private SignosVitalesFacade ejSignosFacade;
	private String precion;
	private String frecuenciaC;
	private String  frecuenciaR;
	private String temperatura;
	private String saturacion;
	private String cita;
	private List<SignosVitales>listSignos;
	@PostConstruct
	public void init() {	
		listSignos=ejSignosFacade.findAll();
	}
	public SignosVitalesFacade getEjSignosFacade() {
		return ejSignosFacade;
	}
	public void setEjSignosFacade(SignosVitalesFacade ejSignosFacade) {
		this.ejSignosFacade = ejSignosFacade;
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
	public List<SignosVitales> getListSignos() {
		return listSignos;
	}
	public void setListSignos(List<SignosVitales> listSignos) {
		this.listSignos = listSignos;
	}
	
	
	public String getCita() {
		return cita;
	}
	public void setCita(String cita) {
		this.cita = cita;
	}
	public String add() {
		System.out.println("Presion"+this.precion);
		System.out.println("Frecuencia c"+this.frecuenciaC);
		System.out.println("Frreciencia R0"+this.frecuenciaR);
		System.out.println("tempe"+this.temperatura);
		System.out.println("Saturacion"+this.saturacion);
		return null;
	}
	
}
