public class Waiter implements Observer {
    @Override
    public void update(String order) {
        System.out.println("Waiter: Serving " + order);
    }
}
