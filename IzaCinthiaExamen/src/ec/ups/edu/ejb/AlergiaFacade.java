package ec.ups.edu.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.ups.edu.modelos.Alergias;

@Stateless
public class AlergiaFacade extends AbstractFacade<Alergias>{
	@PersistenceContext(unitName = "IzaCinthiaExamen")
    private EntityManager em;
    
    public  AlergiaFacade() {
	super(Alergias.class);
    }    

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
}
