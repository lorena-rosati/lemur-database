package lemurdatabase;

public class JungleLemur extends Lemur{
    
    private String food = "mice, snails, and insects";
    private String colour = "black or blue";
    private String packSize = "small";
    private boolean hasMane = false;

    public JungleLemur(int age, int weight, String gender) {
        super(age, weight, gender);
    }
    

    @Override
    public String toString() {
        super.toString();
        return "JungleLemur{" + "age=" + age + ", weight=" + weight + ", gender=" + gender + ", classification=" + classification + ", coat=" + coat + ", location=" + location  + ", dominant gender= "+ dominantGender + "food=" + food + ", colour=" + colour + ", packSize=" + packSize + ", hasMane=" + hasMane + '}';
    }
    
}
