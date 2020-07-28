package ec.ups.edu.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.ups.edu.modelos.Paciente;
import ec.ups.edu.modelos.SignosVitales;

@Stateless
public class SignosVitalesFacade extends AbstractFacade<SignosVitales>{
	@PersistenceContext(unitName = "IzaCinthiaExamen")
    private EntityManager em;
    
    public  SignosVitalesFacade() {
	super(SignosVitales.class);
    }    

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
}
