package hiberpack;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Student s1 = new Student();
			s1.setName("mahesh");
			s1.setAge(26);
			s1.setAddress("Mumbai");
			
			Student s2 = new Student();
			s2.setName("suresh");
			s2.setAge(25);
			s2.setAddress("Delhi");
			
			session.save(s1);
			session.save(s2);
			
			transaction.commit();
			
			System.out.println("Objects saved in mydb database");
			
		}
		catch(Exception ee) {
			ee.printStackTrace();
		}
	}

}
