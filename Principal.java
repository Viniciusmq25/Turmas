public class Principal {
  public static void main(String[] args) {
    Turmas turma = new Turmas("Matematica", 101, 30);
    
    Aluno a1 = new Aluno(001, "João", "j@j.com");
    Aluno a2 = new Aluno(002, "Maria", "m@m.com");
    Aluno a3 = new Aluno(003, "Pedro", "p@p.com");
    
    boolean added1 = turma.addAluno(a1);
    boolean added2 = turma.addAluno(a2);
    boolean added3 = turma.addAluno(a3);
    
    System.out.println("Aluno 1 adicionado: " + added1);
    System.out.println("Aluno 2 adicionado: " + added2);
    System.out.println("Aluno 3 adicionado: " + added3);
    
    System.out.println(turma);
  }
}
