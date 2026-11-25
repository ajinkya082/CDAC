package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.beans.HibernateUtlis;
import example.hibernate.entity.Employee;
import example.hibernate.entity.Passport;

public class EmployeePassportLinkingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(
				SessionFactory sf=HibernateUtlis.getSessionFactory();
				Session session=sf.openSession();
				){
			//load the passport which are to be linked 
			Passport passport1=session.find(Passport.class, "P1");
			Passport passport2=session.find(Passport.class, "P2");
			
			//Load the employee which passport to be linked
			Employee employee1=session.find(Employee.class, 1);
			Employee employee2=session.find(Employee.class, 2);
			
			Transaction tx=session.beginTransaction();
				employee1.setPassport(passport1);
				employee2.setPassport(passport2);
			tx.commit();
			System.out.println("Passport Linked to employee");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
