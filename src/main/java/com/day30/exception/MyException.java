package com.day30.exception;

/**
 * @Auther:嘻嘻
 * @Date:2021/1/31 - 01 - 31 - 14:54
 * @Description:com.day30.exception
 * @version:v1.0.0
 */


public class MyException extends Exception{

    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }
}
