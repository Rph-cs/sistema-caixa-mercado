package Controller;

import Model.Produto;
import config.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ProdutoDAO {
    
    public Produto buscarPorCodigo(String codigoBarras) {
        String sql = "SELECT * FROM PRODUTOS WHERE codigo_barras = ?";

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = ConexaoBD.conectar();
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, codigoBarras);
            rs = stmt.executeQuery();

            if (rs.next()) {
                Produto produto = new Produto();
                produto.setIdProduto(rs.getInt("id_produto"));
                produto.setCodigoBarras(rs.getString("codigo_barras"));
                produto.setNome(rs.getString("nome"));
                produto.setPreco(rs.getDouble("preco"));
                produto.setEstoque(rs.getInt("estoque"));
                return produto;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar produto: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return null;
    }
}
