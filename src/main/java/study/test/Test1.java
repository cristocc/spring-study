package study.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import study.model.User;

/**
 * Created by crist on 2021/7/29
 *
 * @author cc
 */
public class Test1 {

    public static void main(String[] args) {
        init1();
    }

    private static void init1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
      //获取User实例
        User user = (User)applicationContext.getBean("user");
        //调用方法
        System.out.println(user.toString());

    }
}
