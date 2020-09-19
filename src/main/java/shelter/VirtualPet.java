package shelter;

public class VirtualPet {

    private String petName;
    private String petDescription;
    private int balance;
    private int hungerLevel;
    private int thirstLevel;
    private int playLevel;

    public String getPetName() {
        return petName;
    }
    public String getPetDescription(){
        return petDescription;
    }
    public int getBalance() {
        return balance;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }
    public int getThirstLevel() {
        return thirstLevel;
    }
    public int getPlayLevel() {
        return playLevel;
    }

    public void withdrawal(int amountToWithdrawal) {
        balance -=amountToWithdrawal;
    }
    public void deposit(int amountToDeposit) {
        balance +=balance;
    }
    public void eat(){
        hungerLevel -= 10;
    }
    public void drink(){
        thirstLevel -= 10;
    }
    public void play(){
        thirstLevel -= 10;
    }
    public void tick(){
        hungerLevel -= 5;
        thirstLevel -= 7;
        playLevel -= 8;
    }
    public VirtualPet(String petName, String petDescription, int hungerLevel, int thirstLevel, int playLevel) {
        this.petName = petName;
        this.petDescription = petDescription;
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.playLevel = playLevel;
    }
}

