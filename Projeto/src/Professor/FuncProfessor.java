package Professor;
import myinputs.Ler;
import java.io.*;
import java.util.ArrayList;

public class FuncProfessor {

    
	public static ArrayList<Professor> getProfessores() {
        ArrayList<Professor> professores = new ArrayList<Professor>();

        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("C:\\Users\\grani\\Desktop\\ubi\\ProjetoPOO\\Projeto\\src\\Professor\\professor.dat\\"));
            Professor.setUltimo(is.readInt());
            professores = (ArrayList<Professor>) is.readObject();
            is.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return professores;
    }
	

    public static void saveTofile(ArrayList<Professor> professores) {
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("C:\\Users\\grani\\Desktop\\ubi\\ProjetoPOO\\Projeto\\src\\Professor\\professor.dat\\"));
            os.writeInt(Professor.getUltimo());
            os.writeObject(professores);
            os.flush();
            os.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
