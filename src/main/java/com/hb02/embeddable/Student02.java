package com.hb02.embeddable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.persistence.Transient;

//ctrl+shift+O -->import için
//ctrl+space
//bu annotationu koyduğumuz sınıf veri tabanında bir tabloya karşılık gelecek
@Entity
//eger oluşacak tablo ismini değiştirmek istenirse name attribute 
//ile bir tablo ismi oluşturulur
@Table(name="t_student02")
public class Student02 {
	
	@Override
	public String toString() {
		return  "id=" + id + 
				"\nname=" + name + 
				"\ngrade=" + grade + 
				"\naddress=" + address;
	}
	//@Embeded
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	//primary key oluşmasını sağlar
	@Id
	private int id;
	
	//length default 255 tir
	//nullable default true'dur
	//unique default false'dir
	//Column annotation'u zorunlu değil ancak costumize edebilmek için gerekli
	@Column(name="student_name",length=100,nullable=false,unique=false)
	private String name;
	
	//veri tabanı tablosunda grade adında bir tablo oluşturmaz
	//@Transient
	private int grade;
	
	//Large object ile büyük boyutlu datalar tutulabilir
	//@Lob
	//private byte [] image;
	
	

}
