
package modeloDao;

import java.sql.*;
import modeloConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansMedico;


public class DaoMedico {
    // estancia do banco de dados
    ConexaoBD conex= new  ConexaoBD();
    
    //estancia do modelomedico.. classe onde estão os gets e sets.
    BeansMedico mod= new BeansMedico();
    
    
    public void  Salvar(BeansMedico mod ){
        
      conex.conexao();
        try {
             PreparedStatement  pst = conex.con.prepareStatement("insert into medicos(nome_medico, especialidade_medico, crm_medico) values(?,?,?)");
            pst.setString(1,mod.getNome());
            pst.setString(2,mod.getEspecialidade());
            pst.setInt(3,mod.getCrm());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao  inserir dados!\n  " + ex);
        }
      conex.desconecta();
      
    }
      
      public void Editar(BeansMedico mod){
          conex.conexao();
          
        try {
            PreparedStatement pst= conex.con.prepareStatement("update medicos set nome_medico=?, especialidade_medico=?, crm_medico=? where cod_medico=?");
              pst.setString(1,mod.getNome());
            pst.setString(2,mod.getEspecialidade());
            pst.setInt(3,mod.getCrm());
            pst.setInt(4, mod.getCodigo());
            pst.execute();
             JOptionPane.showMessageDialog(null," Dados alterados com sucesso! ");
        } catch (SQLException ex) {
 JOptionPane.showMessageDialog(null,"Erro na alteração dos dados!\n  " + ex);   
        }
        
      conex.desconecta();
    }
      
      public void Excluir(BeansMedico mod){
          conex.conexao();
          
        try {
            PreparedStatement pst=conex.con.prepareStatement("delete from medicos where cod_medico=?");
             pst.setInt(1, mod.getCodigo());    
             pst.execute();
            JOptionPane.showMessageDialog(null," Dados excluido com sucesso! ");

            
        } catch (SQLException ex) {
 JOptionPane.showMessageDialog(null,"Erro ao excluir dados!\n  " + ex);   
        }
          
        conex.desconecta();  
      }
    
 public BeansMedico buscaMedico(BeansMedico mod){
     
     conex.conexao();
    
     conex.executaSql("select *from medicos where nome_medico like '%"+ mod.getPesquisa()+"%'");
        try {
            conex.rs.first();
            mod.setCodigo(conex.rs.getInt("cod_medico"));
             mod.setNome(conex.rs.getString("nome_medico"));
              mod.setEspecialidade(conex.rs.getString("especialidade_medico"));
               mod.setCrm(conex.rs.getInt("crm_medico"));
           
                    
            
        } catch (SQLException ex) {
   JOptionPane.showMessageDialog(null,"Médico não cadastrado!");        }
     
     conex.desconecta();
        return mod;
       
 }
     
 
    
    
}
