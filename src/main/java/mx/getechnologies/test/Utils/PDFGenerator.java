package mx.getechnologies.test.Utils;

import java.io.IOException;
import java.util.List;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.CMYKColor;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import jakarta.servlet.http.HttpServletResponse;
import mx.getechnologies.test.models.ReporteVehiculosModel;

public class PDFGenerator {

    private List<ReporteVehiculosModel> reporteVehiculosModels;

    public void setReporteVehiculosModels(List<ReporteVehiculosModel> reporteVehiculosModels) {
        this.reporteVehiculosModels = reporteVehiculosModels;
    }

    public void generate(HttpServletResponse response) throws DocumentException, IOException {

        // Creating the Object of Document
        Document document = new Document(PageSize.A4);

        // Getting instance of PdfWriter
        PdfWriter.getInstance(document, response.getOutputStream());

        // Opening the created document to modify it
        document.open();

        // Creating font
        // Setting font style and size
        Font fontTiltle = FontFactory.getFont(FontFactory.TIMES_ROMAN);
        fontTiltle.setSize(20);

        // Creating paragraph
        Paragraph paragraph = new Paragraph("Pagos de residentes", fontTiltle);

        // Aligning the paragraph in document
        paragraph.setAlignment(Paragraph.ALIGN_CENTER);

        // Adding the created paragraph in document
        document.add(paragraph);

        // Creating a table of 3 columns
        PdfPTable table = new PdfPTable(3);

        // Setting width of table, its columns and spacing
        table.setWidthPercentage(100f);
        table.setWidths(new int[] { 3, 3, 3 });
        table.setSpacingBefore(5);

        // Create Table Cells for table header
        PdfPCell cell = new PdfPCell();

        // Setting the background color and padding
        cell.setBackgroundColor(CMYKColor.BLUE);
        cell.setPadding(5);

        // Creating font
        // Setting font style and size
        Font font = FontFactory.getFont(FontFactory.TIMES_ROMAN);
        font.setColor(CMYKColor.WHITE);

        // Adding headings in the created table cell/ header
        // Adding Cell to table
        cell.setPhrase(new Phrase("Numero placa", font));
        table.addCell(cell);
        cell.setPhrase(new Phrase("Tiempo total (min)", font));
        table.addCell(cell);
        cell.setPhrase(new Phrase("Cantidad a pagar", font));
        table.addCell(cell);

        // Iterating over the list of students
        for (ReporteVehiculosModel vehiculosModel : reporteVehiculosModels) {
            table.addCell(vehiculosModel.getPlaca());
            table.addCell(String.valueOf(vehiculosModel.getTiempo()));
            table.addCell(String.format("%.2f", vehiculosModel.getTotal()));
        }
        // Adding the created table to document
        document.add(table);

        // Closing the document
        document.close();

    }
}
