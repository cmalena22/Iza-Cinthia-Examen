package ec.ups.edu.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.ups.edu.modelos.Paciente;
import ec.ups.edu.modelos.Sintomas;

@Stateless
public class SintomasFacade extends AbstractFacade<Sintomas>{
	@PersistenceContext(unitName = "IzaCinthiaExamen")
    private EntityManager em;
    
    public  SintomasFacade() {
	super(Sintomas.class);
    }    

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
}
