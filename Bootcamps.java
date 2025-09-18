class Bootcamps {
    String mensaje;

    public Bootcamps(String mensaje) {
        this.mensaje = mensaje;
    }

    public static void main(String[] args){
    Bootcamps curso = new Bootcamps("Modulo sql");
    System.out.println(curso.mensaje);
}

}

