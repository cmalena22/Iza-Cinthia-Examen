package ec.ups.edu.modelos;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: EnfermedadesPrevias
 *
 */
@Entity

public class EnfermedadesPrevias implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nombre;
	@ManyToOne 
	@JoinColumn
	private Paciente paciente;

	public EnfermedadesPrevias() {
		
	}

	public EnfermedadesPrevias(String nombre, Paciente paciente) {
		super();
		this.nombre = nombre;
		this.paciente = paciente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		EnfermedadesPrevias other = (EnfermedadesPrevias) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EnfermedadesPrevias [id=" + id + ", nombre=" + nombre + ", paciente=" + paciente + "]";
	}
	
	
	
	
	
   
}
