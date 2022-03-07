package top.zxh.www;

import com.deepoove.poi.XWPFTemplate;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

@SpringBootTest
class DomeApplicationTests {

    @Test
    void contextLoads() throws IOException {

        XWPFTemplate template = XWPFTemplate.compile("/template.docx").render(
                new HashMap<String, Object>(){{
                    put("title", "Hi, poi-tl Word模板引擎");
                }});
        template.writeAndClose(new FileOutputStream("output.docx"));


    }

}
