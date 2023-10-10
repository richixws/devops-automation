package pe.com.determinadeuda.bean;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RespuestaBean<T> implements Serializable {

	private static final long serialVersionUID = -8809441800243147684L;

	@JsonProperty("cod")
	@JsonInclude(value = Include.NON_NULL)
	private int cod;
	
	@JsonProperty("msg")
	@JsonInclude(value = Include.NON_NULL)
	private String msg;
	
	@JsonProperty("success")
	@JsonInclude(value = Include.NON_NULL)
	private boolean success;
	
	@JsonProperty("data")
	@JsonInclude(value = Include.NON_NULL)
	private T data;
	
	public RespuestaBean(String msg) {
		this.msg=msg;
		data=null;
	}
	public RespuestaBean(String msg, int cod) {
		this.msg=msg;
		this.cod=cod;
		data=null;
	}
	public RespuestaBean(T data, int cod) {
		this.cod=cod;
		this.data=data;
		this.msg="-";
	}
	public RespuestaBean(int cod,String msg, T data) {
		this.msg=msg;
		this.cod=cod;
		this.data=data;
	}
	
	
	

}
