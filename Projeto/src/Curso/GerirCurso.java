package Curso;


import Professor.Disciplina;
import Aluno.Aluno;
import Professor.Professor;
import myinputs.Ler;
import java.util.ArrayList;
import java.util.List;

public class GerirCurso {

    public static int menu() {
        int opcao;
        System.out.println("#########################################################");
        System.out.println("|                    Menu Curso                          |");
        System.out.println("|________________________________________________________|");
        System.out.println("|                    1 - Inscrever Aluno                |");
        System.out.println("|                    2 - Atribuir Professor             |");
        System.out.println("|                    3 - Gerir Horários                 |");
        System.out.println("|                    7 - Sair                            |");
        System.out.println("#########################################################");
        System.out.println("                    Selecione uma opcao                  ");
        opcao = Ler.umInt();
        return opcao;
    }

    public static void gerirCurso() {
        int op;
        ArrayList<Curso> cursos = FuncCurso.getCursos();

        do {
            op = menu();
            switch (op) {
                case 1:
                    inscreverAluno(cursos);
                    break;

                case 2:
                    atribuirProfessor(cursos);
                    break;

                case 3:
                    gerirHorarios(cursos);
                    break;
            }
        } while (op != 7);

        FuncCurso.saveTofile(cursos); // Movido para fora do loop do menu
    }
    

    private static void inscreverAluno(List<Curso> cursos) {
        // Implemente a lógica para inscrever um aluno em um curso
        // Exemplo:
        System.out.println("Digite o nome do curso: ");
        String nomeCurso = Ler.umaString();
        Curso curso = FuncCurso.getCursoPorNome(cursos, nomeCurso);

        if (curso != null) {
            curso.inscreverAluno(Aluno.novoAluno());
            System.out.println("Aluno inscrito com sucesso no curso " + nomeCurso);
        } else {
            System.out.println("Curso não encontrado.");
        }
    }

    private static void atribuirProfessor(List<Curso> cursos) {
        // Implemente a lógica para atribuir um professor a um curso
        // Exemplo:
        System.out.println("Digite o nome do curso: ");
        String nomeCurso = Ler.umaString();
        Curso curso = FuncCurso.getCursoPorNome(cursos, nomeCurso);

        if (curso != null) {
            Professor professor = Professor.novoProfessor();
            System.out.println("Digite o nome da disciplina: ");
            String nomeDisciplina = Ler.umaString();
            Disciplina disciplina = new Disciplina(nomeDisciplina);

            curso.atribuirProfessor(professor, disciplina);
            System.out.println("Professor atribuído com sucesso à disciplina " + nomeDisciplina + " no curso " + nomeCurso);
        } else {
            System.out.println("Curso não encontrado.");
        }
    }

    private static void gerirHorarios(List<Curso> cursos) {
        // Implemente a lógica para gerir horários em um curso
        // Exemplo:
        System.out.println("Digite o nome do curso: ");
        String nomeCurso = Ler.umaString();
        Curso curso = FuncCurso.getCursoPorNome(cursos, nomeCurso);

        if (curso != null) {
            System.out.println("Digite o nome da disciplina: ");
            String nomeDisciplina = Ler.umaString();
            Disciplina disciplina = new Disciplina(nomeDisciplina);

            System.out.println("Digite o novo horário para a disciplina " + nomeDisciplina + ": ");
            String novoHorario = Ler.umaString();

            curso.gerirHorarios(disciplina, novoHorario);
            System.out.println("Horário gerenciado com sucesso para a disciplina " + nomeDisciplina + " no curso " + nomeCurso);
        } else {
            System.out.println("Curso não encontrado.");
        }
    }
}
