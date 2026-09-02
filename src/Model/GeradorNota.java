package Model;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.File;
import java.awt.Desktop;
import java.util.List;

public class GeradorNota {

    public static void gerar(int idVenda, double total, String formaPagamento, double troco, List<ItemVenda> itens) {
        String nomeArquivo = "NotaFiscal_" + idVenda + ".pdf";
        Document document = new Document();

        try {
            PdfWriter.getInstance(document, new FileOutputStream(nomeArquivo));
            document.open();

            document.add(new Paragraph("=========================================="));
            document.add(new Paragraph("               MERCADO BÃO                "));
            document.add(new Paragraph("=========================================="));
            document.add(new Paragraph("Venda Nº: " + idVenda));
            document.add(new Paragraph("Forma de Pagamento: " + formaPagamento));
            document.add(new Paragraph("------------------------------------------"));
            document.add(new Paragraph("ITENS DA COMPRA:"));

            if (itens != null) {
                for (ItemVenda item : itens) {
                    document.add(new Paragraph(item.getNomeProduto() + " x" + item.getQuantidade() + " - R$ " + String.format("%.2f", item.getSubtotal())));
                }
            }

            document.add(new Paragraph("------------------------------------------"));
            document.add(new Paragraph("Total: R$ " + String.format("%.2f", total)));
            document.add(new Paragraph("Troco: R$ " + String.format("%.2f", troco)));
            document.add(new Paragraph("=========================================="));
            document.add(new Paragraph("         Obrigado pela preferência!       "));

            document.close();

            File pdfFile = new File(nomeArquivo);
            if (pdfFile.exists() && Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(pdfFile);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}