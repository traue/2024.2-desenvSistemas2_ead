package singelton;

public class Principal2 {
    public static void main(String[] args) {
        GerenciadorConexao conexao1 = GerenciadorConexao.getInstancia();

        conexao1.executarQuery("select * from usuario");
        conexao1.fecharConexao();


        GerenciadorConexao conexao2 = GerenciadorConexao.getInstancia();
        conexao2.executarQuery("select * from produto");
        conexao2.fecharConexao();

        if (conexao1 == conexao2) {
            System.out.println("É... são o mesmo objeto!");
        }

    }
}
