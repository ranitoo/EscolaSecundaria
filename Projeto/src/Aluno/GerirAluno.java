package Aluno;
import java.util.ArrayList;
import Curso.Curso;
import myinputs.Ler;

public class GerirAluno {
	
    public static int menu() {
        int opcao;
        System.out.println("#########################################################");
        System.out.println("|                    Menu ALuno                         |");
        System.out.println("|_______________________________________________________|");
        System.out.println("|                    1 - Adicionar Aluno                |");
        System.out.println("|                    2 - Remover Aluno                  |");
        System.out.println("|                    3 - Listar Aluno                   |");
        System.out.println("|                    4 - Atualizar Aluno                |");
        System.out.println("|                    5 - Sair                           |");
        System.out.println("#########################################################");
        System.out.println("                    Selecione uma opcao                  ");
        opcao = Ler.umInt();
        return opcao;
    }
    
    
    public static void gerirAluno() {
    	int op;
    	ArrayList<Aluno> alunos = FuncAluno.getAlunos();

    do {
    	op = menu();
    	switch(op) {
    	case 1:
    		alunos.add(Aluno.novoAluno());
    		FuncAluno.saveToFile(alunos);
    		break;
    		
    	case 2:
    		System.out.println("Numero escolar do aluno que pretende remover: ");
    		int numescolar1 = Ler.umInt();
    		boolean removed = false;
    		for (int i = 0; i < alunos.size(); i++) {
    			if(alunos.get(i).getNumescolar() == numescolar1) {
    				alunos.remove(i);
    				removed = true;
    				break;
    			}}
    		
    		if (removed) {
    			System.out.println("Aluno removido com sucesso!");
    		}else {
    			System.out.println("Aluno não encontrado.");
    		}
    		FuncAluno.saveToFile(alunos);
    		break;
    			
    	case 3:			
    	 	System.out.println(alunos);
    	 	break;
    	 
    	case 4:
    		System.out.println("Número do aluno que pretende atualizar: ");
    		int numescolar = Ler.umInt();
    		boolean found = false;
    		for(int i = 0; i < alunos.size(); i++) {
    			if(alunos.get(i).getNumescolar() == numescolar) {
    				found = true;
    				Aluno aluno = alunos.get(i);
    	
    			
    	        System.out.println("Digite o novo nome do aluno: ");
    	        String nome = Ler.umaString();
    	        System.out.println("Digite o novo email do aluno: ");
    	        String email = Ler.umaString();
    	        System.out.println("Insira um novo curso para o aluno: ");
    	        String nomeCurso = Ler.umaString();
    			Curso curso = new Curso(nomeCurso);
    	        System.out.println("Digite o novo NIF do aluno: ");
    	        int nif = Ler.umInt();
    	        System.out.println("Digite o novo ano escolar: ");
    	        int anoescolar =Ler.umInt();
    	        System.out.println("Digite a nova media do aluno: ");
    	        float media = Ler.umFloat();
    			
    	        aluno.setNome(nome);
    	        aluno.setEmail(email);
    	        aluno.setCurso(curso);
    	        aluno.setNif(nif);
    	        aluno.setAnoescolar(anoescolar);
    	        aluno.setMedia(media);
    	        
    	        System.out.println("Aluno atualizado com sucesso!");
    	        break;
    		}
    		}
    			if(!found){
    			System.out.println("Aluno não encontrado.");
    			FuncAluno.saveToFile(alunos);
    		}break;
    	
    	}
    
    }while (op != 5);
    }}   
