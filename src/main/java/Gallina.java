public class Gallina extends Ave implements Volar{
    @Override
    public void makeSound() {
        System.out.println("Grasna");
    }
    public void vuela() {
        System.out.println("No vuela");
    }
}
