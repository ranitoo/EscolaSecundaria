package Escola;


import java.io.*;
import java.util.ArrayList;

public class FuncEscola {

    public static ArrayList<Escola> getEscolas() {
        ArrayList<Escola> escolas = new ArrayList<>();

        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("./src/Escola/escola.dat"));
            Escola.setUltimoId(is.readInt());
            escolas = (ArrayList<Escola>) is.readObject();
            is.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return escolas;
    }

    public static void saveToFile(ArrayList<Escola> escolas) {
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("./src/Escola/escola.dat"));
            os.writeInt(Escola.getUltimoId());
            os.writeObject(escolas);
            os.flush();
            os.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

