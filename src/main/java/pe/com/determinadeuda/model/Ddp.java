package pe.com.determinadeuda.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "ddp")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Ddp implements Serializable{

	private static final long serialVersionUID = 5879720890662921849L;
	
	@EmbeddedId
	protected DdpPK ddpPK;
    	
	@Column(name = "ddp_lllttt")
	private String ddpLllttt;
	
	@Column(name = "ddp_secuen")
	private Integer ddpSecuen;
	
	@Column(name = "ddp_nombre")
	private String ddpNombre;
	
	@Column(name = "ddp_num_reg")
	private String ddpNumReg;
	

}
