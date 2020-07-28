package ec.ups.edu.controlador;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.ups.edu.ejb.CitaFacade;
import ec.ups.edu.ejb.PacienteFacade;
import ec.ups.edu.modelos.Citas;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class citasBean implements Serializable {
	private static final long serialVersionUID = 1L;
	@EJB
	private CitaFacade ejbCitasCabecera;
	private List<Citas>listaCi;
	
	
	public citasBean() {
		
	}

	@PostConstruct
	public void init() {	
		listaCi=ejbCitasCabecera.findAll();
	}

	public CitaFacade getEjbCitasCabecera() {
		return ejbCitasCabecera;
	}
	public void setEjbCitasCabecera(CitaFacade ejbCitasCabecera) {
		this.ejbCitasCabecera = ejbCitasCabecera;
	}
	public List<Citas> getListaCi() {
		return listaCi;
	}
	public void setListaCi(List<Citas> listaCi) {
		this.listaCi = listaCi;
	}
	
	
	
}
