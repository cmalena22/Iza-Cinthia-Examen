package ec.ups.edu.modelos;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Paciente
 *
 */
@Entity

public class Paciente implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private String cedula;
	private String nombre;
	private String apellidos;
	private String telefono;
	private String direccion;
	//citas
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "paciente")
	private List<Citas>listcitas;
	//sintomas
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "paciente")
	private List<Sintomas> sintoma;
	//alergia
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "paciente")
	private List<Alergias> alergia;
	//enfermedad
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "paciente")
	private List<EnfermedadesPrevias> enfermedadP;
	//signoas
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "paciente")
	private List<SignosVitales> signos;
	
	public Paciente() {
	
	}
	
	
	

	public Paciente(String cedula, String nombre, String apellidos, String telefono, String direccion) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.direccion = direccion;
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

	public List<Citas> getListcitas() {
		return listcitas;
	}

	public void setListcitas(List<Citas> listcitas) {
		this.listcitas = listcitas;
	}

	public List<Sintomas> getSintoma() {
		return sintoma;
	}

	public void setSintoma(List<Sintomas> sintoma) {
		this.sintoma = sintoma;
	}

	public List<Alergias> getAlergia() {
		return alergia;
	}

	public void setAlergia(List<Alergias> alergia) {
		this.alergia = alergia;
	}

	public List<EnfermedadesPrevias> getEnfermedadP() {
		return enfermedadP;
	}

	public void setEnfermedadP(List<EnfermedadesPrevias> enfermedadP) {
		this.enfermedadP = enfermedadP;
	}

	public List<SignosVitales> getSignos() {
		return signos;
	}

	public void setSignos(List<SignosVitales> signos) {
		this.signos = signos;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cedula == null) ? 0 : cedula.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		if (cedula == null) {
			if (other.cedula != null)
				return false;
		} else if (!cedula.equals(other.cedula))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return cedula;
	}
	
}
