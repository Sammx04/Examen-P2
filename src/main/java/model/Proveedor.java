package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the proveedor database table.
 * 
 */
@Entity
@NamedQuery(name="Proveedor.findAll", query="SELECT p FROM Proveedor p")
public class Proveedor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idproveedor;

	private String email;

	@Temporal(TemporalType.DATE)
	private Date fechaing;

	private String nombre;

	private String rsocial;

	private String ruc;

	public Proveedor() {
	}

	public int getIdproveedor() {
		return this.idproveedor;
	}

	public void setIdproveedor(int idproveedor) {
		this.idproveedor = idproveedor;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFechaing() {
		return this.fechaing;
	}

	public void setFechaing(Date fechaing) {
		this.fechaing = fechaing;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRsocial() {
		return this.rsocial;
	}

	public void setRsocial(String rsocial) {
		this.rsocial = rsocial;
	}

	public String getRuc() {
		return this.ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

}