package ec.ups.edu.modelos;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: SignosVitales
 *
 */
@Entity

public class SignosVitales implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String precion;
	private String frecuenciaC;
	private String  frecuenciaR;
	private String temperatura;
	private String saturacion;
	
	@ManyToOne 
	@JoinColumn
	private Paciente paciente;
	public SignosVitales() {
		
	}
	
	
	
	
	
	public SignosVitales(String precion, String frecuenciaC, String frecuenciaR, String temperatura, String saturacion,
			Paciente paciente) {
		super();
		this.precion = precion;
		this.frecuenciaC = frecuenciaC;
		this.frecuenciaR = frecuenciaR;
		this.temperatura = temperatura;
		this.saturacion = saturacion;
		this.paciente = paciente;
	}





	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		SignosVitales other = (SignosVitales) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "SignosVitales [id=" + id + ", precion=" + precion + ", frecuenciaC=" + frecuenciaC + ", frecuenciaR="
				+ frecuenciaR + ", temperatura=" + temperatura + ", saturacion=" + saturacion + ", paciente=" + paciente
				+ "]";
	}
   
}
