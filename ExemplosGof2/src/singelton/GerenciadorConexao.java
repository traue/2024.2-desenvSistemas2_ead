package singelton;

public class GerenciadorConexao {

    private static GerenciadorConexao instanciaUnica;

    private GerenciadorConexao() {
        System.out.println("Conexão com o BD estabelecida!");
        this.abrirConexao();
    }

    public static GerenciadorConexao getInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica =  new GerenciadorConexao();
        }
        return instanciaUnica;
    }

    public void fecharConexao() {
        System.out.println("Conexão fechada!");
    }

    public void abrirConexao() {
        System.out.println("Conexão aberta!");
    }

    public void executarQuery(String query) {
        System.out.println("Executando...: " + query);
    }

}
