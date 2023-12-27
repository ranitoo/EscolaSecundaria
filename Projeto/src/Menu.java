import myinputs.Ler;
import Aluno.GerirAluno;
import Professor.GerirProfessor;
import Horario.GerirHorario;
import Aluno.GerirAluno;

public class Menu {
    public static void main(String[] args){
    	int poo=0;
        do{
            System.out.println("#########################################################");
            System.out.println("|                    Menu Principal                      |");
            System.out.println("|________________________________________________________|");
            System.out.println("|                    1 - Gerir Alunos                    |");
            System.out.println("|                    2 - Gerir Professor                 |");
            System.out.println("|                    3 - Gerir horários                  |");
            System.out.println("|                    0 - Sair                            |");
            System.out.println("#########################################################");
            System.out.println("                    Selecione uma opcao                  ");
            
            poo = Ler.umInt();
            switch (poo) {
                case 1:
                	GerirAluno.gerirAluno();
                    break;
              
                case 2:
                	GerirProfessor.gerirProfessor();
                    break;
                case 3:
                	GerirHorario.gerirHorarios();
                    break;
                
            }
        }
        while(poo != 0);
    }
}
