package lemurdatabase;

public class TreeLemur extends Lemur{
    
    private String food = "fruit";
    private String colour = "red";
    private String packSize = "large";

    public TreeLemur(int age, int weight, String gender) {
        super(age, weight, gender);
    }


    @Override
    public String toString() {
        super.toString();
        return "TreeLemur{" + "age=" + age + ", weight=" + weight + ", gender=" + gender + ", classification=" + classification + ", coat=" + coat + ", location=" + location  + ", dominant gender= "+ dominantGender+ "food=" + food + ", colour=" + colour + ", packSize=" + packSize + '}';
    }
    
    
    
}
