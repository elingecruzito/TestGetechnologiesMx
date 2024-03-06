package mx.getechnologies.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;
import mx.getechnologies.test.models.EntradasVehiculosModel;
import java.util.List;



@Repository
public interface EntradasRepository extends JpaRepository<EntradasVehiculosModel, Long>{

    
    @Query(value = "SELECT * FROM entradas WHERE placa = ?1 ORDER BY entrada DESC LIMIT 1", nativeQuery = true)
    EntradasVehiculosModel getLastEntrada(String placa);

    List<EntradasVehiculosModel> findByTipo(int tipo);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM entradas WHERE tipo = ?1", nativeQuery = true)
    void deleteByTipo(int tipo);
    
}
