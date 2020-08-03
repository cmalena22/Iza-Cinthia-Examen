package ec.ups.edu.controlador;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Named;

import ec.ups.edu.ejb.CitaFacade;
import ec.ups.edu.ejb.PacienteFacade;
import ec.ups.edu.ejb.SignosVitalesFacade;
import ec.ups.edu.modelos.Citas;
import ec.ups.edu.modelos.Paciente;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class PacienteBean implements Serializable {
	private static final long serialVersionUID = 1L;
	@EJB
	private PacienteFacade ejbPacienteCabecera;
	@EJB
	private SignosVitalesFacade ejbSignosVitales;
	@EJB
	private CitaFacade ejbCitaFacade;
	private String fecha;
	private String hora;
	private int duracion;
	private List<Paciente>listPaciente;
	private String paciente;
	private String cedula;
	private String nombre;
	private String apellidos;
	private String telefono;
	private String direccion;
	@PostConstruct
	public void init() {	
		listPaciente=ejbPacienteCabecera.findAll();
	}

	
	
	
	public CitaFacade getEjbCitaFacade() {
		return ejbCitaFacade;
	}




	public void setEjbCitaFacade(CitaFacade ejbCitaFacade) {
		this.ejbCitaFacade = ejbCitaFacade;
	}




	public String getPaciente() {
		return paciente;
	}

	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}

	public PacienteFacade getEjbPacienteCabecera() {
		return ejbPacienteCabecera;
	}

	public void setEjbPacienteCabecera(PacienteFacade ejbPacienteCabecera) {
		this.ejbPacienteCabecera = ejbPacienteCabecera;
	}

	public SignosVitalesFacade getEjbSignosVitales() {
		return ejbSignosVitales;
	}

	public void setEjbSignosVitales(SignosVitalesFacade ejbSignosVitales) {
		this.ejbSignosVitales = ejbSignosVitales;
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
	
	public List<Paciente> getListPaciente() {
		return listPaciente;
	}

	public void setListPaciente(List<Paciente> listPaciente) {
		this.listPaciente = listPaciente;
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

	public String add(AjaxBehaviorEvent event) {
		
		System.out.println("fecha"+this.fecha);
		System.out.println("hor"+this.hora);
		System.out.println("Duracion"+this.duracion);
		System.out.println("paciente"+this.paciente);
		buscarPa();
		this.nombre=buscarPa().getNombre();
		this.apellidos=buscarPa().getApellidos();
		this.direccion=buscarPa().getDireccion();
		
		return null;
		
	}
	
	public Paciente buscarPa() {
		Paciente pa= new Paciente();
		pa=ejbPacienteCabecera.find(paciente);
		System.out.println("busque "+pa.toString());
		return pa;
		
	}
	
	public String rePa() {
		
		Citas ci= new Citas(this.fecha,this.hora,this.duracion,buscarPa());
		ejbCitaFacade.create(ci);
		return null;
		
	}
}
