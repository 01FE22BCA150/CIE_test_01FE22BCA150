public class StudentCourse {
    private String[] course = {"c#","dev-ops","machine learning","software-testing"};
    private int[] marks = {96,97,98,99};

    public void displayStudentCourse(){
        for(int i =0 ;i<course.length ;i++){
            System.out.println(course[i] + "\t\t\t");
    
    }

}
public void displayStudentMarks(){
    for(int i =0 ;i<course.length ;i++){
        System.out.println(course[i]+":"+marks[i]);

}
}
}
