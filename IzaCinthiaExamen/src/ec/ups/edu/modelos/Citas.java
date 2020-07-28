package ec.ups.edu.modelos;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Citas
 *
 */
@Entity

public class Citas implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String fecha;
	private String hora;
	private int duracion;
	@ManyToOne
	@JoinColumn
	private Paciente paciente;
	public Citas() {
		
	}
	
	
	
	
	public Citas(String fecha, String hora, int duracion, Paciente paciente) {
		super();
		this.fecha = fecha;
		this.hora = hora;
		this.duracion = duracion;
		this.paciente = paciente;
	}




	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		Citas other = (Citas) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Citas [id=" + id + ", fecha=" + fecha + ", hora=" + hora + ", duracion=" + duracion + ", paciente="
				+ paciente + "]";
	}
   
}
