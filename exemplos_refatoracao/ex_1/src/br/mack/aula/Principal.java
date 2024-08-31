package br.mack.aula;

public class Principal {

    public static void main(String[] args) {

        Aluno a1 = new Aluno();

        a1.nome = "Caio Zamana";
        a1.email = "caio@mackzista.br";
//        a1.logradouro = "Rua Oscar Freire";
//        a1.cep = "010101-001";
//        a1.numero = 123;
//        a1.complemento = "Ap. 123";
//        a1.cidade = "São Paulo";
//        a1.estado = "SP";
//        a1.pais = "Brasil";


        Endereco end = new Endereco();
        end.setLogradouro("Rua da Consolação");
        end.setBairro("Consolação");
        end.setNumero(390);
        end.setCidade("São Paulo");
        end.setEstado("SP");

        Aluno a2 = new Aluno("Leonardo Bassi", 1234, "leo@mack.com", end);

        System.out.println("Nome do meliante: " + a1.nome);
        System.out.println("Email do meliante: " + a1.email);
        System.out.println("Endereço do meliante: " + a1.endereco);

        System.out.println("Nome do meliante 2: " + a2.nome);
        System.out.println("Email do meliante 2: " + a2.email);
        System.out.println("Endereço do meliante 2: " + a2.endereco);
    }

}
