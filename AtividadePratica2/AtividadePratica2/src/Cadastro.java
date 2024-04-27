import java.util.ArrayList;
import java.util.List;


public class Cadastro extends Pessoa{
    private static List<Pessoa> listaPessoas = new ArrayList<Pessoa>();

    public static void cadastrar(Pessoa pessoa) {
        listaPessoas.add(pessoa);
    }

    public static List<Pessoa> getListaPessoas() {
        return listaPessoas;
    }
    public static Pessoa buscar (int cpf) {
        for (Pessoa temp : listaPessoas) {
            if (temp.getCpf().equals(cpf)) {
                return temp;
            }
        }
        return null;
    }
}