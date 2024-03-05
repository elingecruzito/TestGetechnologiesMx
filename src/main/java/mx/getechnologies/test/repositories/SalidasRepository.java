package mx.getechnologies.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import mx.getechnologies.test.models.SalidasVehiculosModel;

public interface SalidasRepository extends JpaRepository<SalidasVehiculosModel, Long>{
    

}
