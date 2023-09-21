import java.util.Random;
import java.util.Scanner;

public class Main {
    static Zoologico zoologico = new Zoologico();

    static Scanner sc = new Scanner(System.in);

    static Random random = new Random();

    public static void main(String[] args) {
        menuInicial();
    }

    private static void menuInicial() {
        int opcao;
        int id;
        do {
            System.out.println("""
                    [1] - Cadastrar animal
                    [2] - Remover animal
                    [3] - Alterar alimento de um animal
                    [4] - Relatório de animal especifico
                    [5] - Relatório de todos os animais do Zoológico
                    [6] - Sair""");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    menuCadastro();
                    break;
                case 2:
                    System.out.println("Qual o id do animal que deseja remover? ");
                    id = sc.nextInt();
                    zoologico.removerAnimal(zoologico.procurarAnimal(id));
                    break;
                case 3:
                    System.out.println("Qual o id do animal que deseja remover? ");
                    id = sc.nextInt();
                    zoologico.alterarAlimento(id);
                    break;
                case 4:
                    System.out.println("Qual o id do animal que deseja remover? ");
                    id = sc.nextInt();
                    System.out.println(zoologico.geralRelatorioEspecifico(id));
                    break;
                case 5:
                    System.out.println(zoologico.gerarRelatorioGeral());
                    break;
                case 6:
                    System.out.println("Finalizando aplicação");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Erro");
            }
        } while (opcao != 6);
    }

    private static void menuCadastro() {
        String nome;
        String alimento;
        String habitat;
        int id;
        int opcao;
        do {
            System.out.println("""
                    Qual você quer adicionar?
                    [1] - Leão
                    [2] - Girafa
                    [3] - Voltar""");
            opcao = sc.nextInt();
            id = random.nextInt(99);
            switch (opcao) {
                case 1:

                    System.out.println("ID do Animal = " + id);
                    System.out.println("Qual o nome do Leão? ");
                    nome = sc.next();
                    System.out.println("Qual o alimento do Leão? ");
                    alimento = sc.next();
                    System.out.println("Qual o habitat do Leão? ");
                    habitat = sc.next();
                    System.out.println("Qual o tamanho da juba do Leão? ");
                    int tamanhoJuba = sc.nextInt();
                    Animal leao = new Leao(id, nome, alimento, habitat, tamanhoJuba);
                    zoologico.registrarAnimal(leao);
                    break;
                case 2:
                    System.out.println("ID do Animal = " + id);
                    System.out.println("Qual o nome da girafa? ");
                    nome = sc.next();
                    System.out.println("Qual o alimento da girafa? ");
                    alimento = sc.next();
                    System.out.println("Qual o habitat da girafa? ");
                    habitat = sc.next();
                    System.out.println("Qual o tamanho do pescoço da girafa? ");
                    int tamanhoPescoco = sc.nextInt();
                    System.out.println("Qual a quantidade de manchas que a girafa tem? ");
                    int quantidadeDeManchas = sc.nextInt();
                    Animal girafa = new Girafa(id, nome, alimento, habitat, tamanhoPescoco, quantidadeDeManchas);
                    zoologico.registrarAnimal(girafa);
            }
        } while (opcao != 3);
    }

    public static String alterarAlimentoM() {
        System.out.println("Qual alimento deseja adicionar? ");
        String alimento = sc.next();
        return alimento;
    }
}