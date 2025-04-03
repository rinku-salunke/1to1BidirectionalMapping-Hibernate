package com.client;

import org.hibernate.Session;

import com.config.HibernateUtil;
import com.model.AdharCard;
import com.model.Person;

public class Test {

public static void main(String[] args) {
		
	
	Session session=HibernateUtil.getSessionFactory().openSession();
	
	Person p=new Person();

	p.setPid(6);
	
	p.setPname("Rahul");
	
	
	AdharCard ad=new AdharCard();
	
	ad.setAid(234);
	
	ad.setaName("BK");
	
	ad.setP(p);
	
	p.setAd(ad);
	
	session.save(ad);
	
	session.beginTransaction().commit();
	
	
	
		
		
	}
}
