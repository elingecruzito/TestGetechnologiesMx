package mx.getechnologies.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import jakarta.transaction.Transactional;
import mx.getechnologies.test.models.SalidasVehiculosModel;

public interface SalidasRepository extends JpaRepository<SalidasVehiculosModel, Long>{
    
    @Modifying
    @Transactional
    @Query(value = "DELETE FROM salidas WHERE placa = ?1", nativeQuery = true)
    void deleteByPlaca(String placa);

}
