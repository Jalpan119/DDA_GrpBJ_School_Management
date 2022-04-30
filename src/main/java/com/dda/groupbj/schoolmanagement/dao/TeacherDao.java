package com.dda.groupbj.schoolmanagement.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Teacher")
@Data
public class TeacherDao {

	    @Id
	    @Column(name = "TeacherId")
	    private int teacherId;

	    @Column(name = "TeacherName")
	    private String teacherName;

	    @Column(name = "SubjectId")
	    private int subjectId;

	    @Column(name = "PhoneNumber")
	    private String phoneNumber;

}
