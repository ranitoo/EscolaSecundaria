package Aluno;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FuncAluno {

    public static ArrayList<Aluno> getAlunos() {
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();

        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("./src/Aluno/aluno.dat"));
            alunos = (ArrayList<Aluno>) is.readObject();
            is.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return alunos;
    }

    public static Aluno getAlunoPorNumeroEscolar(List<Aluno> alunos, int numeroEscolar) {
        for (Aluno aluno : alunos) {
            if (aluno.getNumescolar() == numeroEscolar) {
                return aluno;
            }
        }
        return null;
    }

    public static void saveToFile(List<Aluno> alunos) {
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("./src/Aluno/aluno.dat"));
            os.writeObject(alunos);
            os.flush();
            os.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
