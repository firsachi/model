package model.database;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import model.database.entity.CallCenter;
import util.HibernateUtil;

public class CallCentreController {
	
	public List<CallCenter> getList(){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<CallCenter> criteria = builder.createQuery(CallCenter.class);
		Root<CallCenter> root = criteria.from(CallCenter.class);
		criteria.select(root);
		List<CallCenter> result = session.createQuery(criteria).getResultList();
		session.getTransaction().commit();
		return result;
	}
}
