package arrays;

public class Main {
    public static void main(String[] args) {
        ArrayObjects arrayObjects = new ArrayObjects();
        Student[] students = arrayObjects.createArrayOfStudents();

        arrayObjects.displayArrayOfStudents(students);
        arrayObjects.displayArrayOfStudentsWithEnhancedForLoop(students);
    }
}
