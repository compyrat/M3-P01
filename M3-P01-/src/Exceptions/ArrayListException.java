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
public class ArrayListException extends Exception {

    /**
     * Creates a new instance of <code>ArrayListException</code> without detail
     * message.
     */
    public ArrayListException() {
    }

    /**
     * Constructs an instance of <code>ArrayListException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ArrayListException(String msg) {
        super(msg);
    }
}
