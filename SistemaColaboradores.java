import java.util.ArrayList;
import java.util.Scanner;

class Colaborador{
    String nome;
    String cargo;
    double sbase;
    double sfinal;

    public Colaborador(String nome, String cargo, double sbase, double sfinal){
        this.nome = nome;
        this.cargo = cargo;
        this.sbase = sbase;
        this.sfinal = sfinal;
    }
}

public class SistemaColaboradores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Colaborador> ListaColaboradores = new ArrayList<>();
        int opcao = 0;

        while (opcao != 3){
            System.out.println("SISTEMA DE GESTÃO");
            System.out.println("1 cadastrar novo colaborador");
            System.out.println("2 Ver lista");
            System.out.println("3 Sair");
            System.out.println("Escolha uma das opções a cima");

            if (sc.hasNextInt()){
                opcao = sc.nextInt();
                sc.nextLine();
            }else{
                System.out.println("Opção invalida, porfavor, escolha um dos numeros a cima");
                sc.nextLine();
                continue;
            }

            switch(opcao){
                case 1:
                System.out.print("Digite o nome do Colaborador:");
                String nome = sc.nextLine();

                System.out.println("Escolha o cargo:");
                System.out.println("1 Junior");
                System.out.println("2 Pleno");
                System.out.println("3 Senior");
                System.out.println("opção de cargo: ");
                int opcaoCargo = sc.nextInt();
                sc.nextLine();

                String cargo = "";
                double sbase = 0.0;
                double bonificacao = 0.0;

                if (opcaoCargo == 1){
                    cargo = "Junior";
                    sbase = 3000.0;
                    bonificacao = 200.0;
                }else if (opcaoCargo == 2){
                    cargo = "Pleno";
                    sbase = 6000.0;
                    bonificacao = 500.0;
                }else if (opcaoCargo == 3 ){
                    cargo = "Senior";
                    sbase = 10000.0;
                    bonificacao = 1000.0;
                }else{
                    System.out.println("cargo invalido, selecione um valido, cadastro cancelado");
                    break;
                }
                double sfinal = sbase + bonificacao;

                Colaborador novoColaborador = new Colaborador(nome, cargo, sbase, sfinal);
                ListaColaboradores.add(novoColaborador);

                System.out.println("Colaborador cadastrado com sucesso!");
                break;

                case 2 :
                System.out.println("LISTA DE COLABORADORES CADASTRADO");
                if (ListaColaboradores.isEmpty()){
                    System.out.println("nenhum colaborador cadastrado ainda");
                }else{
                    for (int i = 0; i < ListaColaboradores.size(); i++ ){
                        Colaborador c = ListaColaboradores.get(i);
                        System.out.println((i + 1) + ". Nome: " + c.nome + "| Caargo: " + c.cargo + " | Salário final: R$" + c.sfinal);
                    } 
                }
                break;

                case 3: 
                System.out.println("Encerrando o sistema....");
                break;

                default:
                System.out.println("opção invalidade, tente novamented");

            }
            
        }
        sc.close();
    }
    
}
