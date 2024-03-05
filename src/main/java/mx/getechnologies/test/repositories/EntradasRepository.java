package mx.getechnologies.test.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mx.getechnologies.test.models.EntradasVehiculosModel;

@Repository
public interface EntradasRepository extends JpaRepository<EntradasVehiculosModel, Long>{

    EntradasVehiculosModel findByPlaca(@Param("placa") String placa);
    
}
