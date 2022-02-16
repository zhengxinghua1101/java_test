package top.zxh.www;

import org.junit.*;

public class JunitBaseTest {

    @Test
    public void  test(){
        System.out.println(" 我是Junit，@Test");
    }


    @BeforeClass
    public static void  test1(){
        System.out.println("我是一个静态方法，全局只会执行一次，而且是第一个运行 @BeforeClass");
    }

    @Before
    public void  test2(){
        System.out.println("在测试方法运行之前运行，@Before");
    }

    @After
    public void  test3(){
        System.out.println("在测试方法运行之后运行，@After");
    }


    @AfterClass
    public static void  test4(){
        System.out.println("我是一个静态方法, 全局只会执行一次，而且是最后一个运行，@After");
    }

    @Ignore
    public  void  test5(){
        System.out.println("忽略此方法，此方法不会被执行");
    }

}
