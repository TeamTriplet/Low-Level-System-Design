package BuilderDesignModule;

public class Director {
    StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder){
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent(){
        if(studentBuilder instanceof EngineeringStudentBuilder){
            return createEngineeringStudentBuilder();
        } else {
            return createMBAStudentBuilder();
        }
    }

    private Student createEngineeringStudentBuilder(){
        return new EngineeringStudentBuilder().setName("Sudipta Dey").setAge(18).setFatherName("Subrata Dey").setSubjects().build();
    }

    private Student createMBAStudentBuilder(){
        return new MBAStudentBuilder().setName("Sudipta Dey").setAge(25).setMotherName("Chhabi Dey").setSubjects().build();
    }
}
