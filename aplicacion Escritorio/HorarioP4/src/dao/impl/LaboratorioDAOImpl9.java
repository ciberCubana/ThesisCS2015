/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.LaboratorioDAO9;
import java.util.ArrayList;
import mapeo.Laboratorio9;
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
public class LaboratorioDAOImpl9 implements LaboratorioDAO9{
    private Session session;
    private Transaction tx;
    
    public ArrayList<Laboratorio9> getAll() {
        iniciaOperacion();
        Criteria criteria = session.createCriteria(Laboratorio9.class);
        ArrayList<Laboratorio9> list = (ArrayList<Laboratorio9>) criteria.list();
        tx.commit();
        session.close();
        return list;
    }

    @Override
    public ArrayList<Laboratorio9> getAllLab(int ano, String carrera) {
        iniciaOperacion();
        Criteria criteria = session.createCriteria(Laboratorio9.class).add(Restrictions.eq("carrera", carrera)).add(Restrictions.eq("ano", new Integer(ano)));
        ArrayList<Laboratorio9> list = (ArrayList<Laboratorio9>) criteria.list();
        tx.commit();
        session.close();
        return list;
    }

    @Override
    public void insert(Laboratorio9 l) {
        iniciaOperacion();
        session.save(l);
        tx.commit();
        session.close();
    }

    @Override
    public void delete(Laboratorio9 l) {
        iniciaOperacion();
        session.delete(l);
        tx.commit();
        session.close();
    }
    
    public void deleteAll() {
        iniciaOperacion();
        ArrayList<Laboratorio9> l = getAll();
        for (int i = 0; i < l.size(); i++) {
         session.delete(l.get(i));   
        }
        tx.commit();
        session.close();
    }

    @Override
    public void update(Laboratorio9 l) {
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
