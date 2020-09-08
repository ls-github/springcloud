package cn.ctgu.seconddemo.common;

public class ResultBody {
    private int code;
    private String message;
    private Object data;
    private String exception;



    public static ResultBody ok(Object data){
        ResultBody resultBody=new ResultBody();
        resultBody.setCode(200);
        resultBody.setMessage("sucess");
        resultBody.setData(data);
        resultBody.setException(null);
        return  resultBody;
    }

    public static ResultBody error(int code,String message,String exception){
        ResultBody resultBody=new ResultBody();
        resultBody.setCode(code);
        resultBody.setMessage(message);
        resultBody.setData(null);
        resultBody.setException(exception);
        return  resultBody;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }
}
