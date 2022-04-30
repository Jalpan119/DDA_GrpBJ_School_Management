package com.dda.groupbj.schoolmanagement.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Subject")
@Data
public class SubjectDao {

	@Id
	@Column(name = "SubjectId")
	private String subjectId;

	@Column(name = "TeacherId")
	private int teacherId;

	@Column(name = "ReferenceBooks")
	private String refernceBooks;

}
