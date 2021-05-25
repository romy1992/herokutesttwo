package com.example.test.two.controller;

import com.example.test.two.entity.TestEntity;
import com.example.test.two.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {

    @Autowired
    private TestRepository testRepository;

    @GetMapping("test")
    public String test() {
        TestEntity testEntity = new TestEntity();
        testEntity.setIdTest("1");
        testEntity.setNameTest("Test");
        testEntity = testRepository.save(testEntity);
        return testEntity.getIdTest() + " - " + testEntity.getNameTest();
    }
}
