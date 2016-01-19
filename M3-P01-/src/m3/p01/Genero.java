/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m3.p01;

/**
 *
 * @author albertribgar
 */
public enum Genero {
    COMEDIA, ACCION, TERROR, CIENCIA_FICCION;
    @Override
    public String toString(){
        StringBuilder sb= new StringBuilder();
        switch(this){
            case COMEDIA: sb.append("Comedia");
                break;
            case ACCION: sb.append("Acción");
                break;
            case TERROR: sb.append("Terror");
                break;
            case CIENCIA_FICCION: sb.append("Ciencia Ficción");
                break;
            default:break;
        }
        return sb.toString();
    }
    {}
}
