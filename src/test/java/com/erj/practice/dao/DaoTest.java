package com.erj.practice.dao;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
 
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"daos.xml"})
public final class DaoTest {
 
    @Autowired
    private MyDao dao;
 
    @Test
    public void testLoadTitle() throws Exception {
        String result = dao.doSomething();
        assertNotNull("Defense department regrets to inform you that your sons are dead because they are stupid.", result);
    }
}