package mx.getechnologies.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import mx.getechnologies.test.models.PlacasVehiculosModel;

public interface PlacasRepository extends JpaRepository<PlacasVehiculosModel, Long>{

    @Query(value = "SELECT * FROM placas WHERE placa = ?1 ORDER BY id DESC LIMIT 1", nativeQuery = true)
    PlacasVehiculosModel getPlaca(String placa);

}
