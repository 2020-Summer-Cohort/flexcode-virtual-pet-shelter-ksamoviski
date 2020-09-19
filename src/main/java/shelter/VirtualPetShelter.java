package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    Map<String, VirtualPet> pets = new HashMap<>();

    public void add(VirtualPet petToAdd) {
        pets.put(petToAdd.getPetName(), petToAdd);
    }
    public VirtualPet findPet(String petName) {
        return pets.get(petName);
    }
    public Collection<VirtualPet> getAllPets() {
        return pets.values();
    }

    public void close(VirtualPet pet) {
        pets.remove(pet.getPetName(), pet);
    }
    public void withdrawal(String petName, int amountToWithdrawal) {
        VirtualPet withdrawalFromPet = findPet(petName);
        withdrawalFromPet.withdrawal(amountToWithdrawal);
    }
    public void deposit(String petName, int amountToDeposit) {
        VirtualPet depositToPet = findPet(petName);
        depositToPet.deposit(amountToDeposit);
    }
    public void showPets() {
        for(VirtualPet pet: pets.values()) {
            System.out.println(pet.getPetName() + ": " + pet.getPetDescription() + " "
                    + System.lineSeparator()
                    + "Hunger = " + pet.getHungerLevel()
                    + System.lineSeparator()
                    + "Thirst = " + pet.getThirstLevel()
                    + System.lineSeparator()
                    + "Energy = " + pet.getPlayLevel()
                    + System.lineSeparator());
        }
    }
}
