package MATA55.Prova2.models;

public class Participant extends Person {
    public Integer id;
    private String status; //o status será AWAITING enquanto o participante estiver pendente de aprovação

    public Participant(){ this.status = "AWAITING"; }

    public String getStatus(){ return this.status; }

    public void setStatus(String status){ this.status = status; }
}
