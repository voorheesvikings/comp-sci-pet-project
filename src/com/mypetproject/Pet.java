public class Pet{

    //attribute fields
    private String species;
    
    //contstructor method:
    public Pet(String species) {
        this.species = species;
    }

    public void getSpecies() {
        System.out.println("This pet is a "  + species);
        return;
    }

}