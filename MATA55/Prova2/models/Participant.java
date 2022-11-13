package MATA55.Prova2.models;

public class Participant extends Person {
    private Enum status; //o status será AWAITING enquanto o participante estiver pendente de aprovação

    public void setStatus(Enum status){ this.status = status; }

    public Enum getStatus(){ return this.status; }
}
