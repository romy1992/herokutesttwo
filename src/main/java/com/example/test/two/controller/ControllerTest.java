package com.example.test.two.controller;

import com.example.test.two.entity.TestEntity;
import com.example.test.two.repository.TestRepository;
import model.TestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {

    @Autowired
    private TestRepository testRepository;

    @GetMapping("test")
    public String test() {
        TestModel testModel = new TestModel();
        testModel.setIdTest("1");
        testModel.setNameTest("Test");
        TestEntity testEntity = new TestEntity();
        testEntity.setIdTest(testModel.getIdTest());
        testEntity.setNameTest(testModel.getNameTest());
        testEntity = testRepository.save(testEntity);
        return testEntity.getIdTest() + " - " + testEntity.getNameTest();
    }
}
