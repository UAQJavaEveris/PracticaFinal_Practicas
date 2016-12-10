
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abel
 */
public class Persona implements Serializable {
	private int id;
	private String nombre;
	private String fechaNac;
	private String domicilio;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
	private String telefono;
	private String correo;

	public Persona (int id, String nombre,String fechaNac,Strin domicilio,String telefono,String correo){
		this.id=id;
		this.nombre=nombre;
		this.fechaNac=fechaNac;
		this.domicilio=domicilio;
		this.telefono=telefono;
		this.correo=correo;
	}
}