package com.conceptiondb.tlsryad.mypow;

import junit.framework.TestCase;

/**
 * Created by MOI on 13/12/2015.
 */
public class ArticleTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();

    }

    public void testNewArticle() throws Exception {
        Article article = new Article();
        Article article1 = new Article(2,"article 02");
        Article article2 = new Article("article 02");

        article.setId(1);
        article.setArticleName("article 01");
        assertEquals(1, article.getId());
        assertEquals("article 01" , article.getArticleName());



    }
}