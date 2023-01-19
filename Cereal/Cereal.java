package Cereal;

public class Cereal {
    
    String cerealName;
    String utensil;
    int votes;

    public Cereal(String n, String u, int v){
        cerealName = n;
        utensil = u;
        votes = v;
    }

    public String getName(){
        return cerealName;
    }

    public String getUtensil(){
        return utensil;
    }

    public int getVotes(){
        return votes;
    }

}
