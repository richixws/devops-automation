package pe.com.determinadeuda.rest;

import javax.websocket.server.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import pe.com.determinadeuda.bean.RespuestaBean;
import pe.com.determinadeuda.service.DeterminaDeudaService;

@RestController
@RequestMapping("/")
@Slf4j
public class DeterminaDeudaController {

	
	@Autowired
	private DeterminaDeudaService determinaDeudaService;
	//final static Logger logger = LoggerFactory.getLogger(DeterminaDeudaController.class);

	@GetMapping("determinadeuda/{{numCorDDJJ}}/obtenerDeterminacion")
	public ResponseEntity<?> obtenerDeterminaDeuda(@PathParam("numCorDDJJ") Integer numCorDDJJ,
												    @PathParam("indRectifica") String indRectifica){
		
		log.info("Get obtenerDeterminacion rest");
		
		RespuestaBean result=new RespuestaBean();
		
		try {
			
			result=determinaDeudaService.obtenerDeterminaDeuda(numCorDDJJ, indRectifica);
		    return ResponseEntity.status(HttpStatus.OK).body(result);	
		} catch (Exception e) {
		  return null;
		}
		
		
		
	}
}
