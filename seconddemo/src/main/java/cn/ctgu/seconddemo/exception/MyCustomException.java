package cn.ctgu.seconddemo.exception;

import com.sun.xml.internal.ws.api.model.CheckedException;

import java.io.IOException;

public class MyCustomException extends RuntimeException {
    private int errorCode;
    private String errorMessage;

    public MyCustomException(int errorCode,String errorMessage){
        super(errorMessage);
        this.errorCode=errorCode;
        this.errorMessage=errorMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
