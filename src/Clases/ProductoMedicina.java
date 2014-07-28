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
public class ProductoMedicina 
{
    private int codigoProductoMedicina;
    private String nombreProductoMedicina;
    private int cantidadProductoMedicina;
    private double precioUnitario;
    private String Descripcion;

    public ProductoMedicina() 
    {
    }

    public ProductoMedicina(int codigoProductoMedicina, String nombreProductoMedicina, int cantidadProductoMedicina, double precioUnitario, String Descripcion) 
    {
        this.codigoProductoMedicina = codigoProductoMedicina;
        this.nombreProductoMedicina = nombreProductoMedicina;
        this.cantidadProductoMedicina = cantidadProductoMedicina;
        this.precioUnitario = precioUnitario;
        this.Descripcion = Descripcion;
    }

    public int getCodigoProductoMedicina() 
    {
        return codigoProductoMedicina;
    }

    public void setCodigoProductoMedicina(int codigoProductoMedicina) 
    {
        this.codigoProductoMedicina = codigoProductoMedicina;
    }

    public String getNombreProductoMedicina() 
    {
        return nombreProductoMedicina;
    }

    public void setNombreProductoMedicina(String nombreProductoMedicina) 
    {
        this.nombreProductoMedicina = nombreProductoMedicina;
    }

    public int getCantidadProductoMedicina() 
    {
        return cantidadProductoMedicina;
    }

    public void setCantidadProductoMedicina(int cantidadProductoMedicina) 
    {
        this.cantidadProductoMedicina = cantidadProductoMedicina;
    }

    public double getPrecio() 
    {
        return precioUnitario;
    }

    public void setPrecio(double Precio) 
    {
        this.precioUnitario = Precio;
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
