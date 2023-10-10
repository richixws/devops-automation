package pe.com.determinadeuda.service;

import org.springframework.http.ResponseEntity;

import pe.com.determinadeuda.bean.RespuestaBean;

public interface DeterminaDeudaService {

	public RespuestaBean<?> obtenerDeterminaDeuda(Integer numCorDDJJ,String indRectifica);
}
