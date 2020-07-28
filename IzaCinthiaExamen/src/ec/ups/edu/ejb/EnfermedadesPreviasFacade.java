package ec.ups.edu.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ec.ups.edu.modelos.EnfermedadesPrevias;

@Stateless
public class EnfermedadesPreviasFacade extends AbstractFacade<EnfermedadesPrevias>{
	@PersistenceContext(unitName = "IzaCinthiaExamen")
    private EntityManager em;
    
    public  EnfermedadesPreviasFacade() {
	super(EnfermedadesPrevias.class);
    }    

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
}
