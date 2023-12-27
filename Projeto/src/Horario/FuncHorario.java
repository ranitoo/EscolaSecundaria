package Horario;
import myinputs.Ler;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import Horario.Horarios;

public class FuncHorario {
	public static ArrayList<Horarios> gethorarios(){
		 ArrayList<Horarios> horarios = new ArrayList<Horarios>();

	        try {
	            ObjectInputStream is = new ObjectInputStream(new FileInputStream("C:\\Users\\grani\\Desktop\\ubi\\ProjetoPOO\\Projeto\\src\\Horario\\horario.dat\\"));
	            Horarios.setUltimo(is.readInt());
	            horarios = (ArrayList<Horarios>) is.readObject();
	            is.close();
	        } catch (IOException | ClassNotFoundException e) {
	            System.out.println(e.getMessage());
	        }

	        return horarios;
	    }
	}
	
