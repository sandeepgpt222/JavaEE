package mypack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StudentDAODataImpl implements StudentDAO{
	/*private SessionFactory sf;
	private Session session;
	
	public StudentDAODataImpl() {
		sf = HibernateUtil.getSessionFactory();
	}*/
	
	public void addStudent(Student ref) {
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			Transaction tx = session.beginTransaction();
			Student s1 = ref;
			session.save(s1);
			tx.commit();
			session.close();
     		System.out.println("Done with commit");

		}
		catch(Exception ee) {
			System.out.println("In catch:" + ee);
		}
	}
}
