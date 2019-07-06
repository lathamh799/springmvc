package com.xworkz.institute.InstituteDAO;

import org.hibernate.HibernateException;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.institute.InstituteDTO.InstituteDTO;



public class InstituteDAO {
		/*public void save(InstituteDTO Institute){
			
			Configuration cfg = new Configuration();
			cfg.configure();
			SessionFactory refOFSF = cfg.buildSessionFactory();
			Session session = refOFSF.openSession();
			Transaction refOfTX = session.beginTransaction();
			session.save(Institute);
			refOfTX.commit();
				
		}

		public void updateInstituteNameById(String Name,int id)
		{
             
			Configuration cfg = new Configuration();
			cfg.configure();
			SessionFactory sf = cfg.buildSessionFactory();
			Session session = sf.openSession();
			Transaction tx= session.beginTransaction();
			try{
				InstituteDTO dtoFromDB = session.get(InstituteDTO.class, id);
				if (dtoFromDB != null) {
					System.out.println("entity found ");

					dtoFromDB.setInname(Name);
					session.update(dtoFromDB);
					tx.commit();
				} else
				{
					System.out.println("entity not found  cannot update");
				}
            }catch(HibernateException e) 
			{
				e.printStackTrace();
			} 
			 finally 
			{
				
				 session.close();
				sf.close();
			}

}
	
	public  InstituteDTO getById(int id)
	 {
		System.out.println("invoked getByID" + id);
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();
		InstituteDTO dtoFromDB = session.get(InstituteDTO.class,id);
		if (dtoFromDB != null) {
			System.out.println("entity found ");
			return dtoFromDB;
		}
		System.out.println("entity not found");
		session.close();
		sf.close();
		return null;
	}
*/

public void deleteById(int id){
SessionFactory sf = null;
Session session = null;
try {
	System.out.println("invoked deletedById" + id);
	Configuration configuration = new Configuration();
	configuration.configure("hibernate.cfg.xml");
	sf = configuration.buildSessionFactory();
	session = sf.openSession();
	Transaction tx = session.beginTransaction();
	InstituteDTO dtoFromDB = session.get(InstituteDTO.class, id);
	if (dtoFromDB != null) {
		System.out.println("entity found ");

		session.delete(dtoFromDB);;
		
		tx.commit();
	} else {
		System.out.println("entity not found  cannot update");
	}
} catch (Exception e) {
	e.printStackTrace();
} finally {
	session.close();
	sf.close();
}
}
}

	
				 
		
			
		


