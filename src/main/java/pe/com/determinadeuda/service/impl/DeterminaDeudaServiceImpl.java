package pe.com.determinadeuda.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import pe.com.determinadeuda.bean.DeterminaDeudaTransfBean;
import pe.com.determinadeuda.bean.GrupoCasillaBean;
import pe.com.determinadeuda.bean.RespuestaBean;
import pe.com.determinadeuda.model.DddjjDet;
import pe.com.determinadeuda.model.IngDesApo;
import pe.com.determinadeuda.model.dao.DdjjDetDao;
import pe.com.determinadeuda.model.dao.IngDesApoDao;
import pe.com.determinadeuda.service.DeterminaDeudaService;

@Service
public class DeterminaDeudaServiceImpl implements DeterminaDeudaService {

	
	@Autowired
	private  DdjjDetDao ddjjDetDao;
	
	@Autowired
	private IngDesApoDao desApoDao;
	
	@Override
	public ResponseEntity<?> obtenerDeterminaDeuda(Integer numCorDDJJ, String indRectifica) {
		
		RespuestaBean result=new RespuestaBean();
		DeterminaDeudaTransfBean determinaDeuda=new DeterminaDeudaTransfBean();
		
		try {
			
			List<String> cabecera=new ArrayList<String>();
			List<GrupoCasillaBean> listaGrupo=new ArrayList<GrupoCasillaBean>();
			List<DddjjDet> lstDetDj=ddjjDetDao.findByNumCorDDjj(numCorDDJJ);
			List<IngDesApo> listConceptos=new ArrayList<>();
			
			for (DddjjDet lista : lstDetDj) {
				listConceptos.addAll(desApoDao.listaDetalleAporte(numCorDDJJ));
			}
			
			//List<DeudaDet> listCasillas=
			
			return ResponseEntity.status(HttpStatus.OK).body("hola ");
			
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return ResponseEntity.status(HttpStatus.OK).body("hola ");
	}

}
