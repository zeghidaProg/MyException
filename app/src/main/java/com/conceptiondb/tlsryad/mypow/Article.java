package com.conceptiondb.tlsryad.mypow;

/**
 * Created by MOI on 13/12/2015.
 */
public class Article {


    private int id;
    private String articleName;

    public Article(int id, String articleName) {

    }

    public Article() {

    }

    public Article(String articleName) {

    }


    public void setId(int id) throws BeanException{
        if (id<=0 ){
            new BeanException("id doit etre superieur à 0");
        }else {
            this.id = id;
        }
    }

    public int getId() {
        return id;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public String getArticleName() {
        return articleName;
    }
}
