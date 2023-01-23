package Cereal;

public class Main {
    
    public static void main(String[] args){
        
        Cereal cereal1 = new Cereal("Apple Jacks", 125, 33.174);
        Cereal cereal2 = new Cereal("Cheerios", 290, 50.764);
        Cereal cereal3 = new Cereal("Cinnamon Toast Crunch", 210, 19.826);

        double cereal1Score = (cereal1.getSodium()) / (cereal1.getRating());
        double cereal2Score = (cereal2.getSodium()) / (cereal2.getRating());
        double cereal3Score = (cereal3.getSodium()) / (cereal3.getRating());

        System.out.println(cereal1Score);
        System.out.println(cereal2Score);
        System.out.println(cereal3Score);
    }
}
