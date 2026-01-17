package LuyenThi;
public class Student1 {
    private String id;
    private String name;
    private double score;
    //Constructor
    public Student1() {
    }
    //Getters
    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public String getRank(){
        if (score >= 8.5) return "Gioi";
        else if (score >= 7.0) return "Kha";
        else if (score >= 5.0) return "Trung binh";
        else return "Yeu";
    }
    //Setters
    public void setID(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setScore(double score) {
        this.score = score;
    }
    
}
