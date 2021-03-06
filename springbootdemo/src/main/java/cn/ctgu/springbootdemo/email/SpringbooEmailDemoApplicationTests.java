package cn.ctgu.springbootdemo.email;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbooEmailDemoApplicationTests {

    @Autowired
    private MailService mailService;

    private static final String TO = "liushi@fiberhome.com";
    private static final String SUBJECT = "测试邮件11";
    private static final String CONTENT = "test content";

    /**
     * 测试发送普通邮件
     */
    @Test
    public void sendSimpleMailMessage() {
        mailService.sendSimpleMailMessge(TO, SUBJECT, "hello qq email");
        System.out.println("success");
    }

    /**
     * 测试发送html邮件
     */
    @Test
    public void sendHtmlMessage() {
        String htmlStr = "<h1>Test</h1><br/>zm";
        mailService.sendMimeMessge(TO, SUBJECT, htmlStr);
    }

    /**
     * 测试发送带附件的邮件
     * @throws FileNotFoundException
     */
    @Test
    public void sendAttachmentMessage() throws FileNotFoundException {
        File file = ResourceUtils.getFile("classpath:test.txt");
        String filePath = file.getAbsolutePath();
        System.out.println(filePath);
        mailService.sendMimeMessge(TO, SUBJECT, CONTENT, filePath);
    }

    /**
     * 测试发送带附件的邮件
     * @throws FileNotFoundException
     */
    @Test
    public void sendPicMessage() throws FileNotFoundException {
        String htmlStr = "<html><body>测试：图片1 <br> <img src=\'cid:pic1\'/> <br>图片2 <br> <img src=\'cid:pic2\'/></body></html>";
        Map<String, String> rscIdMap = new HashMap<>(2);
        rscIdMap.put("pic1", ResourceUtils.getFile("classpath:pic01.jpg").getAbsolutePath());
        rscIdMap.put("pic2", ResourceUtils.getFile("classpath:pic02.jpg").getAbsolutePath());
        mailService.sendMimeMessge(TO, SUBJECT, htmlStr, rscIdMap);
    }
}
