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
public class Pago 
{
    private int numeroPago;
    private String Descripcion;
    private double Cantidad;

    public Pago() 
    {
    }
    

    public Pago(int numeroPago, String Descripcion, double Cantidad) 
    {
        this.numeroPago = numeroPago;
        this.Descripcion = Descripcion;
        this.Cantidad = Cantidad;
    }

    public int getNumeroPago() 
    {
        return numeroPago;
    }

    public void setNumeroPago(int numeroPago) 
    {
        this.numeroPago = numeroPago;
    }

    public String getDescripcion() 
    {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) 
    {
        this.Descripcion = Descripcion;
    }

    public double getCantidad() 
    {
        return Cantidad;
    }

    public void setCantidad(double Cantidad) 
    {
        this.Cantidad = Cantidad;
    }
    
    
    
}
