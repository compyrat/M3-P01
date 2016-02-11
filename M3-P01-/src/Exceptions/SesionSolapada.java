/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author albertribgar
 */
public class SesionSolapada extends Exception {

    /**
     * Creates a new instance of <code>SesionSolapada</code> without detail
     * message.
     */
    public SesionSolapada() {
    }

    /**
     * Constructs an instance of <code>SesionSolapada</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public SesionSolapada(String msg) {
        super(msg);
    }
}
