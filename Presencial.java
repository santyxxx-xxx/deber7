public class Presencial extends Estudiante {
    public String hora;
    public String horario;

    public Presencial(String cedula, String nombre, String direccion, String correo, String telefono,
                      String carrera, String nivel, String hora, String horario) {
        super(cedula, nombre, direccion, correo, telefono, carrera, nivel);
        this.hora = hora;
        this.horario = horario;
    }

    @Override
    public void mostrarInformacionPersonal() {
        super.mostrarInformacionPersonal();
        System.out.println("Hora: " + hora);
        System.out.println("Horario: " + horario);
    }
}
