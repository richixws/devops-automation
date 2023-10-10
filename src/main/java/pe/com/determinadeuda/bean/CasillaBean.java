package pe.com.determinadeuda.bean;

import lombok.Data;

@Data
public class CasillaBean {
	
	private String codCasilla;
	private Double valCasilla;
	private Boolean isHabilitado;
	private Boolean isPopup;
	private String namePopup;
	private Boolean isVisible=false;
	
	

}
