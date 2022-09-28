public class Friend {
    //Instansvariabler
    //Instance variables
    private String name = "A friend";
    private int hp = 100;
    private boolean isFriend = true;

    public Friend(){

    }

    public Friend(String name){
        this.name= name;
    }
    public Friend (String name, boolean isFriend){
        this.name= name;
        this.isFriend=isFriend;
    }

    public void hit(int damage){
        this.hp= this.hp- damage;

    }


    // Getters Setters
    public int getHp(){
        return this.hp;
    }
    public void setHp(int hp){
        this.hp= hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFriend() {
        return isFriend;
    }

    public void setFriend(boolean friend) {
        isFriend = friend;
    }
}
