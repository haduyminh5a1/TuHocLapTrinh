package JavaCoBan.Baitaptrenlop.Baionline;

public class CourseGrades {
    private GradedActivity[] grades;

    public CourseGrades() {
        grades = new GradedActivity[4];
    }

    public void setLab(GradedActivity lab){
        grades[0] = lab;
    }

    public void setPassFailExam(PassFailExam exam){
        grades[1] = exam;
    }

    public void setEssay(GradedActivity essay){
        grades[2] = essay;
    }

    public void setFinalExam(FinalExam finalExam){
        grades[3] = finalExam;
    }

    @Override
    public String toString() {
        String result = "";
        String[] scoresList = {"Lab score: ", "Pass/Fail exam score: ", "Essay score: ", "Final exam score: "};
        for (int i=0;i<grades.length;i++){
            result += scoresList[i];
            if (grades[i] != null){
                result += grades[i].getScore() + " | Grades: " + grades[i].getGrade() + "\n";
            }
            else {
                result += "No scores input\n";
            }
        }
        return result;
    }

    
}
