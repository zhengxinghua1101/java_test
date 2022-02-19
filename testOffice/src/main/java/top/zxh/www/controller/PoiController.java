package top.zxh.www.controller;

import com.deepoove.poi.XWPFTemplate;
import com.deepoove.poi.util.PoitlIOUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;

@RestController
@RequestMapping("/poi")
public class PoiController {


    @GetMapping("/down")
    void downWord(HttpServletResponse response) throws IOException {

        ClassPathResource resource = null;
        try {
            resource = new ClassPathResource("/template.docx");
        }catch (Exception e){
            System.out.println("异常"+e);
        }
        assert resource != null;
        InputStream inputStream = resource.getInputStream();
        XWPFTemplate template  = XWPFTemplate.compile(inputStream).render(
                new HashMap<String, Object>(){{
                    put("title", "Hi, poi-tl Word模板引擎");
                }});


        response.setContentType("application/octet-stream");
        //解决中文名乱码问题   java.net.URLEncoder.encode
        response.setHeader("Content-Disposition", "attachment; filename=\"" + java.net.URLEncoder.encode( "test.docx", "UTF-8"));
        OutputStream out = response.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(out);
        template.write(bos);
        bos.flush();
        out.flush();
        PoitlIOUtils.closeQuietlyMulti(template, bos, out);

    }
}
