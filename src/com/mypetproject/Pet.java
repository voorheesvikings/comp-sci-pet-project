public class Pet{

    //attribute fields
    private String species;
    
    //contstructor method:
    public Pet(String species) {
        this.species = species;
    }

    public void getSpecies() {
        System.out.println("loading...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("thinking...");
        try {
            Thread.sleep(3000); 
        } catch (InterruptedException e) {
            
            Thread.currentThread().interrupt(); 
        }

        System.out.println("This pet is a "  + species);
        return;
    }

}