/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.AfectacionesDAO14;
import java.util.ArrayList;
import mapeo.Afectaciones14;
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
public class AfectacionesDAOImpl14 implements AfectacionesDAO14{
    private Session session;
    private Transaction tx;

    @Override
    public ArrayList<Afectaciones14> getAllAfect(String nombreProf) {
        iniciaOperacion();
        Criteria criteria = session.createCriteria(Afectaciones14.class)
                .add(Restrictions.eq("nombreProf", nombreProf));
        ArrayList<Afectaciones14> list = (ArrayList<Afectaciones14>) criteria.list();
        tx.commit();
        session.close();
        return list;
    }
    
    public ArrayList<Afectaciones14> getAll() {
        iniciaOperacion();
        Criteria criteria = session.createCriteria(Afectaciones14.class);
        ArrayList<Afectaciones14> list = (ArrayList<Afectaciones14>) criteria.list();
        tx.commit();
        session.close();
        return list;
    }

    @Override
    public void insert(Afectaciones14 a) {
        iniciaOperacion();
        session.save(a);
        tx.commit();
        session.close();
    }

    @Override
    public void delete(Afectaciones14 a) {
        iniciaOperacion();
        session.delete(a);
        tx.commit();
        session.close();
    }
    
     public void deleteAll() {
        iniciaOperacion();
        ArrayList<Afectaciones14> af = getAll();
        for (int i = 0; i < af.size(); i++) {
         session.delete(af.get(i));   
        }
        tx.commit();
        session.close();
    }

    @Override
    public void update(Afectaciones14 a) {
        iniciaOperacion();
        session.update(a);
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
