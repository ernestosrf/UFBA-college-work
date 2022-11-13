package MATA55.Prova2.models;
public class Person {
    
    private String name;
    private String cpf;
    private String academicTitle;
    private String birthdate;
    private String type;
    private String category;
    private String institution;
    private String password;

    public void setName(String name){ this.name = name; }

    public String getName(){ return this.name; }

    public void setCpf(String cpf){ this.cpf = cpf; }

    public String getCpf(){ return this.cpf; }

    public void setAcademicTitle(String academicTitle){ this.academicTitle = academicTitle; }

    public String getAcademicTitle(){ return this.academicTitle; }

    public void setBirthdate(String birthdate){ this.birthdate = birthdate; }

    public String getBirthdate(){ return this.birthdate; }

    public String getType(){ return this.type; }

    public void setType(String type){ this.type = type; }

    public String getCategory(){ return this.category; }

    public void setCategory(String category){ this.category = category; }

    public String getInstitution(){ return this.institution; }

    public void setInstitution(String institution){ this.institution = institution; }

    public String getPassword(){ return this.password; }

    public void setPassword(String password){ this.password = password; }

    public void listAcceptArticles(){

    }

    public void listNonAcceptArticles(){

    }

    public void seeArticleData(){

    }

}
