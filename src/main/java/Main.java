import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session1 = factory.getCurrentSession();
		Transaction transaction1 = session1.beginTransaction();

		Query query = session1.createQuery("from Person where id=:id", Person.class)
				.setHint("org.hibernate.cacheable", true);
		query.setParameter("id", 1L);
		query.getResultList();

		transaction1.commit();
		session1.close();

		Session session2 = factory.getCurrentSession();
		Transaction transaction2 = session2.getTransaction();
		transaction2.begin();

		Query query2 = session2.createQuery("from Person where id=:id", Person.class)
				.setHint("org.hibernate.cacheable", true);
		query2.setParameter("id", 1L);
		query2.getResultList();

		transaction2.commit();
		session2.close();
		factory.close();
	}
}
