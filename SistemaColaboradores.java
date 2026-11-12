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
            System.out.println("sistema de gestão");
            System.out.println("1. cadastrar novo colaborador");
            System.out.println("2. Ver lista");
            System.out.println("3. Sair");
            System.out.println("Escolha uma das opções a cima");

            if (sc.hasNextInt()){
                opcao = sc.nextInt();
                sc.nextLine();
            }else{
                System.out.println("Opção invalida, porfavor, escolha um dos numeros a cima");
                sc.nextLine();
                continue;
            }
            
        }
    }
    
}
