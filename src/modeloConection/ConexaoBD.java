/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloConection;
import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author evand
 */
public class ConexaoBD {
    
    public Statement stm;
    public ResultSet rs;
    private String driver="org.postgresql.Driver";
    private String caminho= "jdbc:postgresql://localhost:5432/clinicaprojeto";
    private String usuario= "postgres";
    private String senha="123";
    public Connection con;
            
 public void conexao(){
     
       try {
           //esse código seta a propriedade de conexão.
    System.setProperty("jdbc.Drivers", driver);
           //o código seta os atributos necessãrios para acesso.
           con=DriverManager.getConnection(caminho, usuario, senha);
           
          // JOptionPane.showMessageDialog(null, "COnexão realizada com sucesso!");
       } catch (SQLException ex) {
          
           JOptionPane.showMessageDialog(null, "Erro ao tentar se comunicar com o banco de dados!\n" + ex.getMessage());
       }
        
    }
   public void executaSql(String sql){
       
        try {
            stm= con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro executaSQL\n" + ex.getMessage());
        }
   }
    //esse método é referente a desconexão com o banco de dados
    public void desconecta(){
        
       try {
           con.close();
        // JOptionPane.showMessageDialog (null, "Desconexão realizada com sucesso!");
       } catch (SQLException ex) {
           
           JOptionPane.showMessageDialog(null, "Erro ao tentar se desconectar com o banco de dados\n"+ ex.getMessage());
       }
    }

    
    }
    

   

