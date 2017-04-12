/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.AsignaturaDAO;
import java.io.Serializable;
import java.util.ArrayList;
import mapeo.Asignatura;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

public class AsignaturaDAOImpl implements AsignaturaDAO,Serializable {

    private Session session;
    private Transaction tx;

    public ArrayList<Asignatura> getAll() {
        iniciaOperacion();
        Criteria criteria = session.createCriteria(Asignatura.class);    
        ArrayList<Asignatura> list = (ArrayList<Asignatura>) criteria.list();
        tx.commit();
        session.close();
        return list;
    }

    public ArrayList<Asignatura> getAllAsignatura(int ano, String carrera) {
        iniciaOperacion();
        Criteria criteria = session.createCriteria(Asignatura.class)
                .add(Restrictions.eq("carrera", carrera))
                .add(Restrictions.eq("ano", new Integer(ano)));
        ArrayList<Asignatura> list = (ArrayList<Asignatura>) criteria.list();
        tx.commit();
        session.close();
        return list;
    }
    
    public String getAsignatura(int ano, String carrera, String nombre) {
        iniciaOperacion();
//        System.out.println(nombre+" " + carrera + "-" + ano);
        Criteria criteria = session.createCriteria(Asignatura.class)
                .add(Restrictions.eq("carrera", carrera))
                .add(Restrictions.eq("nombre", nombre))
                .add(Restrictions.eq("ano", new Integer(ano)));
        ArrayList<Asignatura> list = (ArrayList<Asignatura>) criteria.list();
        tx.commit();
        session.close();
        return list.get(0).getAbrev();
    }

    public void insert(Asignatura a) {
        iniciaOperacion();
        session.save(a);
        tx.commit();
        session.close();
    }

    public void delete(Asignatura a) {
        iniciaOperacion();
        session.delete(a);
        tx.commit();
        session.close();
    }
    
    public void deleteAll() {
        iniciaOperacion();
        ArrayList<Asignatura> a = getAll();
        for (int i = 0; i < a.size(); i++) {
            session.delete(a.get(i));
        }
        tx.commit();
        session.close();
    }

    public void update(Asignatura a) {
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
