public class Student {
    private String id;
    private String name;
    private float score;
    //Constructors
    public Student(){
    }
    public Student(String id, String name, float score){
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
        return id;
    }
    public String getName(){
        return name;
    }
    public float getScore(){
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
