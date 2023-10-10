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
@Table(name = "ing_des_apo")
public class IngDesApo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="num_cor_ida")
	private String numCorIda;
	
	@Column(name="num_cor_det")
	private String numCorDet;
	
	@Column(name="cod_concep")
	private String codConcep;
	
	@Column(name="mto_deveng")
	private Double mtoDeveng;
	
	@Column(name="mto_pag_des")
	private Double mtoPagDes;
	
	@Column(name="mto_bas_cal")
	private Double mtoBasCal;
	
	@Column(name="mto_impuesto")
	private Double mtoImpuesto;
}
