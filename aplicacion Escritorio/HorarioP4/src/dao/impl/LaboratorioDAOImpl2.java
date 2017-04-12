/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.LaboratorioDAO2;
import java.util.ArrayList;
import mapeo.Laboratorio2;
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
public class LaboratorioDAOImpl2 implements LaboratorioDAO2 {

    private Session session;
    private Transaction tx;
    
    public ArrayList<Laboratorio2> getAll() {
        iniciaOperacion();
        Criteria criteria = session.createCriteria(Laboratorio2.class);
        ArrayList<Laboratorio2> list = (ArrayList<Laboratorio2>) criteria.list();
        tx.commit();
        session.close();
        return list;
    }

    @Override
    public ArrayList<Laboratorio2> getAllLab(int ano, String carrera) {
        iniciaOperacion();
        Criteria criteria = session.createCriteria(Laboratorio2.class).add(Restrictions.eq("carrera", carrera)).add(Restrictions.eq("ano", new Integer(ano)));
        ArrayList<Laboratorio2> list = (ArrayList<Laboratorio2>) criteria.list();
        tx.commit();
        session.close();
        return list;
    }

    @Override
    public void insert(Laboratorio2 l) {
        iniciaOperacion();
        session.save(l);
        tx.commit();
        session.close();
    }

    @Override
    public void delete(Laboratorio2 l) {
        iniciaOperacion();
        session.delete(l);
        tx.commit();
        session.close();
    }
    
    public void deleteAll() {
        iniciaOperacion();
        ArrayList<Laboratorio2> l = getAll();
        for (int i = 0; i < l.size(); i++) {
         session.delete(l.get(i));   
        }
        tx.commit();
        session.close();
    }

    @Override
    public void update(Laboratorio2 l) {
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
