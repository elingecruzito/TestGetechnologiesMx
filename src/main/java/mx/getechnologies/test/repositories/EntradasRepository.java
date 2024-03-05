package mx.getechnologies.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import mx.getechnologies.test.models.EntradasVehiculosModel;

@Repository
public interface EntradasRepository extends JpaRepository<EntradasVehiculosModel, Long>{

    
    @Query(value = "SELECT * FROM entradas WHERE placa = ?1 ORDER BY entrada DESC LIMIT 1", nativeQuery = true)
    EntradasVehiculosModel getLastEntrada(String placa);
    
}
