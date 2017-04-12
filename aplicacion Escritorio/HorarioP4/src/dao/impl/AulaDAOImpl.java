/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.AulaDAO;
import java.util.ArrayList;
import mapeo.Aula;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author work
 */
public class AulaDAOImpl implements AulaDAO {

    private Session session;
    private Transaction tx;

    public ArrayList<Aula> getAll() {
        iniciaOperacion();
        Criteria criteria = session.createCriteria(Aula.class);
        ArrayList<Aula> list = (ArrayList<Aula>) criteria.list();
        tx.commit();
        session.close();
        return list;
    }

    @Override
    public void insert(Aula a) {
        iniciaOperacion();
        session.save(a);
        tx.commit();
        session.close();
    }

    @Override
    public void delete(Aula a) {
        iniciaOperacion();
        session.delete(a);
        tx.commit();
        session.close();
    }
    
    public void deleteAll() {
        iniciaOperacion();
        ArrayList<Aula> a = getAll();
        for (int i = 0; i < a.size(); i++) {
            session.delete(a.get(i));
        }
        tx.commit();
        session.close();
    }
    
    

    @Override
    public void update(Aula a) {
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
