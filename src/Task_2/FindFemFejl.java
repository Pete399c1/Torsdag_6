package Task_2;

public class FindFemFejl {

    public static void main(String[] args) {
        Cinema bioGrande = new Cinema(20, 10);

        // Reserver række 1, sæde 5
        System.out.println("Række 1, sæde 5 er reserveret: " + bioGrande.reserve(1, 5));

        // Print hele salen pænt
        System.out.println(bioGrande);

        // Reserver det sidste sæde i den sidste række
        int numberOfRows = bioGrande.getRows();
        int numberOfSeats = bioGrande.getSeats();
         bioGrande.reserve(numberOfRows, numberOfSeats);

        // Afbestil reservation på række 1, sæde 5
        System.out.println("Række 1, sæde 5 er afbestilt: " + bioGrande.cancelReservation(1, 5));
    }
}
