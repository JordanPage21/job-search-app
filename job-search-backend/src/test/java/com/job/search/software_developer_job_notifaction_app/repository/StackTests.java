package com.job.search.software_developer_job_notifaction_app.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.job.search.software_developer_job_notifaction_app.entity.Stack;

@SpringBootTest
class StackTests {

    @Autowired
    StackRepository stackRepository;
    
    @Test
    void testFindById(){
        assertEquals(stackRepository.findById(1).getName(), "MERN");
    }

    @Test
    void testFindByName(){
        assertEquals(stackRepository.findByName("MERN").getId(), 1);
    }

    @Test
    void testSave(){
        Stack stack = new Stack();
        stack.setName("TestStack");
        stackRepository.save(stack);
        assertEquals(stackRepository.findByName("TestStack").getId(), stack.getId());

        stackRepository.delete(stack);
    }
}
