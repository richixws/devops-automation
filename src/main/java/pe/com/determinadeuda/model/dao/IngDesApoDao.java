package pe.com.determinadeuda.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.determinadeuda.model.IngDesApo;

public interface IngDesApoDao extends JpaRepository<IngDesApo, String> {
	
	@Query("SELECT i FROM IngDesApo i WHERE i.numCorDet = ?1")
	public List<IngDesApo> listaDetalleAporte(Integer numCorDet);

}
