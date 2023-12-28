package Curso;
import Aluno.Aluno;
import Professor.Professor;
import Disciplina.Disciplina;
import myinputs.Ler;
import java.util.ArrayList;
import java.util.List;

public class GerirCurso {

    public static int menu() {
        int opcao;
        System.out.println("#########################################################");
        System.out.println("|                    Menu Curso                          |");
        System.out.println("|________________________________________________________|");
        System.out.println("|                    1 - Adicionar Cursos                |");
        System.out.println("|                    2 - Inscrever Aluno                 |");
        System.out.println("|                    3 - Atribuir Professor              |");
        System.out.println("|                    4 - Gerir Horários                  |");
        System.out.println("|                    5 - Sair                            |");
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
            		adicionarCurso(cursos);
            		 FuncCurso.saveTofile(cursos); 
            		break;
            		
                case 2:
                    inscreverAluno(cursos);    
                    FuncCurso.saveTofile(cursos); 
                    break;

                case 3:
                    atribuirProfessor(cursos);  
                    FuncCurso.saveTofile(cursos); 
                    break;

                case 4:
                     //chamar função da classe gerirhorarios 
                	break;
                
            }
            FuncCurso.saveTofile(cursos);
        } while (op != 5);
 
       
    }
    
    
    private static void adicionarCurso(List<Curso> cursos) {
        System.out.println("Digite o nome do novo curso: ");
        String nomeCurso = Ler.umaString();

        
        ArrayList<Disciplina> disciplinas = atribuirDisciplinasAoCurso();

        Curso novoCurso = new Curso(nomeCurso);
        cursos.add(novoCurso);

        System.out.println("Novo curso adicionado com sucesso!");
        FuncCurso.saveTofile(cursos);
    }

    
    private static void inscreverAluno(List<Curso> cursos) {
    	System.out.println("Cursos disponíveis: ");
    	for(Curso curso : cursos) {
    		System.out.println(curso.getNome());
    	}

        System.out.println("Digite o nome do curso: ");
        String nomeCurso = Ler.umaString();
        Curso curso = FuncCurso.getCursoPorNome(cursos, nomeCurso);

        if (curso != null) {
        	
            Aluno aluno = Aluno.novoAluno();
            curso.inscreverAluno(aluno);
            FuncCurso.saveTofile(cursos); 
            System.out.println("Aluno inscrito com sucesso no curso " + nomeCurso);
        } else {
            System.out.println("Curso não encontrado.");
        }
        FuncCurso.saveTofile(cursos); 
    }

    
    private static void atribuirProfessor(List<Curso> cursos) {
        System.out.println("Digite o nome do curso: ");
        String nomeCurso = Ler.umaString();
        Curso curso = FuncCurso.getCursoPorNome(cursos, nomeCurso);

            Professor professor = Professor.novoProfessor();
            System.out.println("Digite o nome da disciplina: ");
            String nomeDisciplina = Ler.umaString();

            Disciplina disciplina = getDisciplinaPorNome(nomeDisciplina);

                curso.atribuirProfessor(professor, disciplina);
                System.out.println("Professor atribuído com sucesso à disciplina " + nomeDisciplina + " no curso " + nomeCurso);   
        }
    
    
    private static Disciplina getDisciplinaPorNome(String nomeDisciplina) {
        for (Disciplina disciplina : Disciplina.values()) {
            if (disciplina.name().equalsIgnoreCase(nomeDisciplina)) {
                return disciplina;
            }
        }
        return null;
      }


private static ArrayList<Disciplina> atribuirDisciplinasAoCurso() {
    ArrayList<Disciplina> disciplinasSelecionadas = new ArrayList<>();
    int opcao;

    do {
        System.out.println("Escolha uma disciplina para adicionar ao curso:");
        List<Disciplina> disciplinaList = Disciplina.getDisciplinas();
        System.out.println("Disciplinas disponíveis:");
        for (int i = 0; i < disciplinaList.size(); i++) {
            System.out.println((i + 1) + " - " + disciplinaList.get(i));
        }
        System.out.println("0 - Finalizar seleção");

        opcao = Ler.umInt();

        if (opcao > 0 && opcao <= disciplinaList.size()) {
            disciplinasSelecionadas.add(disciplinaList.get(opcao - 1));
            System.out.println("Disciplina adicionada: " + disciplinaList.get(opcao - 1));
        } else if (opcao != 0) {
            System.out.println("Opção inválida.");
        }

    } while (opcao != 0);
  

    return disciplinasSelecionadas;
   
}
}
