package Escola;

import myinputs.Ler;
import java.util.ArrayList;
import java.util.List;
import Curso.Curso;
import Curso.FuncCurso;
import Curso.GerirCurso;
import Professor.FuncProfessor;
import Professor.Professor;

public class GerirEscola {
    public static int menu() {
        int opcao;
        System.out.println("#########################################################");
        System.out.println("|                    Menu Escola                        |");
        System.out.println("|_______________________________________________________|");
        System.out.println("|                    1 - Curso mais frequentado         |");
        System.out.println("|                    2 - Média de Idades da Escola      |");
        System.out.println("|                    3 - Calcular Ranking               |");
        System.out.println("|                    4 - Sair                           |");
        System.out.println("#########################################################");
        System.out.println("                    Selecione uma opcao                  ");
        opcao = Ler.umInt();
        return opcao;
    }
    

        public static void gerirEscola() {
            Escola minhaEscola = new Escola("Minha Escola");
            ArrayList<Escola> escolas = FuncEscola.getEscolas();
            
            int opcao;

            do {
                opcao = menu();
                switch (opcao) {
                    case 1:
                    	cursoMaisFrequentado(minhaEscola);
                        break;

                    case 2:
                        mediaIdadeEscola(minhaEscola);
                        break;

                    case 3:
                        calcularRanking(minhaEscola);
                        break;
                }
                FuncEscola.saveToFile(escolas);
            } while (opcao != 4);
        }


    public static void cursoMaisFrequentado(Escola escola) {
        Curso cursoMaisFrequentado = escola.cursoMaisFrequentado();
        System.out.println("curso com mais alunos: " + cursoMaisFrequentado);
    }

    public static void mediaIdadeEscola(Escola escola) {
        double mediaIdade = escola.mediaIdadesEscola(); 
        System.out.println("Média de idade dos alunos em todos os cursos: " + mediaIdade);
    }
    
    public static void calcularRanking(Escola escola) {
        escola.calcularRanking();
    }}
