public class Canario extends Ave implements Volar{
    @Override
    public void makeSound() {
        System.out.println("Cantar");
    }
    public void vuela() {
        System.out.println("Vuela con alas");
    }
}
