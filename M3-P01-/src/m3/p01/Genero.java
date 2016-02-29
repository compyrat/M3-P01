package m3.p01;

public enum Genero {
    COMEDIA, ACCION, TERROR, CIENCIA_FICCION;
    @Override
    public String toString(){
        StringBuilder sb= new StringBuilder();
        switch(this){
            case COMEDIA: sb.append("Comedia");
                break;
            case ACCION: sb.append("Accion");
                break;
            case TERROR: sb.append("Terror");
                break;
            case CIENCIA_FICCION: sb.append("Ciencia Ficcion");
                break;
            default:break;
        }
        return sb.toString();
        //agregación/comp Cine-Película
        //agregación/composición Cine-Salas
        //agregacion/comp Sala-Sesiones
    }
}
