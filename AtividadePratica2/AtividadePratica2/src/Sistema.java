public class Sistema {
    private static void exibirMenu() {
        System.out.println("Bem vindo ao systemMed, escolha uma das opções: ");
        System.out.println(" 1)Cadastrar paciente");
        System.out.println(" 2)Cadastrar médico ");
        System.out.println(" 3)Marcar consulta ");
        System.out.println(" 4)Listar todos os médicos ");
        System.out.println(" 5)Listar todos os pacientess  ");
        System.out.println(" 0)Sair");
        System.out.println("Informe uma opção ");
    }

    private static void verificarOpcao(int op) {
       
        String nome;
        String especialidade;
        int crm;
        int cpf;
        int rg;
        int dataNascimento;
        int telefone;
        String sintomas;
        int data;
        int hora; 
        switch (op) {
            case 1:

                System.out.println("Novo paciente");
                System.out.println("Nome: ");
                nome = Console.lerString();
                System.out.println("CPF: ");
                cpf = Console.lerInt();
                System.out.println("Data de nascimento: ");
                dataNascimento = Console.lerInt();
                System.out.println("Telefone: ");
                telefone = Console.lerInt();
                System.out.println("Sintomas: ");
                sintomas = Console.lerString();
                
                Paciente p = new Paciente(nome, cpf, dataNascimento, telefone,sintomas);

                Cadastro.cadastrar(p);
                
                System.out.println("Paciente cadastrado");
                break;
        

            case 2: 
                System.out.println("Novo médico");
                System.out.println("Nome: ");
                nome = Console.lerString();
                System.out.println("CRM: ");
                crm = Console.lerInt();
                System.out.println("Especialidade: ");
                especialidade = Console.lerString();
                
                Medico m = new Medico(nome, crm, especialidade);

                Cadastro.cadastrar(m);
                System.out.println("Médico cadastrado");
                break;


            case 3:
            System.out.println("Nova consulta");
            System.out.println("Data: ");
            data = Console.lerString();
            System.out.println("Hora: ");
            hora = Console.lerString();
            Consulta consulta = new Consulta(data, hora);

            Cadastro.cadastrar(consulta);
            System.out.println("Consulta cadastrada");
            break;


            case 4:
            System.out.println("Lista de médicos cadastrados: ");
            if (Medico.getListaMedico().size () == 0){
                    
                System.out.println("Não há funcionários cadastrados.....");
                return;
            }


            for(Funcionario temp : Cadastro.getListaMedico()){
            
                System.out.println(temp.toString());
            }
            
            case 5:
            System.out.println("Lista de pacientes cadastardos: ");
            if (Medico.getListaPessoas().size () == 0){
                    
                System.out.println("Não há funcionários cadastrados.....");
                return;

                break;
            }


            for(Funcionario temp : Cadastro.getListaPessoas()){
            
                System.out.println(temp.toString());
            }

            break;

            case 0:

            System.out.println("Programa finalizado");
            break;
        
        
            default:
            System.out.println("opção inválida, digite novamente.");
            break;

        }
    
    }
    
   public static void executar(){
    int op;
    do{

       exibirMenu();
       op = Console.lerInt();
       verificarOpcao(op);

   } while(op != 0);
 }

}
