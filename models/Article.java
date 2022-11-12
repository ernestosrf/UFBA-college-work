package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Article { //need 2-5 reviewers
    
    public UUID id;
    public String title;
    public String articleAbstract;
    public String keywords;
    public Integer numberOfPages;
    public Date submissionDate;
    public ArrayList authors;
    public int avaliation;

}
