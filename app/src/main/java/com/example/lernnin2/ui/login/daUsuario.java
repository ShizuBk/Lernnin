package com.example.lernnin2.ui.login;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class daUsuario {
    Context c;
    Usuario user;
    ArrayList<Usuario> lista;
    SQLiteDatabase sql;
    String bd="Lernnin";
    String tabla="create table if not exists usuarios(id integer primary key autoincrement, nombre text, edad integer, sexo text, email text, pass text)";

    public daUsuario(Context c){
        this.c=c;
        sql=c.openOrCreateDatabase(bd,c.MODE_PRIVATE, null);
        sql.execSQL(tabla);
        user=new Usuario();
    }

    public boolean insertUsuario(Usuario user){
        if(buscar(user.getEmail())==0) {
            ContentValues cv = new ContentValues();
            cv.put("nombre", user.getNombre());
            cv.put("edad", user.getEdad());
            cv.put("sexo", user.getSexo());
            cv.put("email", user.getEmail());
            cv.put("pass", user.getPass());
            return (sql.insert("usuarios", null, cv)>0);
        }else{
            return false;
        }
    }

    public int buscar(String user){
        int x=0;
        lista=selectUser();
        for(Usuario us:lista){
            if(us.getEmail().equals(user)){
                x++;
            }
        }
        return x;
    }

    public ArrayList<Usuario> selectUser(){
        ArrayList<Usuario> lista=new ArrayList<Usuario>();
        lista.clear();
        Cursor cr=sql.rawQuery("select * from usuarios",null);
        if(cr!=null&&cr.moveToFirst()){
            do{
                Usuario u=new Usuario();
                u.setID(cr.getInt(0));
                u.setNombre(cr.getString(1));
                u.setEdad(cr.getInt(2));
                u.setSexo(cr.getString(3));
                u.setEmail(cr.getString(4));
                u.setPass(cr.getString(5));
                lista.add(u);
            }while(cr.moveToNext());
        }
        return lista;
    }

    public int login(String user, String pass){
        int a=0;
        Cursor cr=sql.rawQuery("select * from usuarios",null);
        if(cr!=null&&cr.moveToFirst()){
            do{
                if(cr.getString(4).equals(user)&&cr.getString(5).equals(pass)){
                    a++;
                }
            }while(cr.moveToNext());
        }
        return a;
    }

    public Usuario getUser(String user, String pass){
        lista=selectUser();
        for(Usuario u:lista){
            if(u.getEmail().equals(user)&&u.getPass().equals(pass)){
                return u;
            }
        }
        return null;
    }

    public Usuario buscarUsuario(String email){
        Cursor cr=sql.rawQuery("select * from usuarios where email='"+email+"'",null);
        Usuario u=new Usuario();
        u.setID(cr.getInt(0));
        u.setNombre(cr.getString(1));
        u.setEdad(cr.getInt(2));
        u.setSexo(cr.getString(3));
        u.setEmail(cr.getString(4));
        u.setPass(cr.getString(5));

        return u;
    }

}

