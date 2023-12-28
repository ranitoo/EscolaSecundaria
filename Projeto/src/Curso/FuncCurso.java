package Curso;
import java.util.List;
import myinputs.Ler;
import java.io.*;
import java.util.ArrayList;

public class FuncCurso {

    public static ArrayList<Curso> getCursos() {
        ArrayList<Curso> cursos = new ArrayList<Curso>();

        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("./src/Curso/curso.dat"));
            cursos = (ArrayList<Curso>) is.readObject();
            is.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return cursos;
    }

    public static Curso getCursoPorNome(List<Curso> cursos, String nomeCurso) {
        for (Curso curso : cursos) {
            if (curso.getNome().equalsIgnoreCase(nomeCurso)) {
                return curso;
            }
        }
        return null;
    }

    public static void saveTofile(List<Curso> cursos) {
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("./src/Curso/curso.dat"));
            os.writeObject(cursos);
            os.flush();
            os.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}



