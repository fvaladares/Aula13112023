import entidades.Pessoa;

public class Main {
    public static void main(String[] args) {

//        int [] variavel = new int[10];
//        variavel[0] = 10;
//        for (int i = 0; i < 10; i++) {
//            variavel[i] = i+1;
//        }
//
//        for (int i = 0; i < 10; i++) {
//            if (variavel[i] != 0) {
//
//            }
//        }

        System.out.print("Hello and welcome!\n\n");
        int idade = 15;
        Pessoa pessoa; // Declaração da variável.
        Pessoa fuladoDeTal;

        pessoa = new Pessoa(
                "Fabricio",
                "MG6666666",
                "Masculino",
                40
        );

        System.out.println(pessoa);

//        pessoa.nome = "Fabricio";
//        pessoa.identidade = "MG123234";
//        pessoa.idade = 40;
//        pessoa.sexo = "Masculino";

        pessoa.setIdentidade("MG1235456");

        System.out.println(pessoa);

//        pessoa.nome = "Valadares";

        System.out.printf("Nome %1$s Identidade %2$s\n",
                pessoa.getNome(),
                pessoa.getIdentidade());

    }
}