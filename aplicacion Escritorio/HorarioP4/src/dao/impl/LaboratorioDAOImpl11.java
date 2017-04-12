/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.LaboratorioDAO11;
import java.util.ArrayList;
import mapeo.Laboratorio11;
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
public class LaboratorioDAOImpl11 implements LaboratorioDAO11{
    private Session session;
    private Transaction tx;

    @Override
    public ArrayList<Laboratorio11> getAllLab(int ano, String carrera) {
        iniciaOperacion();
        Criteria criteria = session.createCriteria(Laboratorio11.class).add(Restrictions.eq("carrera", carrera)).add(Restrictions.eq("ano", new Integer(ano)));
        ArrayList<Laboratorio11> list = (ArrayList<Laboratorio11>) criteria.list();
        tx.commit();
        session.close();
        return list;
    }
    
    public ArrayList<Laboratorio11> getAll() {
        iniciaOperacion();
        Criteria criteria = session.createCriteria(Laboratorio11.class);
        ArrayList<Laboratorio11> list = (ArrayList<Laboratorio11>) criteria.list();
        tx.commit();
        session.close();
        return list;
    }

    @Override
    public void insert(Laboratorio11 l) {
        iniciaOperacion();
        session.save(l);
        tx.commit();
        session.close();
    }

    @Override
    public void delete(Laboratorio11 l) {
        iniciaOperacion();
        session.delete(l);
        tx.commit();
        session.close();
    }
    
    public void deleteAll() {
        iniciaOperacion();
        ArrayList<Laboratorio11> l = getAll();
        for (int i = 0; i < l.size(); i++) {
            session.delete(l.get(i));
        }
        tx.commit();
        session.close();
    }

    @Override
    public void update(Laboratorio11 l) {
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
