/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author lucas.pcaldara
 */
public class AppDao {
    
    private static String email;
     Connection conectado;
    PreparedStatement st;
    ResultSet resu;
    int retorno;
    
     private void conectar() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conectado = DriverManager.getConnection("jdbc:mysql://localhost:3307/ProjetoCorporativo", "root", "p@$$w0rd");

    }
    
    public ResultSet logar(String u, String s) throws ClassNotFoundException, SQLException {
        conectar();
        st = conectado.prepareStatement("SELECT * FROM usuario WHERE usuario = ? AND senha = ?;");
        st.setString(1, u);
        email = u;
        st.setString(2, s);
        resu = st.executeQuery();
        return resu;
    }
    
    
    public ResultSet email()throws ClassNotFoundException, SQLException{
        conectar();
         st = conectado.prepareStatement("SELECT * FROM progresso WHERE fk_usuario = ?");
            st.setString(1, email);
            ResultSet cursos = st.executeQuery();
            
            return cursos;
    }
    public ResultSet emailAv()throws ClassNotFoundException, SQLException{
        conectar();
         st = conectado.prepareStatement("SELECT * FROM prova WHERE fk_user = ?");
            st.setString(1, email);
            ResultSet cursos = st.executeQuery();
            
            return cursos;
    }
    
    public ResultSet checarProgresso()throws ClassNotFoundException, SQLException{
        conectar();
        
         st = conectado.prepareStatement("SELECT * FROM progresso WHERE progresso = 100%");
                ResultSet checar = st.executeQuery();
                
                return checar;
    }
    public ResultSet checarCurso(String curso)throws ClassNotFoundException, SQLException{
        conectar();
        
         st = conectado.prepareStatement("SELECT * FROM progresso WHERE curso = ?");
                st.setString(1, curso);
                ResultSet checar = st.executeQuery();
                
                return checar;
    }
    
    public void cadastroTimes(int id, String nome, String curso, int tamanhoTime)throws ClassNotFoundException, SQLException{
        conectar();
        
         st = conectado.prepareStatement("INSERT INTO equipe values(?, ?, ?, ?)");
            st.setInt(1, id);
            st.setString(2, nome);
            st.setString(3, curso);
            st.setInt(4, tamanhoTime);
            st.executeUpdate();
    }
     public int excluirTeam(String id) throws ClassNotFoundException, SQLException {
        conectar();
        st = conectado.prepareStatement("DELETE FROM equipe WHERE id_equipe = ?");
        st.setString(1, id);
        retorno = st.executeUpdate();
        return retorno;
    }
     
     public ResultSet verTeam()throws ClassNotFoundException, SQLException{
        conectar();
         st = conectado.prepareStatement("SELECT * FROM equipe");
            ResultSet times = st.executeQuery();          
            return times;
    }
     public ResultSet idRelatorio(String id)throws ClassNotFoundException, SQLException{
        conectar();
         st = conectado.prepareStatement("SELECT curso FROM equipe WHERE id_equipe = ?");
            st.setString(1, id);
            ResultSet equipeCurso = st.executeQuery();
            
            return equipeCurso;
    }
}
