import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class UsersMain {

	public static void main(String[] args) {
		
	    Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
	      
	    SessionFactory sessionFactory=cfg.buildSessionFactory();  
	      
	    Session session=sessionFactory.openSession();  
	      
	    Transaction transaction=session.beginTransaction();  
	    User user = new User();
	    user.setId("506");
	    user.setName("nagendra");
	    user.setSalary(5000);
	    user.setState("TS");
	    user.setCountry("IN");
	    session.save(user);
	    
	   /* Criteria criteria = session.createCriteria(User.class);
	    criteria.add(Restrictions.le("salary", 4000));
	    List<User> users = criteria.list();
	    System.out.println("users size : "+users.size());*/
	    
	    System.out.println("user saved successfully");
	    
	    transaction.commit();
	}

}
