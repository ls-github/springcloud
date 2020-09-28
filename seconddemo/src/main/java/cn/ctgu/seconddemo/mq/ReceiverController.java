package cn.ctgu.seconddemo.mq;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
//@RabbitListener(queues = "hello")
@RabbitListener(queuesToDeclare = @Queue("myQueue"))
public class ReceiverController {

    @RabbitHandler
    public void process(String hello){
        System.out.println("commit 2");

        System.out.println("Receiver:" + hello);
    }

}
