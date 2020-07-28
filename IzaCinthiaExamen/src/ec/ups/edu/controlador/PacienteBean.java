package ec.ups.edu.controlador;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;

import ec.ups.edu.ejb.PacienteFacade;
import ec.ups.edu.modelos.Paciente;

public class PacienteBean implements Serializable {
	private static final long serialVersionUID = 1L;
	@EJB
	private PacienteFacade ejbPacienteCabecera;
	private String cedula;
	private String nombre;
	private String apellidos;
	private String telefono;
	private String direccion;
	private List<Paciente>listPaciente;
	
}
