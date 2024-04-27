public class Paciente extends Pessoa {
    private String cep;
    private String sintomas;

    public Paciente(){}

    public Paciente (String cep, String sintomas){
        
        this.cep = cep;
        this.sintomas = sintomas;

    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        cep = cep;
    }


    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    @Override 
    public String toString(){
        return 
        "cep: " + cep + "sintomas: " + sintomas;
    }


}
