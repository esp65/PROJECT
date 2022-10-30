/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author USUARIO
 */
public class VendedorDTO {
     private int id_vendedor;
    private String nombre;
    private String password;

    public VendedorDTO() {
    }

    public VendedorDTO(int id_vendedor) {
        this.id_vendedor = id_vendedor;
    }
    
    public VendedorDTO(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
    }
    
    public VendedorDTO(int id_vendedor, String nombre, String password) {
        this.id_vendedor = id_vendedor;
        this.nombre = nombre;
        this.password = password;
    }
    

    public int getId_vendedor() {
        return id_vendedor;
    }

    public void setId_vendedor(int id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "id_vendedor=" + id_vendedor + ", nombre=" + nombre + ", password=" + password + '}';
    }
    
}
