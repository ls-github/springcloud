package cn.ctgu.firstdemo.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class MessageSenderController {

    @Autowired
    private AmqpTemplate rabbitmqTemplate;

    @RequestMapping("/rabbit")
    public void send() {
        String content = "hello" + new Date();
        System.out.println("Sender:" + content);
        this.rabbitmqTemplate.convertAndSend("myQueue", content);
    }
}
