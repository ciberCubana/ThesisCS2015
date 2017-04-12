/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.LaboratorioDAO17;
import java.util.ArrayList;
import mapeo.Laboratorio17;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

/**
 *
 * @author Family
 */
public class LaboratorioDAOImpl17 implements LaboratorioDAO17{
    private Session session;
    private Transaction tx;

    @Override
    public ArrayList<Laboratorio17> getAllLab(int ano, String carrera) {
        iniciaOperacion();
        Criteria criteria = session.createCriteria(Laboratorio17.class).add(Restrictions.eq("carrera", carrera)).add(Restrictions.eq("ano", new Integer(ano)));
        ArrayList<Laboratorio17> list = (ArrayList<Laboratorio17>) criteria.list();
        tx.commit();
        session.close();
        return list;
    }
    
    public ArrayList<Laboratorio17> getAll() {
        iniciaOperacion();
        Criteria criteria = session.createCriteria(Laboratorio17.class);
        ArrayList<Laboratorio17> list = (ArrayList<Laboratorio17>) criteria.list();
        tx.commit();
        session.close();
        return list;
    }

    @Override
    public void insert(Laboratorio17 l) {
        iniciaOperacion();
        session.save(l);
        tx.commit();
        session.close();
    }

    @Override
    public void delete(Laboratorio17 l) {
        iniciaOperacion();
        session.delete(l);
        tx.commit();
        session.close();
    }
    
    public void deleteAll() {
        iniciaOperacion();
        ArrayList<Laboratorio17> l = getAll();
        for (int i = 0; i < l.size(); i++) {
            session.delete(l.get(i));
        }
        tx.commit();
        session.close();
    }

    @Override
    public void update(Laboratorio17 l) {
        iniciaOperacion();
        session.update(l);
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
