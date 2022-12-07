/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controlador;

import com.modelo.Tablapapeleria;
import com.controlador.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author usuario
 */
public class TablapapeleriaJpaController implements Serializable {

    public TablapapeleriaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
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

    public void edit(Tablapapeleria tablapapeleria) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            tablapapeleria = em.merge(tablapapeleria);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = tablapapeleria.getId();
                if (findTablapapeleria(id) == null) {
                    throw new NonexistentEntityException("The tablapapeleria with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Tablapapeleria tablapapeleria;
            try {
                tablapapeleria = em.getReference(Tablapapeleria.class, id);
                tablapapeleria.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tablapapeleria with id " + id + " no longer exists.", enfe);
            }
            em.remove(tablapapeleria);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Tablapapeleria> findTablapapeleriaEntities() {
        return findTablapapeleriaEntities(true, -1, -1);
    }

    public List<Tablapapeleria> findTablapapeleriaEntities(int maxResults, int firstResult) {
        return findTablapapeleriaEntities(false, maxResults, firstResult);
    }

    private List<Tablapapeleria> findTablapapeleriaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Tablapapeleria.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Tablapapeleria findTablapapeleria(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Tablapapeleria.class, id);
        } finally {
            em.close();
        }
    }

    public int getTablapapeleriaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Tablapapeleria> rt = cq.from(Tablapapeleria.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
}
