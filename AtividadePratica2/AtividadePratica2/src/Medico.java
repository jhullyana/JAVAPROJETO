import java.util.ArrayList;
import java.util.List;

public class Medico extends Pessoa {
    private static List<Medico> listaPessoas = new ArrayList<Medico>();
    private int crm;
    private String especialidade;
    public Medico(){
    }

    public Medico(String nome, int dataNascimento,int cpf, int telefone,String email,int crm,String especialidade){
        super( nome, cpf);
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    @Override
    public String toString(){
        return "CRM:"  +crm + " Especialidade: " + especialidade;
    }

}
