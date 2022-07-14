package com.yzw.test;

import com.yzw.App;
import com.yzw.org.service.IDeptService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class TestDept {
    @Autowired
    private IDeptService deptService;
    @Test
    public void test(){
        deptService.readAll();
    }

}
