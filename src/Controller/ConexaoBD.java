package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {

    private static final String URL = "jdbc:mysql://localhost:3306/PDV_SUPERMERCADO";
    private static final String USUARIO = "root";
    private static final String SENHA = "";
    
    public static Connection conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USUARIO, SENHA); 
            
        } catch(ClassNotFoundException e) {
            System.out.println("Erro: Driver do MYSQL não foi encontrado");
            return null;
            
        } catch (SQLException e){
            System.out.println("Erro ao conectar com o banco de dados:" + e.getMessage());
            return null;
        }
    }
    
}
