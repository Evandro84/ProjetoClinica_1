/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansMedico;
import modeloBeans.BeansUsuario;
import modeloConection.ConexaoBD;

/**
 *
 * @author evand
 */
public class DaoUsuario {
    
     // estancia do banco de dados
    ConexaoBD conex= new  ConexaoBD();
    
    //estancia do modelomedico.. classe onde estão os gets e sets.
    BeansUsuario mod= new BeansUsuario();
    
    
    public void  Salvar(BeansUsuario mod ){
        
      conex.conexao();
        try {
             PreparedStatement  pst = conex.con.prepareStatement("insert into usuarios(usu_nome,usu_senha, usu_tipo) values(?,?,?)");
            pst.setString(1,mod.getUsuNome());
            pst.setString(2,mod.getUsuSenha());
            pst.setString(3,mod.getUsuTipo());
            //pst.setInt(4, mod.getUsuCod());
            pst.execute();
            JOptionPane.showMessageDialog(null," Usuário inserido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro inserir usuário!\n  " + ex);
        }
      conex.desconecta();
      
    }
    
      public void Alterar(BeansUsuario mod){
          conex.conexao();
          
        try {
            PreparedStatement pst= conex.con.prepareStatement("update usuarios set usu_nome=?,usu_senha=?, usu_tipo=? where usu_cod=?");
              pst.setString(1,mod.getUsuNome());
            pst.setString(2,mod.getUsuSenha());
            pst.setString(3,mod.getUsuTipo());
            pst.setInt(4, mod.getUsuCod());
            pst.execute();
             JOptionPane.showMessageDialog(null," Usuário alterado  com sucesso! ");
        } catch (SQLException ex) {
 JOptionPane.showMessageDialog(null,"Erro altentar alterar o usuário!\n  " + ex);   
        }
        
      conex.desconecta();
    }
    
    public BeansUsuario buscaUsuario(BeansUsuario mod){
     
     conex.conexao();
    
     conex.executaSql("select *from usuarios where usu_nome like '%"+ mod.getUsuPesquisa()+"%'");
        try {
            conex.rs.first();
            mod.setUsuCod(conex.rs.getInt("usu_cod"));
             mod.setUsuNome(conex.rs.getString("usu_nome"));
              mod.setUsuSenha(conex.rs.getString("usu_senha"));
               mod.setUsuTipo(conex.rs.getString("usu_Tipo"));
           
                    
            
        } catch (SQLException ex) {
   JOptionPane.showMessageDialog(null,"Usuário não cadastrado!");        }
     
     conex.desconecta();
       return mod;
       
 }
     public void Excluir(BeansUsuario mod){
          conex.conexao();
          
        try {
            PreparedStatement pst=conex.con.prepareStatement("delete from usuarios where usu_cod=?");
             pst.setInt(1, mod.getUsuCod());    
             pst.execute();
            JOptionPane.showMessageDialog(null," Usuário excluido com sucesso! ");

            
        } catch (SQLException ex) {
 JOptionPane.showMessageDialog(null,"Erro ao excluir usuário!\n  " + ex);   
        }
          
        conex.desconecta();  
      }
    
}
