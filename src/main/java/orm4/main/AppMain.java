package orm4.main;

/**
 * Created by orm4 on 02.01.2016.
 */
import org.hibernate.Session;
import orm4.dao.ContactEntity;
import orm4.utils.HibernateSessionFactory;

import java.sql.Date;

/**
 * Created by Nick on 05.09.2015.
 */
public class AppMain {

    public static void main(String[] args) {
        System.out.println("Hibernate tutorial");

        Session session = HibernateSessionFactory.getSessionFactory().openSession();

        session.beginTransaction();

        ContactEntity contactEntity = new ContactEntity();

        contactEntity.setBirthDate((Date) new java.util.Date());
        contactEntity.setFirstName("Nick");
        contactEntity.setLastName("VN");

        session.save(contactEntity);
        session.getTransaction().commit();

        session.close();


    }
}
