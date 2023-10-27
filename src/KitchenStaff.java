public class KitchenStaff implements Observer {
    @Override
    public void update(String order) {
        System.out.println("Kitchen Staff: Preparing " + order);
    }
}
