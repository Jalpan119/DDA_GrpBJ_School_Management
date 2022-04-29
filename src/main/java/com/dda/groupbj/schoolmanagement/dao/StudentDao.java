package com.dda.groupbj.schoolmanagement.dao;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;

import java.sql.Date;

@Entity
@Table(name = "student")
@Data
public class StudentDao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "StudentId")
    private Integer studentId;

    @Column(name = "StudentName")
    private String studentName;

    @JsonFormat(pattern = "yyyy/MM/dd")
    @Column(name = "DOB")
    private Date dob;

    @Column(name = "Gender")
    private String gender;

    @Column(name = "Address")
    private String address;

    @Column(name = "createdBy")
    private String createdBy;

    @JsonFormat(pattern = "yyyy/MM/dd")
    @Column(name = "createdDate")
    private Date createdDate;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "ParentId", nullable = false)
    private ParentDao parent;


}
