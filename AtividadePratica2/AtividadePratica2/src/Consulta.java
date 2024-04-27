public class Consulta extends Paciente
{
    private String data;
    private String hora;

    public Consulta(String nome, String CPF,String dataNascimento,String CEP, String telefone, String sintomas, String data, String hora)
    {
        super(CEP,sintomas);
        this.data = data;
        this.hora = hora;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    @Override
    public String toString() {
        return super.toString()+
        "\nConsulta agendada com com sucesso para o dia: " + data + "às: " +hora;
    }

}
