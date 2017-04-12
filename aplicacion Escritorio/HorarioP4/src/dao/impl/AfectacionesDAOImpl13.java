/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.AfectacionesDAO13;
import java.util.ArrayList;
import mapeo.Afectaciones1;
import mapeo.Afectaciones13;
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
public class AfectacionesDAOImpl13 implements AfectacionesDAO13{
    private Session session;
    private Transaction tx;

    @Override
    public ArrayList<Afectaciones13> getAllAfect(String nombreProf) {
        iniciaOperacion();
        Criteria criteria = session.createCriteria(Afectaciones13.class)
                .add(Restrictions.eq("nombreProf", nombreProf));
        ArrayList<Afectaciones13> list = (ArrayList<Afectaciones13>) criteria.list();
        tx.commit();
        session.close();
        return list;
    }
    
    public ArrayList<Afectaciones13> getAll() {
        iniciaOperacion();
        Criteria criteria = session.createCriteria(Afectaciones13.class);
        ArrayList<Afectaciones13> list = (ArrayList<Afectaciones13>) criteria.list();
        tx.commit();
        session.close();
        return list;
    }

    @Override
    public void insert(Afectaciones13 a) {
        iniciaOperacion();
        session.save(a);
        tx.commit();
        session.close();
    }

    @Override
    public void delete(Afectaciones13 a) {
        iniciaOperacion();
        session.delete(a);
        tx.commit();
        session.close();
    }
    
     public void deleteAll() {
        iniciaOperacion();
        ArrayList<Afectaciones13> af = getAll();
        for (int i = 0; i < af.size(); i++) {
         session.delete(af.get(i));   
        }
        tx.commit();
        session.close();
    }

    @Override
    public void update(Afectaciones13 a) {
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
