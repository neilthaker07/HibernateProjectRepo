package secondPkg;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import firstPkg.Employee;

public class StoreData {

	public static void main(String[] args) {  
	      
		Configuration configuration = new Configuration();
        StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		SessionFactory sessionFactory = configuration.configure().buildSessionFactory(ssrb.build());
		Session session = sessionFactory.openSession();
		session.beginTransaction();
	      
	    Employee e1=new Employee();  
	    e1.setId(115);  
	    e1.setName("sonoo");  
	  //  e1.setLastName("jaiswal"); 
	    
	    session.persist(e1);
	    
		session.getTransaction().commit();
	    session.close();  
	      
	    System.out.println("successfully saved");  
	}  
}