package mx.getechnologies.test.controllers;

import org.springframework.web.bind.annotation.RestController;

import mx.getechnologies.test.models.EntradasVehiculosModel;
import mx.getechnologies.test.models.SalidasVehiculosModel;
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

    @PostMapping("/nueva")
    public SalidasVehiculosModel nuevaSalida(@RequestBody SalidasVehiculosModel model) {
        entrada = entradasRepository.getLastEntrada(model.getPlaca());
        long milisegundos = System.currentTimeMillis() - entrada.getEntrada().getTime();
        int minutos = (int) ((milisegundos / (1000 * 60)) % 60);
        //model.setImporteTotal((placa.getImporte() * minutos));
        return repository.save(model);
    }
    

}
