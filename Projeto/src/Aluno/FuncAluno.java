package Aluno;
import java.util.ArrayList;

import myinputs.Ler;

public class FuncAluno {
	public static void listarAlunos(ArrayList<Aluno> alunos) {
	    if (alunos.isEmpty()) {
	        System.out.println("Não há alunos inscritos.");
	    } else {
	        System.out.println("Lista de Alunos Inscritos:");
	        for (Aluno aluno : alunos) {
	            System.out.println(aluno.toString());
	        }
	    }
	}

	public static void removerAluno(ArrayList<Aluno> alunos, int numescolar) {
		boolean removed = false;
		for (int i = 0; i < alunos.size(); i++) {
			if(alunos.get(i).getNumescolar() == numescolar) {
				alunos.remove(i);
				removed = true;
				break;
			}}
		
		if (removed) {
			System.out.println("Aluno removido com sucesso!");
		}else {
			System.out.println("Aluno não encontrado.");
		}
	}
	
	
    public static void adicionarAluno(ArrayList<Aluno> alunos) {
        Aluno novoAluno = Aluno.novoAluno(); // Chama o método estático novoAluno da classe Aluno para criar um novo aluno
        alunos.add(novoAluno); // Adiciona o novo aluno à lista de alunos
        System.out.println("Aluno adicionado com sucesso!");
    }
}
