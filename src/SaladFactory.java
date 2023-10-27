public class SaladFactory implements DishFactory {
    @Override
    public Dish createDish() {
        return new Salad();
    }
}
