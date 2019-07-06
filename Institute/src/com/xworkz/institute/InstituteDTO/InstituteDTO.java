package com.xworkz.institute.InstituteDTO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "Institute")
public class InstituteDTO implements Serializable
{
	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	    @Column(name="id")
		private int id;
	    @Column(name="Inname")
	    private String Inname;
	    @Column(name="studentsNo")
		private int studentsNo;
		
		public InstituteDTO() {
			System.out.println("calling constructor");
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getInname() {
			return Inname;
		}
		public void setInname(String inname) {
			Inname = inname;
		}
		public int getStudentsNo() {
			return studentsNo;
		}
		public void setStudentsNo(int studentsno) {
			this.studentsNo = studentsno;
		}
		@Override
		public String toString() {
			return "InstituteDTO [id=" + id + ", Inname=" + Inname + ", studentsNo=" + studentsNo + "]";
		}
}		
		


