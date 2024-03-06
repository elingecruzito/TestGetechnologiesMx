package mx.getechnologies.test.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import mx.getechnologies.test.models.ReporteVehiculosModel;

public interface ReporteRepository extends JpaRepository<ReporteVehiculosModel, Long>{

    @Query(value = "SELECT s.id, e.placa, SUM(s.minutos) as tiempo ,SUM(importe_total) as total  FROM entradas e, salidas s WHERE e.tipo = 1 AND s.entrada = e.id GROUP BY e.placa", nativeQuery = true)
    List<ReporteVehiculosModel> findAllReporteVehiculos(int tipo);

}
