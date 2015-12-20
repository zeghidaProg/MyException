package com.conceptiondb.tlsryad.mypow;

/**
 * Created by MOI on 13/12/2015.
 */
public class Chapitre {

    private int id;
    private String chapitreName;

    public Chapitre(int id, String chapitreName) {
        this.id = id;
        this.chapitreName = chapitreName;
    }

    public Chapitre(String chapitreName) {
        this.chapitreName = chapitreName;
    }

    public Chapitre() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws BeanException{

        if (id<=0 ){
           throw  new BeanException("id doit etre superieur à 0");
        }else {
            this.id = id;
        }

    }

    public String getChapitreName() {
        return chapitreName;
    }

    public void setChapitreName(String chapitreName) {
        this.chapitreName = chapitreName;
    }


    @Override
    public String toString() {
        return "Chapitre{" +
                "id=" + id +
                ", chapitreName='" + chapitreName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Chapitre)) return false;

        Chapitre chapitre = (Chapitre) o;

        if (getId() != chapitre.getId()) return false;
        return getChapitreName().equals(chapitre.getChapitreName());

    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getChapitreName().hashCode();
        return result;
    }

}
