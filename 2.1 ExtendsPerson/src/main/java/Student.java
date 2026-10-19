public class Student extends Person {

    public Student() {
        System.out.println("Instancia de Student creada.");
    }
    
    @Override public String toString() {
        return "Un alumno llamado: " + this.name;
    }

}
