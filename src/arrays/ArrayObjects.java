package arrays;



public class ArrayObjects {

    public Student[] createArrayOfStudents(){
        Student s1 = new Student();
        s1.rollNo = 100;
        s1.name="abc";
        s1.marks = 10;

        Student s2 = new Student();
        s2.rollNo = 20;
        s2.name = "xyz";
        s2.marks = 30;

        Student[] students = new Student[2];
        students[0] = s1;
        students[1]= s2;

        return students;
    }

    public void displayArrayOfStudents(Student[] arrayOfStudents){
        System.out.println("displaying students using for loop");
        for (int i=0; i < arrayOfStudents.length; i++){
            System.out.println(arrayOfStudents[i].rollNo + " : "+arrayOfStudents[i].name);
        }
    }

    public void displayArrayOfStudentsWithEnhancedForLoop(Student[] arrayOfStudents){
        System.out.println("display student using enhanced for loop");
        for(Student arrayOfStudent : arrayOfStudents){
            System.out.println(arrayOfStudent.rollNo+" : "+ arrayOfStudent.name);
        }
    }
}
