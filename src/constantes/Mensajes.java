package constantes;

public enum Mensajes {

    MENSAJE_NOMBRE("Ingrese su nombre: "),
    MENSAJE_SALARIO("Ingrese su salario: "),
    MENSAJE_EMPLEADO("Empleado: "),
    MENSAJE_COMPLEMENTO("Salario: $"),
    MENSAJE_SALUD("Descuento de salud: $"),
    MENSAJE_PENSION("Descuento de pension: $"),
    MENSAJE_TOTAL("Su salario final: $"),
    MENSAJE_SALTO_LINEA("\n");



    private String mensaje;

    Mensajes(String n) {
        this.mensaje = n;
    }

    public String getMensaje() {
        return mensaje;
    }
}
