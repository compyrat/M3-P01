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
public class SalaRepetida extends Exception {

    /**
     * Creates a new instance of <code>SalaRepetida</code> without detail
     * message.
     */
    public SalaRepetida() {
    }

    /**
     * Constructs an instance of <code>SalaRepetida</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public SalaRepetida(String msg) {
        super(msg);
    }
}
