package Horarios;
import myinputs.Ler;
import Horarios.Horarios;
import java.util.ArrayList;
import java.time.LocalTime;

public class GerirHorario {

    public static int menu() {
        int opcao;
        System.out.println("#########################################################");
        System.out.println("#                   Gerir Horários                      #");
        System.out.println("#                                                       #");
        System.out.println("#                1 - Criar novo horário                 #");
        System.out.println("#                2 - Visualizar horários                #");
        System.out.println("#                3 - Modificar horário                  #");
        System.out.println("#                4 - Remover horário                    #");
        System.out.println("#                0 - Voltar ao Menu Principal           #");
        System.out.println("#                                                       #");
        System.out.println("#########################################################");
        opcao = Ler.umInt();
        return opcao;
    }
    
    
    public static void gerirHorario() {
    	int op = 0;
    	ArrayList<Horarios> horarios = FuncHorario.gethorarios();

    	do {
    	    op = menu();
    		switch (op) {
    	        case 1:
    	            horarios.add(Horarios.NovoHorario());
    	            break;

    	        case 2:
    	        	System.out.println(horarios);   	     
    	        	break;

    	        case 3:
    	            System.out.print("Insira a turma cujo horario será modificado: ");
    	            String turmaModificar = Ler.umaString();
    	            boolean found = false;

    	            for (int i = 0; i < horarios.size(); i++) {
    	                if (horarios.get(i).getTurma().equals(turmaModificar)) {
    	                    found = true;
    	                    Horarios horario = horarios.get(i);

    	                    System.out.println("Horario atual:");
    	                    System.out.println(horario.toString());

    	                    System.out.println("Nova disciplina: ");
    	                    String novaDisciplina = Ler.umaString();
    	                    System.out.println("Novo dia da semana: ");
    	                    String novoDiaSemana = Ler.umaString();
    	                    System.out.println("Nova hora de início: ");
    	                    int novaHoraInicio = Ler.umInt();
    	                    System.out.println("Nova hora de término: ");
    	                    int novaHoraFim = Ler.umInt();

    	                    horario.setDisciplina(novaDisciplina);
    	                    horario.setdiasemana(novoDiaSemana);
    	                    horario.setHoras(LocalTime.of(novaHoraInicio, novaHoraFim));

    	                    System.out.println("Horário modificado com sucesso!");
    	                    FuncHorario.Guardar(horarios);
    	                    break;
    	                }
    	            }

    	            if (!found) {
    	                System.out.println("Turma não encontrada.");
    	            }    	      
    	            break;
    	        case 4:
    	        	System.out.println("Turma cujo horário pretende remover: ");
    	     		String turmaRemover1 = Ler.umaString();
    	 	        boolean removed = false;
    	 	        for(int i = 0; i < horarios.size(); i++) {
    	 	        	if(horarios.get(i).getTurma().equals(turmaRemover1)) {
    	 	        		horarios.remove(i);
    	 	        		removed = true;
    	 	        		break;
    	 	        	}
    	 	        }
    	 	        
    	 	        if(removed) {
    	 	        	System.out.println("Horario removido com sucesso!");
    	     		}else {
    	     			System.out.println("Turma não encontrada.");
    	     		}
    	        	FuncHorario.Guardar(horarios);
    	            break;
    	    }
    		FuncHorario.Guardar(horarios);
    	} while (op != 0);
    } 
}
