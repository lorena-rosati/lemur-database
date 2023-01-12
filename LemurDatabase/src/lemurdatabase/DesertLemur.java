package lemurdatabase;

public class DesertLemur extends Lemur{
    
    private double babyDeathRate = 0.67;
    private String food = "Water from cacti";
    private String colour = "white";

    public DesertLemur(int age, int weight, String gender) {
        super(age, weight, gender);
    }
    
    @Override
    public String toString() {
        super.toString();
        return "DesertLemur{" + "age=" + age + ", weight=" + weight + ", gender=" + gender + ", classification=" + classification + ", coat=" + coat + ", location=" + location  + ", dominant gender= "+ dominantGender +", babyDeathRate=" + babyDeathRate + ", food=" + food + ", colour=" + colour + '}';
    }
    
    
    
}
