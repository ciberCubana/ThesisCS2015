/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.GrupoDAO;
import java.io.Serializable;
import java.util.ArrayList;
import mapeo.Grupo;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

/**
 *
 * @author work
 */
public class GrupoDAOImpl implements GrupoDAO,Serializable {

    private Session session;
    private Transaction tx;

    public ArrayList<Grupo> getAll() {
        iniciaOperacion();
        Criteria criteria = session.createCriteria(Grupo.class);
        ArrayList<Grupo> list = (ArrayList<Grupo>) criteria.list();
        tx.commit();
        session.close();
        return list;
    }
    
    public ArrayList<Grupo> getAll(String carrera, int numero, int ano) {
        iniciaOperacion();
        Criteria criteria = session.createCriteria(Grupo.class)
                .add(Restrictions.eq("carrera", carrera))
                .add(Restrictions.eq("numero", new Integer(numero)))
                .add(Restrictions.eq("ano", new Integer(ano)));
        ArrayList<Grupo> list = (ArrayList<Grupo>) criteria.list();
        tx.commit();
        session.close();
        return list;
    }

    @Override
    public void insert(Grupo a) {
        iniciaOperacion();
        session.save(a);
        tx.commit();
        session.close();
    }

    @Override
    public void delete(Grupo a) {
        iniciaOperacion();
        session.delete(a);
        tx.commit();
        session.close();
    }

    @Override
    public void update(Grupo a) {
        iniciaOperacion();
        session.update(a);
        tx.commit();
        session.close();
    }

    public void deleteAll() {
        iniciaOperacion();
        String hqlDelete = "delete Grupo where carrera = :name";
        int deletedEntities = session.createQuery(hqlDelete).setString("name", "CC").executeUpdate();
        hqlDelete = "delete Grupo where carrera = :name";
        deletedEntities = session.createQuery(hqlDelete).setString("name", "II").executeUpdate();
        hqlDelete = "delete Grupo where carrera = :name";
        deletedEntities = session.createQuery(hqlDelete).setString("name", "M").executeUpdate();
        hqlDelete = "delete Grupo where carrera = :name";
        deletedEntities = session.createQuery(hqlDelete).setString("name", "F").executeUpdate();
        tx.commit();
        session.close();
    }

    private void iniciaOperacion() throws HibernateException {
        session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
    }

    private void manejaExcepcion(HibernateException he) throws HibernateException {
        tx.rollback();
        throw new HibernateException("Ocurrió un error en la capa de acceso a datos", he);
    }

        
}
