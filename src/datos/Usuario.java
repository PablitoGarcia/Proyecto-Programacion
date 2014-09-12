/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datos;

import java.io.Serializable;


/**
 *
 * @author santi
 */
public class Usuario implements Serializable {
    private String nombre;
    private String apellido;
    private String Direccion;
    private int telefono;
    private int dni;
    private String email;
    private int telAl;
    private int edad;
    private int nivel;
    private int diasSemana;
    private String fechaIngreso;
    private int clave;

    
     public Usuario() {
    }

    public Usuario(String nombre, String apellido, String Direccion, int telefono, int dni, String email, int telAl, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Direccion = Direccion;
        this.telefono = telefono;
        this.dni = dni;
        this.email = email;
        this.telAl = telAl;
        this.edad = edad;
        
        
       
       
        
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

   
    
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getDiasSemana() {
        return diasSemana;
    }

    public void setDiasSemana(int diasSemana) {
        this.diasSemana = diasSemana;
    }
    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", Direccion=" + Direccion + ", telefono=" + telefono + ", dni=" + dni + ", email=" + email + ", telAl=" + telAl + ", edad=" + edad +" clave "+clave+ '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelAl() {
        return telAl;
    }

    public void setTelAl(int telAl) {
        this.telAl = telAl;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getNivelSelec(){
        String niv="";
        if (nivel==1){
            niv+= "Principiante";}
        else{
            niv += "Profesional";}
        return niv;
    }
    
    
    public String getDiasSem(){
        String dias = "";
        switch(this.diasSemana){
            case 1:
                dias = "2 veces";
                break;
            case 2:
                dias = "3 veces";
                break;
            case 3:
                dias = "Pase Libre";
                break;
            default:
                dias = "No Definido";
                break;
        }
        return dias;
    
}
}


    


