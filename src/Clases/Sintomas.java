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
public class Sintomas 
{
    private int idSintoma;
    private String Nombre;
    private String Descripcion;
    private String medicamento;

    public Sintomas() 
    {
    }

    public Sintomas(int idSintoma, String Nombre, String Descripcion, String medicamento) 
    {
        this.idSintoma = idSintoma;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.medicamento = medicamento;
    }

    public int getIdSintoma() 
    {
        return idSintoma;
    }

    public void setIdSintoma(int idSintoma) 
    {
        this.idSintoma = idSintoma;
    }

    public String getNombre() 
    {
        return Nombre;
    }

    public void setNombre(String Nombre) 
    {
        this.Nombre = Nombre;
    }

    public String getDescripcion() 
    {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) 
    {
        this.Descripcion = Descripcion;
    }

    public String getMedicamento() 
    {
        return medicamento;
    }

    public void setMedicamento(String medicamento) 
    {
        this.medicamento = medicamento;
    }
    
    
}
