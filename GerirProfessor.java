import myinputs.Ler;
import java.util.List;
import java.util.ArrayList;

public class GerirProfessor {
	
    public static int menu() {
        int opcao;
        System.out.println("#########################################################");
        System.out.println("|                    Menu Professor                      |");
        System.out.println("|________________________________________________________|");
        System.out.println("|                    1 - Adicionar Professor             |");
        System.out.println("|                    2 - Remover professor               |");
        System.out.println("|                    3 - Listar professores              |");
        System.out.println("|                    4 - Atualizar professor             |");
        System.out.println("|                    7 - Sair                            |");
        System.out.println("#########################################################");
        System.out.println("                    Selecione uma opcao                  ");
        opcao = Ler.umInt();
        return opcao;
    }
    
    
    public static void gerirProfessor() {
    	int op;
    	ArrayList<Professor> professores = FuncProfessor.getProfessores();

    do {
    	op = menu();
    	switch(op) {
    	case 1:
    		professores.add(Professor.novoProfessor());
    		break;
    		
    	case 2:
    		System.out.println("Numero escolar do professor que pretende remover: ");
    		int numescolar1 = Ler.umInt();
    		boolean removed = false;
    		for (int i = 0; i < professores.size(); i++) {
    			if(professores.get(i).getNumescolar() == numescolar1) {
    				professores.remove(i);
    				removed = true;
    				break;
    			}}
    		
    		if (removed) {
    			System.out.println("Professor removido com sucesso!");
    		}else {
    			System.out.println("Professor não encontrado.");
    		}
    		break;
    			
    	case 3:			
    	 	System.out.println(professores);
    	 	break;
    	 
    	case 4:
    		System.out.println("numescolar do professor que pretende atualizar: ");
    		int numescolar2 = Ler.umInt();
    		boolean found = false;
    		for(int i = 0; i < professores.size(); i++) {
    			if(professores.get(i).getNif() == numescolar2) {
    				found = true;
    				Professor professor = professores.get(i);
    				
    			System.out.println("Informações atuais do professor:");
	            System.out.println(professor.toString());
		
    	        System.out.println("Digite o novo nome do professor: ");
    	        String nome = Ler.umaString();
    	        System.out.println("Digite o novo email do professor: ");
    	        String email = Ler.umaString();
    	        System.out.println("Digite o novo salário do professor: ");
    	        float salario = Ler.umFloat();
    	        System.out.println("Digite o novo número de turmas do professor: ");
    	        int numturmas = Ler.umInt();
    	        System.out.println("Digite o novo NIF do professor: ");
    	        int nif = Ler.umInt();
    	        
    	        System.out.println("Atualize as disciplinas que o professor leciona:");
                List<Disciplina> disciplinasAtualizadas = Disciplina.getDisciplinas();
                professor.setDisciplina(disciplinasAtualizadas);
    	        
    	        professor.setNome(nome);
    	        professor.setEmail(email);
    	        professor.setSalario(salario);
    	        professor.setNumturmas(numturmas);
    	        professor.setNif(nif);
    	        
    			System.out.println("Professor atualizado com sucesso!");
    			
    			}
    		}
    	   
    	     if(!found) {
    			System.out.println("Professor não encontrado.");
    		}
    		} break;
    		FuncProfessor.saveTofile(professores); //está a dar erro
    	}while (op != 7);
   
   	}
 } 

