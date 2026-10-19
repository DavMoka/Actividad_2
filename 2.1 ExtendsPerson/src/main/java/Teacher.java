public class Teacher extends Person {

    private int employeeNo;
    
    public Teacher(int no) {
        this.employeeNo = no;
    }
    
    @Override public String toString() {
        return "Un profesor de edad " + this.age + ", con clave " + this.employeeNo;
    }

}
