import BuilderDesignModule.Director;
import BuilderDesignModule.EngineeringStudentBuilder;
import BuilderDesignModule.MBAStudentBuilder;
import BuilderDesignModule.Student;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Student engineer = new Director(new EngineeringStudentBuilder()).createStudent();
        Student mba = new Director(new MBAStudentBuilder()).createStudent();

        System.out.println(engineer.toString());
        System.out.println(mba.toString());
    }
}