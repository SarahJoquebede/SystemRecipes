package projetinho;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 20231114010063
 */
public class Gravador {
    
    public static void gravar(String arquivo,Object objeto)throws FileNotFoundException, IOException{
        FileOutputStream outFile = new FileOutputStream(arquivo);
        ObjectOutputStream s = new ObjectOutputStream(outFile);
        s.writeObject(objeto);
        s.close();
        
}
    public static Object ler(String arquivo)throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream inFile = new FileInputStream(arquivo);
        ObjectInputStream s = new ObjectInputStream(inFile);
        Object objeto= s.readObject();
        s.close();
        
        return objeto;
    }
}
