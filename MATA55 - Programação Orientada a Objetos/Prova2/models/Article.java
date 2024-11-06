package MATA55.Prova2.models;

import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.Date;

public class Article { //need 2-5 reviewers
    
    private int id;
    private String title;
    private String articleAbstract;
    private String keywords;
    private Integer numberOfPages;
    private Date submissionDate;
    public ArrayList<Specialists> authors; // como fazer um getter/setter disso?
    private Integer avaliation;

    public Article(){ 
        this.id = ThreadLocalRandom.current().nextInt(1, 100); 
        this.submissionDate = new Date();
    }

    public int getId(){ return this.id; }

    public String getTitle(){ return this.title; }

    public void setTitle(String title){ this.title = title; }

    public String getArticleAbstract(){ return this.articleAbstract; }

    public void setArticleAbstract(String articleAbstract){ this.articleAbstract = articleAbstract; }

    public String getKeywords(){ return this.keywords; }

    public void setKeywords(String keywords){ this.keywords = keywords; }

    public Integer getNumberOfPages(){ return this.numberOfPages; }

    public void setNumberOfPages(Integer numberOfPages){ this.numberOfPages = numberOfPages; }

    public Integer getAvaliation(){ return this.avaliation; }

    public void setAvaliation(Integer avaliation){ this.avaliation = avaliation; }
    

}
