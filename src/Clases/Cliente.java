/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

/**
 *
 * @author Gabriel
 */
public class Cliente 
{
    private String Nombre;
    private String Apellido;
    private String Cedula;
    private String Telefono;
    private String Direccion;

    public Cliente() 
    {
    }

    public Cliente(String Nombre, String Apellido, String Cedula, String Telefono, String Direccion) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cedula = Cedula;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
    }

    public String getNombre()
    {
        return Nombre;
    }

    public void setNombre(String Nombre) 
    {
        this.Nombre = Nombre;
    }

    public String getApellido() 
    {
        return Apellido;
    }

    public void setApellido(String Apellido) 
    {
        this.Apellido = Apellido;
    }

    public String getCedula() 
    {
        return Cedula;
    }

    public void setCedula(String Cedula) 
    {
        this.Cedula = Cedula;
    }

    public String getTelefono() 
    {
        return Telefono;
    }

    public void setTelefono(String Telefono) 
    {
        this.Telefono = Telefono;
    }

    public String getDireccion() 
    {
        return Direccion;
    }

    public void setDireccion(String Direccion)
    {
        this.Direccion = Direccion;
    }
    
    
   
    
    
}
