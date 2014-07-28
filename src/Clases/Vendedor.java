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
public class Vendedor 
{
    private int idVendedor;
    private String nombreVendedor;
    private String apellidoVendedor;
    private String Telefono;
    private String Correo;
    private String Direccion;
    private String Descripcion;

    public Vendedor() 
    {
    }

    public Vendedor(int idVendedor, String nombreVendedor, String apellidoVendedor, String Telefono, String Correo, String Direccion, String Descripcion) 
    {
        this.idVendedor = idVendedor;
        this.nombreVendedor = nombreVendedor;
        this.apellidoVendedor = apellidoVendedor;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.Direccion = Direccion;
        this.Descripcion = Descripcion;
    }

    public int getIdVendedor() 
    {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) 
    {
        this.idVendedor = idVendedor;
    }

    public String getNombreVendedor() 
    {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) 
    {
        this.nombreVendedor = nombreVendedor;
    }

    public String getApellidoVendedor() 
    {
        return apellidoVendedor;
    }

    public void setApellidoVendedor(String apellidoVendedor) 
    {
        this.apellidoVendedor = apellidoVendedor;
    }

    public String getTelefono() 
    {
        return Telefono;
    }

    public void setTelefono(String Telefono) 
    {
        this.Telefono = Telefono;
    }

    public String getCorreo() 
    {
        return Correo;
    }

    public void setCorreo(String Correo) 
    {
        this.Correo = Correo;
    }

    public String getDireccion() 
    {
        return Direccion;
    }

    public void setDireccion(String Direccion) 
    {
        this.Direccion = Direccion;
    }

    public String getDescripcion() 
    {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) 
    {
        this.Descripcion = Descripcion;
    }
    
    
    
}
