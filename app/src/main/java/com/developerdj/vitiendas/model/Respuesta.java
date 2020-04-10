package com.developerdj.vitiendas.model;

import java.io.Serializable;

public class Respuesta<T> {
    private int status;
    private T data;
    private String message;

    public Respuesta() {
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
