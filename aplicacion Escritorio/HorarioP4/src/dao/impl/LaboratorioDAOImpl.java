/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import java.util.ArrayList;
import mapeo.*;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author work
 */
public class LaboratorioDAOImpl {
     private Session session;
    private Transaction tx;
    
    public ArrayList<Laboratorio1> getAllLab1() {
        iniciaOperacion();
        Criteria criteria = session.createCriteria(Laboratorio1.class);
        ArrayList<Laboratorio1> list = (ArrayList<Laboratorio1>) criteria.list();
        tx.commit();
        session.close();
        return list;
    }
    public ArrayList<Laboratorio2> getAllLab2() {
        iniciaOperacion();
        Criteria criteria = session.createCriteria(Laboratorio2.class);
        ArrayList<Laboratorio2> list = (ArrayList<Laboratorio2>) criteria.list();
        tx.commit();
        session.close();
        return list;
    }
    public ArrayList<Laboratorio3> getAllLab3() {
        iniciaOperacion();
        Criteria criteria = session.createCriteria(Laboratorio3.class);
        ArrayList<Laboratorio3> list = (ArrayList<Laboratorio3>) criteria.list();
        tx.commit();
        session.close();
        return list;
    }
    public ArrayList<Laboratorio4> getAllLab4() {
        iniciaOperacion();
        Criteria criteria = session.createCriteria(Laboratorio4.class);
        ArrayList<Laboratorio4> list = (ArrayList<Laboratorio4>) criteria.list();
        tx.commit();
        session.close();
        return list;
    }
    public ArrayList<Laboratorio5> getAllLab5() {
        iniciaOperacion();
        Criteria criteria = session.createCriteria(Laboratorio5.class);
        ArrayList<Laboratorio5> list = (ArrayList<Laboratorio5>) criteria.list();
        tx.commit();
        session.close();
        return list;
    }
    public ArrayList<Laboratorio6> getAllLab6() {
        iniciaOperacion();
        Criteria criteria = session.createCriteria(Laboratorio6.class);
        ArrayList<Laboratorio6> list = (ArrayList<Laboratorio6>) criteria.list();
        tx.commit();
        session.close();
        return list;
    }
    public ArrayList<Laboratorio7> getAllLab7() {
        iniciaOperacion();
        Criteria criteria = session.createCriteria(Laboratorio7.class);
        ArrayList<Laboratorio7> list = (ArrayList<Laboratorio7>) criteria.list();
        tx.commit();
        session.close();
        return list;
    }
    public ArrayList<Laboratorio8> getAllLab8() {
        iniciaOperacion();
        Criteria criteria = session.createCriteria(Laboratorio8.class);
        ArrayList<Laboratorio8> list = (ArrayList<Laboratorio8>) criteria.list();
        tx.commit();
        session.close();
        return list;
    }
    public ArrayList<Laboratorio9> getAllLab9() {
        iniciaOperacion();
        Criteria criteria = session.createCriteria(Laboratorio9.class);
        ArrayList<Laboratorio9> list = (ArrayList<Laboratorio9>) criteria.list();
        tx.commit();
        session.close();
        return list;
    }
    public ArrayList<Laboratorio10> getAllLab10() {
        iniciaOperacion();
        Criteria criteria = session.createCriteria(Laboratorio10.class);
        ArrayList<Laboratorio10> list = (ArrayList<Laboratorio10>) criteria.list();
        tx.commit();
        session.close();
        return list;
    }
    public ArrayList<Laboratorio11> getAllLab11() {
        iniciaOperacion();
        Criteria criteria = session.createCriteria(Laboratorio11.class);
        ArrayList<Laboratorio11> list = (ArrayList<Laboratorio11>) criteria.list();
        tx.commit();
        session.close();
        return list;
    }
    public ArrayList<Laboratorio12> getAllLab12() {
        iniciaOperacion();
        Criteria criteria = session.createCriteria(Laboratorio12.class);
        ArrayList<Laboratorio12> list = (ArrayList<Laboratorio12>) criteria.list();
        tx.commit();
        session.close();
        return list;
    }
    public ArrayList<Laboratorio13> getAllLab13() {
        iniciaOperacion();
        Criteria criteria = session.createCriteria(Laboratorio13.class);
        ArrayList<Laboratorio13> list = (ArrayList<Laboratorio13>) criteria.list();
        tx.commit();
        session.close();
        return list;
    }
    public ArrayList<Laboratorio14> getAllLab14() {
        iniciaOperacion();
        Criteria criteria = session.createCriteria(Laboratorio14.class);
        ArrayList<Laboratorio14> list = (ArrayList<Laboratorio14>) criteria.list();
        tx.commit();
        session.close();
        return list;
    }
    public ArrayList<Laboratorio15> getAllLab15() {
        iniciaOperacion();
        Criteria criteria = session.createCriteria(Laboratorio15.class);
        ArrayList<Laboratorio15> list = (ArrayList<Laboratorio15>) criteria.list();
        tx.commit();
        session.close();
        return list;
    }
    public ArrayList<Laboratorio16> getAllLab16() {
        iniciaOperacion();
        Criteria criteria = session.createCriteria(Laboratorio16.class);
        ArrayList<Laboratorio16> list = (ArrayList<Laboratorio16>) criteria.list();
        tx.commit();
        session.close();
        return list;
    }
    public ArrayList<Laboratorio17> getAllLab17() {
        iniciaOperacion();
        Criteria criteria = session.createCriteria(Laboratorio17.class);
        ArrayList<Laboratorio17> list = (ArrayList<Laboratorio17>) criteria.list();
        tx.commit();
        session.close();
        return list;
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
