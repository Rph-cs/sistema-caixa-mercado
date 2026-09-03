package Controller;

import Model.ItemVenda;
import Model.Venda;
import config.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class VendaDAO {
    
    public boolean salvarVenda(Venda venda) {
        String sqlVenda = "INSERT INTO VENDAS (id_operador, total, forma_pagamento, troco, status) VALUES (?, ?, ?, ?, 'FINALIZADA')";
        String sqlItem = "INSERT INTO ITENS_VENDA (id_venda, id_produto, quantidade, preco_unitario, subtotal) VALUES (?, ?, ?, ?, ?)";

        Connection conn = null;
        PreparedStatement stmtVenda = null;
        PreparedStatement stmtItem = null;

        try {
            conn = ConexaoBD.conectar();
            conn.setAutoCommit(false);

            stmtVenda = conn.prepareStatement(sqlVenda, Statement.RETURN_GENERATED_KEYS);
            stmtVenda.setInt(1, venda.getIdOperador());
            stmtVenda.setDouble(2, venda.getTotal());
            stmtVenda.setString(3, venda.getFormaPagamento());
            stmtVenda.setDouble(4, venda.getTroco());
            stmtVenda.execute();

            ResultSet rs = stmtVenda.getGeneratedKeys();
            rs.next();
            int idVenda = rs.getInt(1);

            for (ItemVenda item : venda.getItens()) {
                stmtItem = conn.prepareStatement(sqlItem);
                stmtItem.setInt(1, idVenda);
                stmtItem.setInt(2, item.getIdProduto());
                stmtItem.setInt(3, item.getQuantidade());
                stmtItem.setDouble(4, item.getPrecoUnitario());
                stmtItem.setDouble(5, item.getSubtotal());
                stmtItem.execute();
            }

            conn.commit();
            return true;

        } catch (SQLException e) {
            try { if (conn != null) conn.rollback(); } catch (SQLException ex) {}
            JOptionPane.showMessageDialog(null, "Erro ao salvar venda: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
