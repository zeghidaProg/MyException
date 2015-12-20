package com.conceptiondb.tlsryad.mypow;

/**
 * Created by MOI on 14/12/2015.
 */
public class BeanException extends Exception {

    public BeanException() {
        super();
    }

    public BeanException(String detailMessage, Throwable throwable) {
        super(detailMessage, throwable);
    }

    public BeanException(Throwable throwable) {
        super(throwable);
    }

    public BeanException(String detailMessage) {
        super(detailMessage);
    }
}
