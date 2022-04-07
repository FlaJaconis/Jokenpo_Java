import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String opJogador1;
        String opJogador2;

        System.out.println("================ JOGO JOKENPO ==================");
        System.out.println("================ Bem-vindos!! ==================");

        System.out.print("\nJogador 1, insira seu nome: ");
        String nome1 = sc.nextLine();

        do{
            menu();
            opJogador1 = lerMenu();
        }while (!validaOpcao(opJogador1));


        System.out.print("\nJogador 2, insira seu nome: ");
        String nome2 = sc.nextLine();

        do{
            menu();
            opJogador2 = lerMenu();
        }while (!validaOpcao(opJogador2));

        fimJogada(nome1, nome2, opJogador1, opJogador2);
    }

    //Menu
    static void menu() {
        String nome;
        System.out.printf("\nEscolha:  " +
                "\nPedra, papel ou tesoura?" +
                " Opção: ");
    }

    //Método de leitura para a opção Menu
    //Já trata erros de entrada como variação de caixas alta/baixa e espaços em branco
    static String lerMenu(){
        String opJogador = sc.nextLine().toLowerCase().replaceAll(" ", "");
        return opJogador;
    }

    //Método para validação da opção.
    //Ele avalia se a entrada está escrita corretemente de acordo com as variáveis de comparação definidas dentro do próprio método
    static boolean validaOpcao(String opJogador) {
        String pe = "pedra", pa = "papel", te = "tesoura";

        if ((opJogador.equals(pe)) || (opJogador.equals(pa)) || (opJogador.equals(te))){
            return true;
        }else {
            System.out.println("\nOpção inexistente!!!");
            return false;
        }
    }

    // Método que define vitória, empate ou derrota de acordo com as regras tradicionais do Jokenpo
    static void fimJogada(String nome1, String nome2, String opJogador1, String opJogador2) {

              if (opJogador1.equals(opJogador2)) {
                System.out.printf("\n%s escolheu %s e %s escolheu %s.", nome1, opJogador1, nome2, opJogador2);
                System.out.printf("EMPATE!!!");

            } else {
                if ((opJogador1.equals("pedra") && opJogador2.equals("tesoura") || (opJogador1.equals("tesoura") && opJogador2.equals("papel")) ||
                        (opJogador1.equals("papel") && opJogador2.equals("pedra")))) {
                    System.out.printf("\n%s escolheu %s e %s escolheu %s.", nome1, opJogador1, nome2, opJogador2);
                    System.out.printf("\n%s, você VENCEU!!!", nome1);

                } else {
                    System.out.printf("\n%s escolheu %s e %s escolheu %s.", nome1, opJogador1, nome2, opJogador2);
                    System.out.printf("\n%s, você VENCEU!!!", nome2);
                }
            }
        }
    }

