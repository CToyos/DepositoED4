/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentas;

/**
 * CCuenta es la clase cuenta.
 * @author Carlos Toyos
 */
public class CCuenta {

    /**
     * @return Devuelve el nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre Fija el nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return Devuelve la cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta Fija la cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return Devuelve el saldo,
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo Fija el saldo.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return Devuelve el tipo de interés.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés Fija el tipo de interés.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

//Atributos
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Objeto cuenta bancaria. COnstructor 1.
     */
    public CCuenta()
    {
    }

    /**
     * Constructor 2.
     * @param nom Nombre
     * @param cue Cuenta
     * @param sal Saldo
     * @param tipo Tipo de Interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     *
     * @return Devuelve el saldo actualizado.
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método ingresar Permite ingresar dinero a la cuenta.
     * @param cantidad dinero del usuario.
     * @throws Exception Lanza excepción si el ingreso es negativo.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método retirar Permite sacar dinero de la cuenta.
     * @param cantidad dinero solicitado por el usuario.
     * @throws Exception Lanza excepción si la cantidad a retirar es negativa o no hay saldo suficiente.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
