package Horarios;
import myinputs.Ler;
import java.io.FileInputStream;
import java.time.LocalTime;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import Professor.Professor;

import java.util.Iterator;

public class FuncHorario {	
    
	public static ArrayList<Horarios> gethorarios(){
		 ArrayList<Horarios> horarios = new ArrayList<Horarios>();

	        try {
	            ObjectInputStream is = new ObjectInputStream(new FileInputStream("./src/Horarios/horarios.dat"));
	            Horarios.setUltimo(is.readInt());
	            horarios = (ArrayList<Horarios>) is.readObject();
	            is.close();
	        } catch (IOException | ClassNotFoundException e) {
	            System.out.println(e.getMessage());
	        }

	        return horarios;
	}
	
	   

	public static void Guardar(ArrayList<Horarios> horarios) {
	    try (
	    	ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("./src/Horarios/horarios.dat"))) {
	    	os.writeInt(Horarios.getUltimo());
            os.writeObject(horarios);
            os.flush();
            os.close();	                   
	    } catch (IOException e) {
	        System.err.println("Erro ao guardar os horários" + e.getMessage());
	    }
	}
	

}
