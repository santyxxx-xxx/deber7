public class Virtual extends Estudiante{
    public String plataforma;
    public String tutor;

    public Virtual (String cedula, String nombre, String direccion, String correo, String telefono,
                    String carrera, String nivel, String plataforma, String tutor) {
        super(cedula, nombre, direccion, correo, telefono, carrera, nivel);
        this.plataforma=plataforma;
        this.tutor=tutor;

    }

    @Override
    public void mostrarInformacionPersonal() {
        super.mostrarInformacionPersonal();
        System.out.println("Plataforma: "+plataforma);
        System.out.println("Tutor: "+tutor);
    }
}
