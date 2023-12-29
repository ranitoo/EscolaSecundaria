package Escola;

import Curso.Curso;
import Curso.FuncCurso;
import Aluno.Aluno;
import Disciplina.Disciplina;

import java.util.ArrayList;
import java.util.List;

public class Escola {

	private static int ultimoId = 0;
	private int id;
    private String nome;
    private List<Curso> cursos;

    public Escola(String nome) {
        this.nome = nome;
        this.cursos = new ArrayList<>();
        this.id = ultimoId + 1;
		ultimoId++;
    }
    
    
    public static int getUltimoId() {
        return ultimoId;
    }

    public static void setUltimoId(int i) {
        ultimoId = i;
    }
	
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
    	this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public Curso cursoMaisFrequentado() {
        List<Curso> cursos = FuncCurso.getCursos(); // Carrega cursos do arquivo
        Curso cursoMaisFrequentado = null;
        int maxAlunos = 0;

        if (cursos.isEmpty()) {
            System.out.println("Nenhum curso disponível.");
            return null;
        }

        for (Curso curso : cursos) {
            List<Aluno> alunos = curso.getAlunos(); // Obtém a lista de alunos do curso

            System.out.println("Curso: " + curso.getNome() + ", Alunos: " + alunos.size());

            if (alunos.size() > maxAlunos) {
                maxAlunos = alunos.size();
                cursoMaisFrequentado = curso;
            }
        }

        if (cursoMaisFrequentado != null) {
            System.out.println("Curso mais frequentado: " + cursoMaisFrequentado.getNome() +
                               " com " + maxAlunos + " alunos.");
        } else {
            System.out.println("Nenhum curso encontrado.");
        }

        return cursoMaisFrequentado;
    }

   public double mediaIdadesPorCurso() {
        List<Curso> cursos = FuncCurso.getCursos(); // Carrega cursos do arquivo
        double somaIdades = 0;
        int totalAlunos = 0;

        if (cursos.isEmpty()) {
            System.out.println("Nenhum curso disponível.");
            return 0.0;
        }

        for (Curso curso : cursos) {
            List<Aluno> alunos = curso.getAlunos(); // Obtém a lista de alunos do curso

            for (Aluno aluno : alunos) {
                somaIdades += aluno.getIdade(); // Supondo que a classe Aluno tenha um método getIdade()
                totalAlunos++;
            }
        }

        if (totalAlunos > 0) {
            double mediaIdades = somaIdades / totalAlunos;
            System.out.println("Média de idades por curso: " + mediaIdades);
            return mediaIdades;
        } else {
            System.out.println("Nenhum aluno encontrado.");
            return 0.0;
        }
    }
   

   

    
    public double calcularMediaNotas() {
        int totalAlunos = 0;
        double somaMedias = 0.0;

        for (Curso curso : cursos) {
            for (Aluno aluno : curso.getAlunos()) {
                somaMedias += aluno.getMedia();
                totalAlunos++;
            }
        }

        return totalAlunos > 0 ? somaMedias / totalAlunos : 0.0;
    }

    public void calcularRanking() {
        List<Escola> escolasOrdenadas = new ArrayList<>();
        escolasOrdenadas.add(this);

        escolasOrdenadas.sort((escola1, escola2) ->
                Double.compare(escola2.calcularMediaNotas(), escola1.calcularMediaNotas()));

        System.out.println("Ranking da Escola (com base na média das notas dos alunos):");
        for (int i = 0; i < escolasOrdenadas.size(); i++) {
            System.out.println((i + 1) + ". " + escolasOrdenadas.get(i).getNome());
        }
    }
    
    

    public String toString() {
        String s = "Escola{" + "nome='" + nome + '\'' + ", cursos=" + cursos + '}';
        for (Curso curso : cursos) {
            s += "\n\n" + curso.toString();
        }
        return s;
    }
    public double getMediaNotas() {
        return calcularMediaNotas();
    }
