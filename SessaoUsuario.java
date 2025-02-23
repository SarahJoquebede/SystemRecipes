/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author sarah
 */
public class SessaoUsuario {
   private static Map<String, String> usuarios = new HashMap<>();
   public static void cadastrarUsuario(String nome, String senha) {
        usuarios.put(nome, senha);
   }
    public static boolean autenticarUsuario(String nome, String senha) {
        return usuarios.containsKey(nome) && usuarios.get(nome).equals(senha);
    }
}
