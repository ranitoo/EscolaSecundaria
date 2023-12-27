package Curso;

import Professor.Disciplina;
import Aluno.Aluno;
import Professor.Professor;
import java.util.ArrayList;
import java.util.List;

public class Curso {

	private String nome;
	private List<Aluno> alunos;
	private List<Disciplina> disciplinas;
	private List<Professor> professores;
	private List<String> horarios;

	
	public Curso(String nome) {
		this.nome = nome;
		this.alunos = new ArrayList<>();
		this.disciplinas = new ArrayList<>();
		this.professores = new ArrayList<>();
		this.horarios = new ArrayList<>();
	}
			
	
	public String getNome() {
        return nome;
    }
	
	public List<Aluno> getAlunos() {
        return alunos;
    }

	public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
	
	public List<Professor> getProfessores() {
	    return professores;
	}

    public List<String> getHorarios() {
        return horarios;
    }
		
    
	public void inscreverAluno(Aluno aluno) {
        alunos.add(aluno);
    }
	
	public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }
	
	 public void atribuirProfessor(Professor professor, Disciplina disciplina) {
        professores.add(professor);
        disciplinas.add(disciplina);
    }

    public void gerirHorarios(Disciplina disciplina, String novoHorario) {
        disciplinas.add(disciplina);
        horarios.add(novoHorario);
    }

    @Override
    public String toString() {
        String s = "Curso{" + "nome='" + nome + '\'' + ", alunos=" + alunos + ", disciplinas=" + disciplinas + ", professores=" + professores +", horarios=" + horarios +'}';

        for (int i = 0; i < disciplinas.size(); i++) {
            s += "\nDisciplina: " + disciplinas.get(i).name();
            s += "\n   Professor: " + professores.get(i).getNome();
            s += "\n   Horário: " + horarios.get(i);
        }

        return s;
    }
}

