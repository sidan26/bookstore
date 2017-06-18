package db;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Created by tyr on 2017/5/27.
 */
public class MyHibernateSessionFactory {

    private static SessionFactory sessionFactory;
    private MyHibernateSessionFactory(){

    }

    public static SessionFactory getSessionFactory(){
        if (sessionFactory==null){
            Configuration config = new Configuration().configure();
            ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
            sessionFactory = config.buildSessionFactory(serviceRegistry);
            return sessionFactory;
        }else {
            return sessionFactory;
        }
    }
}
