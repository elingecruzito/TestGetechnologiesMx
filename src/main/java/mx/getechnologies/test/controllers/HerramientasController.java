package mx.getechnologies.test.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lowagie.text.DocumentException;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.websocket.server.PathParam;
import mx.getechnologies.test.Utils.PDFGenerator;
import mx.getechnologies.test.models.EntradasVehiculosModel;
import mx.getechnologies.test.models.TiposVehiculo;
import mx.getechnologies.test.repositories.EntradasRepository;
import mx.getechnologies.test.repositories.ReporteRepository;
import mx.getechnologies.test.repositories.SalidasRepository;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/api")
public class HerramientasController {

    @Autowired
    private EntradasRepository entradasRepository;

    @Autowired
    private SalidasRepository salidasRepository;

    @Autowired
    private ReporteRepository reporteRepository;

    private List<EntradasVehiculosModel> entradas;
    private PDFGenerator pdfGenerator;

    @GetMapping("/comienza/mes")
    public String comienzaMes() {

        deleteAllSalidasByTipo(TiposVehiculo.OFICIAL.ordinal());
        deleteAllSalidasByTipo(TiposVehiculo.RESIDENTE.ordinal());       
        return "Los registros de vehiculos oficiales y de residentes han sido eliminados!";
    }

    @GetMapping("/informe/residentes/{file}")
    public void informeResidentes(HttpServletResponse response, @PathVariable String file) throws DocumentException, IOException{

        response.setContentType("application/pdf");
		response.setHeader("Content-Disposition", "attachment; filename=" + file + ".pdf");

        if(pdfGenerator == null){
            pdfGenerator = new PDFGenerator();
        }
        pdfGenerator.setReporteVehiculosModels(reporteRepository.findAllReporteVehiculos(TiposVehiculo.RESIDENTE.ordinal()));
        pdfGenerator.generate(response);
    }
    
    private void deleteAllSalidasByTipo(int tipo){
        entradas = entradasRepository.findByTipo(tipo);
        for (EntradasVehiculosModel entradasVehiculosModel : entradas) {
            salidasRepository.deleteByPlaca(entradasVehiculosModel.getPlaca());;
        }

        entradasRepository.deleteByTipo(tipo);
    }
    

}
