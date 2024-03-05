package mx.getechnologies.test.controllers;
import org.springframework.web.bind.annotation.RestController;

import mx.getechnologies.test.models.EntradasVehiculosModel;
import mx.getechnologies.test.repositories.EntradasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/entradas")
public class EntradasController {

    @Autowired
    private EntradasRepository repository;    

    @PostMapping("/nueva")
    public EntradasVehiculosModel nuevaEntrada(@RequestBody EntradasVehiculosModel model) {

        

        return repository.save(model);
    }
    

}
