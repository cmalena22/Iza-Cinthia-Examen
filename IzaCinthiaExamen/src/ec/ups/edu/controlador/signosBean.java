package ec.ups.edu.controlador;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.ups.edu.ejb.CitaFacade;
import ec.ups.edu.ejb.SignosVitalesFacade;
import ec.ups.edu.modelos.Citas;
import ec.ups.edu.modelos.SignosVitales;



@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class signosBean implements Serializable {
	private static final long serialVersionUID = 1L;
	@EJB
	private SignosVitalesFacade ejSignosFacade;
	@EJB
	private CitaFacade ejCitaFacade;
	private String precion;
	private String frecuenciaC;
	private String  frecuenciaR;
	private String temperatura;
	private String saturacion;
	private String cita;
	private String fecha;
	private String hora;
	private int duracion;
	private String alergia;
	private String enfermedades;
	private String sintomas;
	
	
	//cliente
	
	private String cedula;
	private String nombre;
	private String apellidos;
	private String telefono;
	private String direccion;
	
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
	
	
	
	public String getAlergia() {
		return alergia;
	}
	public void setAlergia(String alergia) {
		this.alergia = alergia;
	}
	public String getEnfermedades() {
		return enfermedades;
	}
	public void setEnfermedades(String enfermedades) {
		this.enfermedades = enfermedades;
	}
	public String getSintomas() {
		return sintomas;
	}
	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}
	
	
	public CitaFacade getEjCitaFacade() {
		return ejCitaFacade;
	}
	public void setEjCitaFacade(CitaFacade ejCitaFacade) {
		this.ejCitaFacade = ejCitaFacade;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	
	
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String add() {
		System.out.println("Presion"+this.precion);
		System.out.println("Frecuencia c"+this.frecuenciaC);
		System.out.println("Frreciencia R0"+this.frecuenciaR);
		System.out.println("tempe"+this.temperatura);
		System.out.println("Saturacion"+this.saturacion);
		System.out.println("sintomas"+this.sintomas);
		System.out.println("enferm"+this.enfermedades);
		System.out.println("Aler"+this.alergia);
		System.out.println("Cita recuperada");
		Citas c=  new Citas();
		int ci= Integer.valueOf(cita);
		c=ejCitaFacade.find(ci);
		System.out.println("cita"+c.toString());
		this.cita=String.valueOf(c.getId());
		this.fecha=c.getFecha();
		this.duracion=c.getDuracion();
		this.hora=c.getHora();
		this.nombre=c.getPaciente().getNombre();
		this.apellidos=c.getPaciente().getApellidos();
		this.direccion=c.getPaciente().getDireccion();
		
		
		return null;
	}
	
}
