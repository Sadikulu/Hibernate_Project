package com.hb10.idgenerationstrategy;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;

@MappedSuperclass
public class BaseEntity {
	
	@Id
	@GeneratedValue(generator = "sequence", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "sequence",sequenceName = "student_seq",initialValue=1000, allocationSize = 10)
	private long id;
	
	@Column(name = "create_on")
	private LocalDateTime createOnDateTime=LocalDateTime.now();
	

	public LocalDateTime getCreateOnDateTime() {
		return createOnDateTime;
	}

	public void setCreateOnDateTime(LocalDateTime createOnDateTime) {
		this.createOnDateTime = createOnDateTime;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
