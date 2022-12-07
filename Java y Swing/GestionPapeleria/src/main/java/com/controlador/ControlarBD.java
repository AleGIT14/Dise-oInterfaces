package com.controlador;

import com.controlador.exceptions.NonexistentEntityException;
import com.modelo.Tablapapeleria;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author usuario
 */
public class ControlarBD {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
    TablapapeleriaJpaController jpa = new TablapapeleriaJpaController(emf);

    public Tablapapeleria buscarPorCodigo(String cod) {
        EntityManager em = getEntityManager();
        try {
            TypedQuery tq = em.createNamedQuery("Tablapapeleria.findByCodigo", Tablapapeleria.class);
            tq.setParameter("codigo", cod);
            List<Tablapapeleria> lista = tq.getResultList();
            return lista.get(0);
        } finally {
            em.close();
        }
    }

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Tablapapeleria tablapapeleria) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(tablapapeleria);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Tablapapeleria> findAll() {
        return jpa.findTablapapeleriaEntities();
    }

    public void deleteByCod(Tablapapeleria articulo) throws NonexistentEntityException {
        jpa.destroy(articulo.getId());
        
    }
    
}
