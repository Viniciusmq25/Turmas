import java.util.ArrayList;

public class Turmas{
  private String disciplina;
  private int numero;
  private int tamanho;
  private ArrayList<Aluno> alunos;

  public Turmas(String disciplina , int numero, int tamanho){
    this.disciplina = disciplina;
    this.numero = numero;
    this.tamanho = tamanho;
    this.alunos = new ArrayList<>();
  }

  //adiciona aluno
  public boolean addAluno(Aluno aluno){
    if(alunos.size() >= tamanho){
      System.out.println("Turma cheia");
      return false;
  }
  for (Aluno a : alunos){
    if (a.getMatricula() == aluno.getMatricula()){
      System.out.println("Matricula ja existente");
      return false;
    }
  }
  alunos.add(aluno);
  return true;
  }

  public String toString(){
    StringBuilder sb = new StringBuilder();
    sb.append("Turma{")
      .append("disciplina='").append(disciplina).append('\'')
      .append(", numero=").append(numero)
      .append(", alunos=").append(alunos)
      .append('}');
    return sb.toString();
  }

}


