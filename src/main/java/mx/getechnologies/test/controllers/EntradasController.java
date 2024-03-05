package mx.getechnologies.test.controllers;
import org.springframework.web.bind.annotation.RestController;

import mx.getechnologies.test.models.EntradasVehiculosModel;
import mx.getechnologies.test.repositories.EntradasRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/entradas")
public class EntradasController {

    @Autowired
    private EntradasRepository repository;

    @GetMapping("/list")
    public List<EntradasVehiculosModel> getAllEntradas() {
        return repository.findAll();
    }

    @GetMapping("/{placa}")
    public EntradasVehiculosModel getByPlaca(@PathVariable("placa") String placa) {
        return repository.findByPlaca(placa);
    }
    

    @PostMapping("/nueva")
    public EntradasVehiculosModel nuevaEntrada(@RequestBody EntradasVehiculosModel model) {
        return repository.save(model);
    }
    

}
