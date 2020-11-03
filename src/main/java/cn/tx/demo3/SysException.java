package cn.tx.demo3;

/**
 * @Author: xiazidong
 * @Date: 2020/11/3
 */
public class SysException extends Exception{
    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SysException(String message) {
       this.message=message;
    }
}
