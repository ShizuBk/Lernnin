package com.example.lernnin2.ui.login;

public class Usuario {
    private int ID, Edad;
    private String Nombre, Sexo, Email, Pass;

    public Usuario() {
    }

    public Usuario(int edad, String nombre, String sexo, String email, String pass) {
        Edad = edad;
        Nombre = nombre;
        Sexo = sexo;
        Email = email;
        Pass = pass;
    }

    public boolean isNull(){
        if(Nombre.equals("")&&Sexo.equals("")&&Email.equals("")&&Pass.equals("")){
            return false;
        }else{
            return true;
        }

    }

    @Override
    public String toString() {
        return "Usuario{" +
                "ID=" + ID +
                ", Edad=" + Edad +
                ", Nombre='" + Nombre + '\'' +
                ", Sexo='" + Sexo + '\'' +
                ", Email='" + Email + '\'' +
                ", Pass='" + Pass + '\'' +
                '}';
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String pass) {
        Pass = pass;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}

