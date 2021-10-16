package com.misiontic.SistemaControlVacunacion.Model;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Entity
@Table(name="registroPaciente")
public class registroPacienteModel implements Serializable{
	private static final long serialVersionUID = 1L;
	//Primary key
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String noDocumento;
	//Other columns
	@Column(name="nombres",length=30,nullable=false)
	private String nombres;
	@Column(name="apellidos",length=30,nullable=false)
	private String apellidos;
	@Column(name="tipoDoc",length=3,nullable=false)
	private String tipoDoc;
	@Column(name="departamento",length=40,nullable=false)
	private String departamento;
	@Column(name="pais",length=40,nullable=false)
	private String pais;
	@Column(name="ciudad",length=40,nullable=false)
	private String ciudad;
	@Column(name="farmaceutica",length=10,nullable=false)
	private String farmaceutica;
	@Column(name="dosis",length=2,nullable=false)
	private String dosis;
	@Column(name="fecha",nullable=false)
	private Date fecha;
	@Column(name="puestoVacunacion",length=100,nullable=false)
	private String puestoVacunacion;
	//getters and setters
	public String getNoDocumento() {
		return noDocumento;
	}
	public void setNoDocumento(String noDocumento) {
		this.noDocumento = noDocumento;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getTipoDoc() {
		return tipoDoc;
	}
	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getFarmaceutica() {
		return farmaceutica;
	}
	public void setFarmaceutica(String farmaceutica) {
		this.farmaceutica = farmaceutica;
	}
	public String getDosis() {
		return dosis;
	}
	public void setDosis(String dosis) {
		this.dosis = dosis;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getPuestoVacunacion() {
		return puestoVacunacion;
	}
	public void setPuestoVacunacion(String puestoVacunacion) {
		this.puestoVacunacion = puestoVacunacion;
	}
	
}
