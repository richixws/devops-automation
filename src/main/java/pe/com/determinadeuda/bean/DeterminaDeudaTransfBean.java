package pe.com.determinadeuda.bean;

import java.util.List;

import lombok.Data;

@Data
public class DeterminaDeudaTransfBean {

	private List<String> cabecera;
	private List<GrupoCasillaBean> contenido;
	
	
}
