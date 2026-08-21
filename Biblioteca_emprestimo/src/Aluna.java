
public class Aluna extends Pessoa implements Emprestimo{

    private String matricula;

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void exibirmatricula() {
        System.out.println("Matricula" + matricula);
    }

    @Override
    public void pegarlivro(String nome_do_livro) {
        System.out.println("nome");
        System.out.println("Idade");
        System.out.println("Matrícula");
    }

    }

    @Override
    public void DevolverLivro nome_do_livro) {
        ( System.out.println ("Devolvel o livro...." )
        }

