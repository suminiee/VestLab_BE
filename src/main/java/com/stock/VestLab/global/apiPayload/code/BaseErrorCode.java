package com.stock.VestLab.global.apiPayload.code;

import com.stock.VestLab.global.apiPayload.CustomResponse;
import org.springframework.http.HttpStatus;

public interface BaseErrorCode {
    HttpStatus getStatus();
    String getCode();
    String getMessage();
    <T> CustomResponse<T> getResponse();
}
