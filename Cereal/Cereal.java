package Cereal;

public class Cereal {
    
    String cerealName;
    int sodium;
    double rating;

    public Cereal(String n, int s, double r){
        cerealName = n;
        sodium = s;
        rating = r;
    }

    public String getName(){
        return cerealName;
    }

    public int getSodium(){
        return sodium;
    }

    public double getRating(){
        return rating;
    }

}
