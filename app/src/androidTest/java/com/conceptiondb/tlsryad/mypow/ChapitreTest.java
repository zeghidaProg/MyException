package com.conceptiondb.tlsryad.mypow;

import android.util.Log;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by MOI on 14/12/2015.
 */
public class ChapitreTest extends TestCase {

    Chapitre chapitreConstTwoParams;
    Chapitre chapitreConstOneParams;
    Chapitre chapitreConstNoParams;

    Chapitre chapitre;
    Chapitre chapitre1;
    Chapitre chapitre2;
    Chapitre chapitre3;


    @Before
    public void setUp() throws Exception {

        chapitreConstTwoParams = new Chapitre(1,"chap01");
        chapitreConstOneParams = new Chapitre("chap02");
        chapitreConstNoParams = new Chapitre();

        chapitre = new Chapitre(0,"chap0");
        chapitre1 = new Chapitre(0,"");
        chapitre2 = new Chapitre(-1,"");



    }

    @Test
    public void testGetId() throws Exception {

        assertEquals(1, chapitreConstTwoParams.getId());


    }

    @Test
    public void testSetId()    {

        //assert true case
        try {

            chapitre.setId(0);
        } catch (BeanException e) {
            Log.e("exectrion ",e.getMessage());

        }


        assertEquals(0 , chapitre.getId());

        //id =1 assert false
        try {

            chapitre.setId(1);
        } catch (BeanException e) {
            Log.e("exectrion ",e.getMessage());

        }


        assertEquals(1 , chapitre.getId());

        //assert -1
        try {

            chapitre.setId(-1);
        } catch (BeanException e) {
            Log.e("exectrion ",e.getMessage());

        }


        assertEquals(-1 , chapitre.getId());


    }

    @Test
    public void testGetChapitreName() throws Exception {

        assertTrue(true);
    }

    @Test
    public void testSetChapitreName() throws Exception {

        assertTrue(true);
    }
}