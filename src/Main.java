import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CadastroUsuarios cadastro = new CadastroUsuarios();

        int opcao;

        do {

            System.out.println("\n===== SISTEMA DE CADASTRO =====");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Listar usuários");
            System.out.println("3 - Buscar usuário");
            System.out.println("4 - Remover usuário");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:

                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    Usuario usuario = new Usuario(nome, idade, email);
                    cadastro.adicionarUsuario(usuario);

                    break;

                case 2:
                    cadastro.listarUsuarios();
                    break;

                case 3:

                    System.out.print("Digite o nome do usuário: ");
                    String busca = scanner.nextLine();

                    cadastro.buscarUsuario(busca);

                    break;

                case 4:

                    System.out.print("Digite o nome do usuário: ");
                    String remover = scanner.nextLine();

                    cadastro.removerUsuario(remover);

                    break;

                case 0:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}