public class Docente extends Persona {
    public String facultad;
    public int horasClases;

    public Docente(String cedula, String nombre, String direccion, String correo, String telefono, String facultad, int horasClases) {
        super(cedula, nombre, direccion, correo, telefono);
        this.facultad = facultad;
        this.horasClases = horasClases;
    }

    @Override
    public void mostrarInformacionPersonal() {
        super.mostrarInformacionPersonal();
        System.out.println("Facultad: " + facultad);
        System.out.println("Horas de clase: " + horasClases);
    }
}
