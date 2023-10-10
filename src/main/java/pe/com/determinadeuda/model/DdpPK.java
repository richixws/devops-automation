package pe.com.determinadeuda.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Embeddable
@NoArgsConstructor
@Getter
@Setter
@ToString
public class DdpPK implements Serializable {

	private static final long serialVersionUID = -8365439591581741534L;

	@Column(name = "ddp_numruc")
	private String ddpNumruc;
	
	
	
}
