/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;


import Modelos.TbPersonas;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author villa
 */
public class TbPersonasDao {

    
    public List<TbPersonas> DevuelveValores(){
        List<TbPersonas> listarPersonas = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        
        String hql = "From TbPersonas";
        
        try{
            listarPersonas = session.createQuery(hql).list();
            t.commit();
            session.close();
        } catch (HibernateException e){
            System.out.println("Error al consultar datos: "+e);
        }                
        return listarPersonas;
    }
}
