package cn.ctgu.seconddemo.exception;

import cn.ctgu.seconddemo.common.ResultBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


@ControllerAdvice
public class GlobalExceptionHandler {
    private final Logger log= LoggerFactory.getLogger(this.getClass());



    @ExceptionHandler(value = MyCustomException.class)
    @ResponseBody
    public  ResultBody bizExceptionHandler(HttpServletRequest req, MyCustomException e){
        log.error("发生业务异常！原因是：{}",e.getErrorMessage());
        return ResultBody.error(e.getErrorCode(),e.getErrorMessage(),e.getMessage());
    }
}
