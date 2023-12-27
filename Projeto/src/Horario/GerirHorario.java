package Horario;
import myinputs.Ler;
import java.util.ArrayList;
import java.util.List;

import Professor.Disciplina;
import Professor.FuncProfessor;
import Professor.Professor;

public class GerirHorario {
	public static int menu() {
		int opcao = 0;           
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

	            System.out.print("Selecione uma opção: ");
	            opcao = Ler.umInt();
	            return opcao;
	}
	   public static void gerirhorarios() {
	    	int op;
	    	ArrayList<Horarios> horarios = FuncHorario.gethorarios();

	    do {
	    	op = menu();
	    	switch(op) {
	    	case 1:
	    		horarios.add(Horarios.criarNovoHorario());
	    		break;
	      			
	    	case 2:			
	    	 	System.out.println(horarios);
	    	 	break;
	    	 
	    	case 4:
	    	
	    	}while (op != 7);
	   
	   	}

	}
