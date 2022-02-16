package top.zxh.www;

import cn.hutool.core.date.ChineseDate;
import org.junit.Test;

public class TestHutool {


    @Test
   public void test1() {

        ChineseDate chineseDate = new ChineseDate(1997,8,12);
        System.out.println(chineseDate);

    }


}
