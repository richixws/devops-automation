package pe.com.determinadeuda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
@Entity
@Table(name = "t12466ddjj_det")
public class DddjjDet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="num_cor_det")
	private Integer numCorDet;	
	
	@Column(name="num_cor_ddjj")    
	private Integer numCorDDJJ;
	
	@Column(name="cod_tip_pre")    
	private String codTipPre;
	
	@Column(name="cod_reg_salud")    
	private String codRegSalud;	
	
	@Column(name="cod_reg_pension")    
	private String codRegPension;	

	@Column(name="ind_consist")    
	private String indConsist;
}
