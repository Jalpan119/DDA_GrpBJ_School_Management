package com.dda.groupbj.schoolmanagement.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Enrollment")
@Data
public class EnrollmentDao {

	@Id
    @Column(name = "StudentId")
    private Integer studentId;
	
	@Id
	@Column(name = "SubjectId")
    private String subjectId;
	
	@Column(name = "Semester")
	private String semester;
	
	@Column(name = "Year")
	private int year;

}
