package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.beans.HibernateUtlis;
import example.hibernate.entity.Employee;

public class CreateEmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(
				SessionFactory sf=HibernateUtlis.getSessionFactory();
				Session session=sf.openSession();
				){
			Employee e1=new Employee(null,"Ankit Bhujbal",48536.38f,null);
			Employee e2=new Employee(null,"Harsh Rabdhave",25596.38f,null);
			Transaction tx=session.beginTransaction();
				session.persist(e1);
				session.persist(e2);
			tx.commit();
			System.out.println("Employee created...");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
