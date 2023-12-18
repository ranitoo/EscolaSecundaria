import myinputs.Ler;
import java.util.ArrayList;

public class GerirAluno {
	
    public static int menu() {
        int opcao;
        System.out.println("#########################################################");
        System.out.println("|                    Menu ALuno                      |");
        System.out.println("|________________________________________________________|");
        System.out.println("|                    1 - Adicionar Aluno           |");
        System.out.println("|                    2 - Remover Aluno              |");
        System.out.println("|                    3 - Listar Aluno             |");
        System.out.println("|                    4 - Atualizar Aluno             |");
        System.out.println("|                    7 - Sair                            |");
        System.out.println("#########################################################");
        System.out.println("                    Selecione uma opcao                  ");
        opcao = Ler.umInt();
        return opcao;
    }
    
    
    public static void gerirAluno() {
    	int op;
    	ArrayList<Aluno> alunos;
    	alunos = Funcaluno.getalunos();

    do {
    	op = menu();
    	switch(op) {
    	case 1:
    		alunos.add(aluno.novoAluno());
    		break;
    		
    	case 2:
    		System.out.println("numero do aluno que pretende remover: ");
    		int numescolar = Ler.umInt();
    		boolean removed = false;
    		for (int i = 0; i < alunos.size(); i++) {
    			if(alunos.get(i).getNif() == numescolar) {
    				alunos.remove(i);
    				removed = true;
    				break;
    			}}
    		
    		if (removed) {
    			System.out.println("Aluno removido com sucesso!");
    		}else {
    			System.out.println("Aluno não encontrado.");
    		}
    		break;
    			
    	case 3:			
    	 	System.out.println(alunos);
    	 	break;
    	 
    	case 4:
    		System.out.println("numero do aluno que pretende atualizar: ");
    		boolean found = false;
    		for(int i = 0; i < alunos.size(); i++) {
    			if(alunos.get(i).getNif() == NIF) {
    				found = true;
    				break;
    			}
    		}
    		
    		if(found) {
    			Aluno aluno = alunos.get(i);
    	        System.out.println("Digite o novo nome do aluno: ");
    	        String nome = Ler.umaString();
    	        System.out.println("Digite o novo email do aluno: ");
    	        String email = Ler.umaString();
    	        System.out.println("Digite a nova disciplina do aluno: ");
    	        String disciplina = Ler.umaString();
    	        System.out.println("Digite o novo NIF do aluno: ");
    	        int NIF = Ler.umInt();
    	        System.out.println("Digite o novo ano escolar:");
    	        int anoescolar =Ler.umInt();
    			
    	        aluno.setNome(nome);
    	        aluno.setEmail(email);
    	        aluno.setDisciplina(disciplina);
    	        aluno.setSalario(NIF);
    	        aluno.setAnoEscolar(anoescolar);
    	        
    	        System.out.println("Aluno atualizado com sucesso!");
    		}else {
    			System.out.println("Aluno não encontrado.");
    		}break;
    	
    	}
    
    }while (op != 7);
    }
}
