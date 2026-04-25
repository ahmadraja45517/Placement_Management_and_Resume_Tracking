package com.ahmad;

public class ApiResponse<T> {
    private final int statusCode;
    private final String message;
    private final T data;

    public ApiResponse(int statusCode, String message, T data){
        this.statusCode = statusCode;
        this.message = message;
        this.data = data;
    }

    @Override
    public String toString(){
        return "=== API RESPONSE ===\n" +
                "Status code :" + statusCode + "\n" +
                "Message: " + message + "\n" +
                "Payload Data: " + data + "\n" +
                "==========";
    }
}