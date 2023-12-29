
import Aluno.GerirAluno;
import Curso.GerirCurso;
import Escola.GerirEscola;
import Professor.GerirProfessor;
import myinputs.Ler;

public class Menu {
	
	 public static void main(String[] args){
	    	int op=0;
	        do{
	            System.out.println("#########################################################");
	            System.out.println("|                    Menu Principal                      |");
	            System.out.println("|________________________________________________________|");
	            System.out.println("|                    1 - Gerir Alunos                    |");
	            System.out.println("|                    2 - Gerir Professores               |");
	            System.out.println("|                    3 - Gerir Cursos                    |");
	            System.out.println("|                    4 - Gerir Escola                    |");
	            System.out.println("|                    0 - Sair                            |");
	            System.out.println("#########################################################");
	            System.out.println("                    Selecione uma opcao                  ");
	            
	            op = Ler.umInt();
	    
	            switch (op) {
	                case 1:
	                	GerirAluno.gerirAluno();
	                    break;
	                case 2:
	                	GerirProfessor.gerirProfessor();
	                    break;
	                case 3:
	                	GerirCurso.gerirCurso();
	                    break;
	                case 4:
	                	GerirEscola.gerirEscola();
	                	break;
	                
	            }
	        }
	        while(op != 0);
	    }
}

