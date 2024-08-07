package com.example.stampitserver.core.error.exception;

import com.example.stampitserver.core.utils.ApiUtils;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class OutOfDateException extends RuntimeException{

    public OutOfDateException(String message){
        super(message);
    }

    public ApiUtils.ApiResult<?> body(){
        return ApiUtils.error("Out of Date", getMessage(), HttpStatus.BAD_REQUEST);
    }

    public HttpStatus status(){
        return HttpStatus.BAD_REQUEST;
    }
}
