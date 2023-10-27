public class PastaFactory implements DishFactory {
    @Override
    public Dish createDish() {
        return new Pasta();
    }
}
