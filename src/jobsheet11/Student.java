package jobsheet11;

public class Student {
    String nim, name, studyProgram, className;
    

    public Student(String nim, String name, String studyProgram, String classname){
        this.nim = nim;
        this.name = name;
        this.studyProgram = studyProgram;
        this.className = classname;
    }

    void print(){
        System.out.println(nim+" - "+name+" - "+studyProgram+" - "+className);
    }


}
