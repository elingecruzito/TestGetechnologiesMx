package mx.getechnologies.test.controllers;

import org.springframework.web.bind.annotation.RestController;

import mx.getechnologies.test.models.EntradasVehiculosModel;
import mx.getechnologies.test.models.SalidasVehiculosModel;
import mx.getechnologies.test.models.TiposVehiculo;
import mx.getechnologies.test.repositories.EntradasRepository;
import mx.getechnologies.test.repositories.SalidasRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/salidas")

public class SalidasController {


    @Autowired
    private SalidasRepository repository;

    @Autowired
    private EntradasRepository entradasRepository;


    private EntradasVehiculosModel entrada;
    private TiposVehiculo tipoVehiculo;
    private String menssage;

    @PostMapping("/nueva")
    public String nuevaSalida(@RequestBody SalidasVehiculosModel model) {
        entrada = entradasRepository.getLastEntrada(model.getPlaca());
        long milisegundos = System.currentTimeMillis() - entrada.getEntrada().getTime();
        int minutos = (int) ((milisegundos / (1000 * 60)) % 60);
        model.setImporteTotal((getImporet(entrada.getTipo()) * minutos));
        model = repository.save(model);
        switch (tipoVehiculo) {
            case OFICIAL:
                menssage = "Se registro con exito su salida, Buen viaje!";
                break;

            case RESIDENTE:
                menssage = "El importe de $" + model.getImporteTotal() + " se a acumulado a su cuenta, Buen viaje!";
            break;
                
            default:
                menssage = "Su importe es de $" + model.getImporteTotal();
                break;
        }
        return menssage;
    }

    private Double getImporet(int tipo){
        tipoVehiculo = TiposVehiculo.values()[tipo];
        Double importe = 0.0;
        switch (tipoVehiculo) {
            case OFICIAL:
                importe = 0.0;
                break;

            case RESIDENTE:
                importe = 0.05;
            break;
        
            default:
                importe =  0.05;
                break;
        }

        return importe;
    }
    

}
