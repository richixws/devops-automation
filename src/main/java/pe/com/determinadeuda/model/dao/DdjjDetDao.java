package pe.com.determinadeuda.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.com.determinadeuda.model.DddjjDet;

public interface DdjjDetDao extends JpaRepository<DddjjDet, Integer>{
	
	public List<DddjjDet> findByNumCorDDjj(Integer numCorDDJJ);
	

}
