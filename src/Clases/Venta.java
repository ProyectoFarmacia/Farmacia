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
public class Venta 
{
    private int idVenta;
    private String Fecha;
    private int Cantidad;
    private double Subtotal;
    private double IVA;
    private double Total;

    public Venta() 
    {
    }

    public Venta(int idVenta, String Fecha, int Cantidad, double Subtotal, double IVA, double Total) 
    {
        this.idVenta = idVenta;
        this.Fecha = Fecha;
        this.Cantidad = Cantidad;
        this.Subtotal = Subtotal;
        this.IVA = IVA;
        this.Total = Total;
    }

    public int getIdVenta() 
    {
        return idVenta;
    }

    public void setIdVenta(int idVenta) 
    {
        this.idVenta = idVenta;
    }

    public String getFecha() 
    {
        return Fecha;
    }

    public void setFecha(String Fecha) 
    {
        this.Fecha = Fecha;
    }

    public int getCantidad() 
    {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) 
    {
        this.Cantidad = Cantidad;
    }

    public double getSubtotal() 
    {
        return Subtotal;
    }

    public void setSubtotal(double Subtotal) 
    {
        this.Subtotal = Subtotal;
    }

    public double getIVA() 
    {
        return IVA;
    }

    public void setIVA(double IVA) 
    {
        this.IVA = IVA;
    }

    public double getTotal() 
    {
        return Total;
    }

    public void setTotal(double Total) 
    {
        this.Total = Total;
    }
    
    
    
}
