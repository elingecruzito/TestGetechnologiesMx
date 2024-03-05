package mx.getechnologies.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import mx.getechnologies.test.models.PlacasVehiculosModel;

public interface PlacasRepository extends JpaRepository<PlacasVehiculosModel, Long>{

}
