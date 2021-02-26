package com.example.regristro.utilidades;


public class utilidades{

    public static  final String TABLA_USUARIO="usuario";
    public static final String CAMPO_NOMBRE="nombre";
    public static final String CAMPO_CORREO = "correo";
    private static final String CORREO_CORREO ="correo" ;
    public static final String CAMPO_NUMERO ="numero";


    public static final  String CREAR_TABLA_USUARIO ="CREATE TABLE  "+TABLA_USUARIO+" ("+CAMPO_NOMBRE+" INTEGER,"+CORREO_CORREO+" TEXT,"+CAMPO_NUMERO+" TEXT)";
}