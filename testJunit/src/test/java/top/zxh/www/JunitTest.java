package top.zxh.www;

import org.junit.Ignore;
import org.junit.Test;
import top.zxh.www.service.impl.JunitTestServiceImpl;

public class JunitTest {


    @Test
    @Ignore
    public  void  show(){
        //如果是springboot 就直接注入 然后使用就好了
        JunitTestServiceImpl junitTestService  = new JunitTestServiceImpl();
        System.out.println("获取电话号码："+junitTestService.getOnePhoneNumber());
    }


    @Test
    public  void  show2(){
        JunitTestServiceImpl junitTestService  = new JunitTestServiceImpl();
        System.out.println("获取电话号码："+junitTestService.getOnePhoneNumber());
    }



}
