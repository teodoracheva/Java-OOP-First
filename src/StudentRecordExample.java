import java.util.Scanner;

public class StudentRecordExample {
    public static void main(String[] args){
        //System.out.println("Solution without array...");
        //solutionWithoutArray();

        //System.out.println("");

        System.out.println("Solution with array");
        solutionWithArray();
    }

    public static void solutionWithoutArray() {
        Scanner s = new Scanner(System.in);

        StudentRecord student1 = new StudentRecord();

        System.out.println("Student 1 name: ");
        String name = s.nextLine();
        student1.setName(name);


        System.out.println("Student 1 Faculty number: ");
        String facultyNumber = s.nextLine();
        student1.setfacultyNumber(facultyNumber);

        System.out.println("Student 1 Math grade: ");
        double mathGrade = Double.parseDouble(s.nextLine());
        student1.setMathGrade(mathGrade);

        System.out.println("Student 1 Informatics grade: ");
        double informaticsGrade = Double.parseDouble(s.nextLine());
        student1.setInformaticsGrade(informaticsGrade);


        StudentRecord student2 = new StudentRecord();

        System.out.println("Student 2 name: ");
        name = s.nextLine();
        student2.setName(name);

        System.out.println("Student 2 Faculty number: ");
        facultyNumber = s.nextLine();
        student2.setfacultyNumber(facultyNumber);

        System.out.println("Student 2 Math grade: ");
        mathGrade = Double.parseDouble(s.nextLine());
        student2.setMathGrade(mathGrade);

        System.out.println("Student 2 Informatics grade: ");
        informaticsGrade = Double.parseDouble(s.nextLine());
        student2.setInformaticsGrade(informaticsGrade);

        StudentRecord student3 = new StudentRecord();

        System.out.println("Student 3 name: ");
        name = s.nextLine();
        student3.setName(name);

        System.out.println("Student 3 Faculty number: ");
        facultyNumber = s.nextLine();
        student3.setfacultyNumber(facultyNumber);

        System.out.println("Student 3 Math grade: ");
        mathGrade = Double.parseDouble(s.nextLine());
        student3.setMathGrade(mathGrade);

        System.out.println("Student 3 Informatics grade: ");
        informaticsGrade = Double.parseDouble(s.nextLine());
        student3.setInformaticsGrade(informaticsGrade);

        System.out.println("");

        System.out.println("Student 1: Name = " + student1.getName() + ", FN = " + student1.getfacultyNumber() + ", Average = " + student1.getAverage());
        System.out.println("Student 2: Name = " + student2.getName() + ", FN = " + student2.getfacultyNumber() + ", Average = " + student2.getAverage());
        System.out.println("Student 3: Name = " + student3.getName() + ", FN = " + student3.getfacultyNumber() + ", Average = " + student3.getAverage());
    }

    public static void solutionWithArray(){
        Scanner s = new Scanner(System.in);

        StudentRecord[] students = new StudentRecord[3];

        for(int i = 0; i < students.length; i++){
            students[i] = new StudentRecord();
        }
        for(int i = 0; i < students.length; i++){
            System.out.println("Student" + (i + 1) + ":");
            System.out.print("Name:");
            students[i].setName(s.nextLine());
            System.out.print("Faculty number:");
            students[i].setfacultyNumber(s.nextLine());
            System.out.print("Math grade:");
            students[i].setMathGrade(Double.parseDouble(s.nextLine()));
            System.out.println("Informatics grade:");
            students[i].setInformaticsGrade(Integer.parseInt(s.nextLine()));
        }
        System.out.println("");

        for(int i = 0; i < students.length; i++){
            System.out.println("Student " + (i + 1) + ": Name =" + students[i].getName() + ", FN =" + students[i].getfacultyNumber() + ", Average = " + students[i].getAverage());
        }
    }
}
