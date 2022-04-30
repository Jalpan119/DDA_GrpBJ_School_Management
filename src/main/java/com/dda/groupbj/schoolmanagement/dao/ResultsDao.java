package com.dda.groupbj.schoolmanagement.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Results")
@Data
public class ResultsDao {

	@Id
    @Column(name = "TeacherId")
    private int teacherId;

	@Id
    @Column(name = "SubjectId")
    private int subjectId;

	@Id
    @Column(name = "StudentId")
    private int studentId;
	
	@Column(name = "Marks")
	private int marks;

}
