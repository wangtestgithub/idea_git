package com.wang.test;


import com.wang.dao.ItemsDao;
import com.wang.domain.Items;
import com.wang.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsTest {
    @Test
    public void findById(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsDao bean = ac.getBean(ItemsDao.class);
        Items byId = bean.findById(1);
        System.out.println(byId.getName());
    }
    @Test
    public void service(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsService bean = ac.getBean(ItemsService.class);
        Items byId = bean.findById(2);
        System.out.println(byId.getName());
    }
}
