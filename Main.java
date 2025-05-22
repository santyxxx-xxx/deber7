public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante(
                "1754768990", "Andres Panchi", "Av. Siempre Viva", "andres@gmail.com", "0999999999", "Software", "3ro"
        );

        Docente docente = new Docente(
                "515151851", "Santy", "Calle Falsa 123", "santy@gmail.com", "099111222", "FISEI", 10
        );

        Presencial presencial = new Presencial(
                "1234567890", "Ana Pérez", "Av. Colón", "ana@gmail.com", "0988888888", "Ingeniería", "Segundo", "15:00", "Lunes a Viernes"
        );

        System.out.println("---------Estudiante:-------------");
        estudiante.mostrarInformacionPersonal();

        System.out.println("----------Docente:----------");
        docente.mostrarInformacionPersonal();

        System.out.println("----------Estudiante Presencial:------------");
        presencial.mostrarInformacionPersonal();
    }
}

