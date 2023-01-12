package lemurdatabase;

public class Lemur extends Mammal{
    
    int age;
    int weight;
    String gender;
    String classification = "Prosimians";
    String coat = "Fur";
    String location = "Madagascar";
    String dominantGender = "Female";

    public Lemur(int age, int weight, String gender) {
        this.age = age;
        this.weight = weight;
        this.gender = gender;
    }

    

    
}
