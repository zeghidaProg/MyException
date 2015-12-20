package com.conceptiondb.tlsryad.mypow;

/**
 * Created by MOI on 17/12/2015.
 */
public class Mdatasource {

    private String name;
    public String test="test";

    public Mdatasource(String name) {
        this.name = name;
    }

    public static Mdatasource get(String name){
        return new Mdatasource(name);
    }

    public String getMessage(){
        return String.format("Hello, %s!", name);
    }


}
