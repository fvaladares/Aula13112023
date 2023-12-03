package entidades;

public class Pessoa {
   private String nome;
   private String identidade;
   private String sexo;
   private int idade;

    public Pessoa(String nome,
                  String identidade,
                  String sexo,
                  int idade) {
        this.nome = nome;
        this.identidade = identidade;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        if(identidade != null)
            this.identidade = identidade;
        else
            this.identidade = "";
    }

    public String getNome() {
        return nome;
    }

    // codigo limpo (solid) - Engenharia de software moderna
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", identidade='" + identidade + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                '}';
    }
}
