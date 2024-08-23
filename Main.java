package Aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Entidades.Conta;
import Entidades.Conta_c;
import Entidades.Conta_p;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        List<Conta> lista = new ArrayList<>();

        while (true) {
            System.out.println("Deseja criar ou ver uma conta?");
            System.out.println("1 - Sim, desejo");	
            System.out.println("2 - Talvez mais tarde");
            int opcao1 = scn.nextInt();
            
            switch (opcao1) {
                case 1:
                    System.out.println("Redirecionando para area de cadastro...");
                    break;
                case 2:
                    System.out.println("Obrigado pela preferencia! Encerrando o programa.");
                    return;
                default:
                    System.out.println("Opção inválida, tente novamente");
            }
            
            System.out.println("Qual seu nome?");
            String nome = scn.next();
            System.out.println("Qual número de conta você deseja ter?");
            int num = scn.nextInt();
            System.out.println("número maximo do seu limite de emprestimo: ");
            double limite = scn.nextDouble();
            
            System.out.println("Agora escolha sobre as seguintes opções: ");
            System.out.println("1 - Corrente");	
            System.out.println("2 - Poupança");
            int opcao2 = scn.nextInt();
            
            switch (opcao2) {
                case 1:
                    Conta cc = new Conta_c(nome, num, 0, limite);
                    lista.add(cc); 
                    break;
                case 2:
                    System.out.println("Contas criadas:");
                    System.out.println("Digite o número da conta que deseja buscar (número da conta mesmo):");
                    int numConta = scn.nextInt();
                    for (Conta e : lista) {
                        if (e.getNumero() == numConta) {
                            System.out.println(e);
                            break;
                        }
                    }
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
            }
            
            System.out.println("Contas criadas:");
            for (Conta e : lista) {
                System.out.println(e);
            }
        }
    }
}