/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.ProfesorDAO;
import java.io.Serializable;
import java.util.ArrayList;
import mapeo.Profesor;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

public class ProfesorDAOImpl implements ProfesorDAO,Serializable {

    private Session session;
    private Transaction tx;

    @Override
    public ArrayList<Profesor> getAll() {
        iniciaOperacion();
        Criteria criteria = session.createCriteria(Profesor.class);
        ArrayList<Profesor> list = (ArrayList<Profesor>) criteria.list();
        tx.commit();
        session.close();
        return list;
    }
    
    @Override
    public ArrayList<Profesor> getAllProfesor(int ano, String carrera, String asig){
        iniciaOperacion();
        Criteria criteria = session.createCriteria(Profesor.class)
                .add(Restrictions.eq("asignatura", asig))
                .add(Restrictions.eq("carrera", carrera))
                .add(Restrictions.eq("ano", new Integer(ano)));
        ArrayList<Profesor> list = (ArrayList<Profesor>) criteria.list();
        tx.commit();
        session.close();
        return list;
    }
    
    public ArrayList<Profesor> getAllProfesorTipo(int ano, String carrera, String asig, String tipo){
        iniciaOperacion();
        String t;
        if(tipo.equals("C") || tipo.equals("E")){
            t = "conf";
        }
        else{
            t = "cp";
        }
//        System.out.println(asig + " " + t + " " + carrera + "-" + ano);
        Criteria criteria = session.createCriteria(Profesor.class)
                .add(Restrictions.eq("asignatura", asig))
                .add(Restrictions.eq("carrera", carrera))
                .add(Restrictions.eq("ano", new Integer(ano)))
                .add(Restrictions.eq(t, "on"));
        ArrayList<Profesor> list = (ArrayList<Profesor>) criteria.list();
        tx.commit();
        session.close();
        return list;
    }
    
    public void insert(Profesor p) {
        iniciaOperacion();
        session.save(p);
        tx.commit();
        session.close();
    }

    public void delete(Profesor p) {
        iniciaOperacion();
        session.delete(p);
        tx.commit();
        session.close();
    }
    
    public void deleteAll() {
        iniciaOperacion();
        ArrayList<Profesor> p = getAll();
        for (int i = 0; i < p.size(); i++) {
         session.delete(p.get(i));   
        }
        tx.commit();
        session.close();
    }

    public void update(Profesor p) {
        iniciaOperacion();
        session.update(p);
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
