public class StudentRecord {

    private String name;
    private String facultyNumber;
    private double mathGrade;
    private double informaticsGrade;


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getfacultyNumber(){
        return facultyNumber;
    }
    public void setfacultyNumber(String facultyNumber){
        this.facultyNumber = facultyNumber;
    }

    public double getMathGrade(){
        return mathGrade;
    }
    public void setMathGrade(double mathGrade){
        this.mathGrade = mathGrade;
    }

    public double getInformaticsGrade(){
        return informaticsGrade;
    }
    public void setInformaticsGrade(double informaticsGrade){
        this.informaticsGrade = informaticsGrade;
    }


    public double getAverage(){
        double result = 0;
        result = (mathGrade + informaticsGrade) / 2;
        return result;
    }
}
