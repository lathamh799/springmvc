package com.xworkz.institute.utils;

import com.xworkz.institute.InstituteDAO.InstituteDAO;
import com.xworkz.institute.InstituteDTO.InstituteDTO;

public class InstituteTester {
	
	public static void main(String[] args) {

				
		InstituteDAO InstituteDAO=new InstituteDAO();
		//InstituteDAO.save(Institute);
		//System.out.println("closing");
		
		//InstituteDAO InstituteDAO=new InstituteDAO();
		//InstituteDAO.updateInstituteNameById("UVC", 1);
		//System.out.println("closing");
		
		//InstituteDAO.getById(2);
		//System.out.println("got row");
		 
		InstituteDAO.deleteById(2);
		
		
	}
}
