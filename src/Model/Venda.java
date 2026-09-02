package Model;

import java.util.List;

public class Venda {
    private int idVenda;
    private int idOperador;
    private double total;
    private String formaPagamento;
    private double troco;
    private List<ItemVenda> itens;

    public Venda() {}

    public int getIdVenda() { return idVenda; }
    public void setIdVendaa(int idVenda) { this.idVenda = idVenda; }

    public int getIdOperador() { return idOperador; }
    public void setIdOperador(int idOperador) { this.idOperador = idOperador; }

    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }

    public String getFormaPagamento() { return formaPagamento; }
    public void setFormaPagamento(String formaPagamento) { this.formaPagamento = formaPagamento; }

    public double getTroco() { return troco; }
    public void setTroco(double troco) { this.troco = troco; }

    public List<ItemVenda> getItens() { return itens; }
    public void setItens(List<ItemVenda> itens) { this.itens = itens; }
    
}
