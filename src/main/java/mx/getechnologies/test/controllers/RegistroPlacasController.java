package mx.getechnologies.test.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.getechnologies.test.models.PlacasVehiculosModel;
import mx.getechnologies.test.models.TiposVehiculo;
import mx.getechnologies.test.repositories.PlacasRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/registro")
public class RegistroPlacasController {

    @Autowired
    private PlacasRepository repository;

    @PostMapping("/oficial")
    public PlacasVehiculosModel nuevaPlacaOficial(@RequestBody PlacasVehiculosModel model) {
        model.setIdTipo(TiposVehiculo.OFICIAL.ordinal());       
        return repository.save(model);
    }

    @PostMapping("/residente")
    public PlacasVehiculosModel nuevaPlacaResidente(@RequestBody PlacasVehiculosModel model) {
        model.setIdTipo(TiposVehiculo.RESIDENTE.ordinal());   
        return repository.save(model);
    }
    

}
