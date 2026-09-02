package Controller;

import config.ConexaoBD;
import Model.Operador;
import Model.enums.Perfil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class OperadorDAO {
    
    public Operador buscarLogin(String login, String senha){
        String sql = "SELECT * FROM OPERADORES WHERE login = ? AND senha = ?";
        
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            conn = ConexaoBD.conectar();
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, login);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            
            if (rs.next()) {
                Operador operador = new Operador();
                operador.setIdOperador(rs.getInt("id_operador"));
                operador.setnomeOperador(rs.getString("nome"));
                operador.setloginOperador(rs.getString("login"));
                operador.setsenhaOperador(rs.getString("senha"));
                operador.setperfilOperador(Perfil.valueOf(rs.getString("perfil")));
                return operador;
            }
            
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao fazer login: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        return null;
    }
}