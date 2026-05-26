import java.util.ArrayList;

public class CadastroUsuarios {

    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuário cadastrado com sucesso!");
    }

    public void listarUsuarios() {

        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
            return;
        }

        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }

    public void buscarUsuario(String nome) {

        for (Usuario usuario : usuarios) {

            if (usuario.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Usuário encontrado:");
                System.out.println(usuario);
                return;
            }
        }

        System.out.println("Usuário não encontrado.");
    }

    public void removerUsuario(String nome) {

        for (Usuario usuario : usuarios) {

            if (usuario.getNome().equalsIgnoreCase(nome)) {
                usuarios.remove(usuario);
                System.out.println("Usuário removido.");
                return;
            }
        }

        System.out.println("Usuário não encontrado.");
    }
}