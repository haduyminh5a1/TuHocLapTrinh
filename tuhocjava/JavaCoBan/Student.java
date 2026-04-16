public class Student {
    private String id;
    private String name;
    private double score;
    public static int instanceCount = 0;
    //Constructors
    public Student(){
    }
    public Student(String id, String name, double score){
        this.id = id;
        this.name = name;
        this.score = score;
    }
    //Methods
    public void setID(String newID){
        id = newID;
    }
    public void setName(String newName){
        name = newName;
    }
    public void setScore(float newScore){
        score = newScore;
    }
    public String getID(){
        instanceCount++;
        return id;
    }
    public String getName(){
        return name;
    }
    public double getScore(){
        return score;
    }
    public String getRank(){
        String rank;
        if (score>=8.5) rank = "gioi";
        else if (score>=7) rank = "kha";
        else if (score>=5) rank = "trung binh";
        else rank = "yeu";
        
        return rank;
    }
}
