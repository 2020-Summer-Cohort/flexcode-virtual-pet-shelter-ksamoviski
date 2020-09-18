package shelter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class VirtualPetShelterTest {

    VirtualPetShelter underTest;
    VirtualPet pet1;
    VirtualPet pet2;

    @BeforeEach
    public void setUp(){

        underTest = new VirtualPetShelter();
        VirtualPet pet1 = new VirtualPet("George", "Fluffy Orange Cat", 20, 20, 20);
        VirtualPet pet2 = new VirtualPet("Dot", "Sly Tabby Cat", 20, 20, 20);

    }

    @Test
    public void shouldBeAbleToAddAccount(){
        underTest.add(pet1);
        VirtualPet retrievedPet = underTest.findPet("1");
        assertEquals(retrievedPet, pet1);
    }

    @Test
    public void shouldBeAbleToAddTwoAccounts(){
        underTest.add(pet1);
        underTest.add(pet2);
        Collection<VirtualPet> allAccounts = underTest.getAllPets();
//        assertEquals(2, allAccounts.size());
        assertThat(allAccounts, containsInAnyOrder(pet1,pet2));
    }

    @Test
    public void shouldBeAbleToRemoveAnAccount(){
        underTest.add(pet1);
        underTest.close(pet1);
        VirtualPet retrievedPet = underTest.findPet("1");
        assertEquals(retrievedPet, null);
    }

    @Test
    public void shouldBeAbleToWithdrawalFromAccount(){
        underTest.add(pet1);
        underTest.withdrawal(pet1.getPetName(), 50);
        assertEquals(pet1.getBalance(), 50);
    }

    @Test
    public void shouldBeAbleToDepositToAccount(){
        underTest.add(pet1);
        underTest.deposit(pet1.getPetName(), 100);
        assertEquals(pet1.getBalance(), 200);
    }



}
