package mx.getechnologies.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import mx.getechnologies.test.models.PlacasImporteModel;

public interface PlacasImporteRepository extends JpaRepository<PlacasImporteModel, Long> {

    @Query(value = "SELECT p.id, p.placa, t.tipo, t.importe FROM placas p, tipos_vehiculos t WHERE p.tipo = t.id AND p.placa = ?1", nativeQuery = true)
    PlacasImporteModel getRegistroPlaca(String placa);
    
}