package ec.ups.edu.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import ec.ups.edu.modelos.Citas;

@Stateless
public class CitaFacade extends AbstractFacade<Citas>{
	@PersistenceContext(unitName = "IzaCinthiaExamen")
    private EntityManager em;
    
    public  CitaFacade() {
	super(Citas.class);
    }    

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

}
