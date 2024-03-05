package mx.getechnologies.test.controllers;
import org.springframework.web.bind.annotation.RestController;

import mx.getechnologies.test.models.EntradasVehiculosModel;
import mx.getechnologies.test.models.PlacasVehiculosModel;
import mx.getechnologies.test.models.TiposVehiculo;
import mx.getechnologies.test.repositories.EntradasRepository;
import mx.getechnologies.test.repositories.PlacasRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/entradas")
public class EntradasController {

    @Autowired
    private EntradasRepository repository;    

    @Autowired
    private PlacasRepository placasRepository;

    private PlacasVehiculosModel placasVehiculosModel;

    @PostMapping("/nueva")
    public EntradasVehiculosModel nuevaEntrada(@RequestBody EntradasVehiculosModel model) {
        placasVehiculosModel = placasRepository.getPlaca(model.getPlaca());
        model.setTipo(placasVehiculosModel != null ? placasVehiculosModel.getIdTipo() : TiposVehiculo.NO_RESIDENTE.ordinal());
        return repository.save(model);
    }
    

}
