package com.dda.groupbj.schoolmanagement.dao;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.sql.Date;
import java.util.List;
import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "parent")
@Data
public class ParentDao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ParentId")
    private Integer parentId;

    @Column(name = "ParentName")
    private String parentName;

    @Column(name = "relation")
    private String relation;

    @Column(name = "phoneNumber")
    private String phoneNumber;

    @Column(name = "Occupation")
    private String occupation;

    @Column(name = "createdBy")
    private String createdBy;

    @JsonFormat(pattern = "yyyy/MM/dd")
    @Column(name = "createdDate")
    private Date createdDate;

    @ToString.Exclude
    @JsonIgnore
    @OneToMany(mappedBy = "parent", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<StudentDao> students;
}
