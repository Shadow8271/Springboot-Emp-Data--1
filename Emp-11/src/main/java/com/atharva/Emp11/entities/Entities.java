package com.atharva.Emp11.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="EmpData")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Entities {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_id_seq")
    @SequenceGenerator(name = "emp_id_seq", sequenceName = "emp_id_seq", allocationSize = 1, initialValue = 101)
    @Column(name = "E_ID")
    private Integer EmpID;

    @Column(name="E_name")
    private String EmpName;

    @Column(name="E_Designation")
    private String Designation;

    @Column(name="E_Salary")
    private Integer Salary;

    @Column(name="E_age")
    private Integer age;

}
