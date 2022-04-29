package com.dda.groupbj.schoolmanagement.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class StudentModel {

    private Integer studentId;
    private String name;
    private Integer parentId;
}
