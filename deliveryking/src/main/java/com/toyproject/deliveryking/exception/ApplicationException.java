package com.toyproject.deliveryking.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ApplicationException extends RuntimeException {

    private ErrorCode errorCode;
    private String msg;

    public ApplicationException(ErrorCode errorCode) {
        this.errorCode = errorCode;
        this.msg = null;
    }

    @Override
    public String getMessage() {

        if (msg == null) {
            return errorCode.getStatus().toString();
        }
        return String.format("%s, %s", errorCode, msg);
    }
}
