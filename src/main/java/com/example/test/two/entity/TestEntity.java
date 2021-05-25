package com.example.test.two.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Test")
public class TestEntity {

    @Id
    @Column(name = "TEST")
    private String idTest;
    @Column(name = "NAME_TEST")
    private String nameTest;

    public String getIdTest() {
        return idTest;
    }

    public void setIdTest(String idTest) {
        this.idTest = idTest;
    }

    public String getNameTest() {
        return nameTest;
    }

    public void setNameTest(String nameTest) {
        this.nameTest = nameTest;
    }
}
