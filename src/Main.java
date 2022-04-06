// import java.util.Scanner;

public class Main {
    public static final String MSG_NAME = "Introdueix un nom: ";
    public static final String MSG_SURNAME = "Introdueix un cognom: ";
    // public static final String MSG_MATRICULA = "Introdueix una matricula: ";
    // public static final String MSG_COLOR = "Introdueix un color: ";
    // public static final String MSG_MODEL = "Introdueix un model: ";
    // public static final String MSG_DOORS = "Introdueix el numero de portes: ";

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        Student st = new Student("Pepito", "Perez", "123456789");
        Docent dc = new Docent("Juan", "Perez");
        st.breathe();
        dc.breathe();
        // Person alum = new Person();
        // System.out.println(MSG_NAME);
        // alum.setName(sc.nextLine());
        // System.out.println(MSG_SURNAME);
        // alum.setSurname(sc.nextLine());
        // System.out.println(alum.getName()+" "+alum.getSurname());

        // Coche coche = new Coche();
        // System.out.println(MSG_MATRICULA);
        // coche.setMatricula(sc.nextLine());
        // System.out.println(MSG_COLOR);
        // coche.setColor(sc.nextLine());
        // System.out.println(MSG_MODEL);
        // coche.setModel(sc.nextLine());
        // System.out.println(MSG_DOORS);
        // coche.setNumDoors(sc.nextInt());
        // System.out.println(coche.getMatricula()+" "+coche.getColor()+"
        // "+coche.getModel()+" "+coche.getNumDoors());

        // sc.close();
    }
}
