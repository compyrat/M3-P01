/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author albertmarnun
 */
public class noNumeric extends Exception {

    /**
     * Creates a new instance of <code>noNumeric</code> without detail message.
     */
    public noNumeric() {
    }

    /**
     * Constructs an instance of <code>noNumeric</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public noNumeric(String msg) {
        super(msg);
    }
}
