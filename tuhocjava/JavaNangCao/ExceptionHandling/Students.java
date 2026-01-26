public class Students {
    private String id;
    private String name;
    private double score;
    private int age;
    //Constructors
    public Students(){
        
    }
    
    public Students(String id, String name, double score, int age){
        this.id = id;
        this.name = name;
        this.score = score;
        this.age = age;
    }

    //Getters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getScore() {
        return score;
    }

    //Setters
    public void setScore(double score) {
        this.score = score;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Students [id=" + id + ", name=" + name + ", score=" + score + ", age=" + age + "]";
    }

}
