package com.devsuperior.bds02.services.exceptions;

import javax.xml.crypto.Data;

public class DataBaseException extends RuntimeException{

    public DataBaseException(String msg) {
        super(msg);
    }
}
