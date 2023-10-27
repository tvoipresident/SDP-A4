import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OrderSystem orderSystem = new OrderSystem();

        // Register observers
        Observer kitchenStaff = new KitchenStaff();
        Observer waiter = new Waiter();
        orderSystem.addObserver(kitchenStaff);
        orderSystem.addObserver(waiter);

        while (true) {
            System.out.println("MENU:");
            System.out.println("1. Order Pasta");
            System.out.println("2. Order Salad");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            DishFactory dishFactory = null;
            switch (choice) {
                case 1:
                    dishFactory = new PastaFactory();
                    break;
                case 2:
                    dishFactory = new SaladFactory();
                    break;
                case 3:
                    System.out.println("Goodbye");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }

            Dish dish = dishFactory.createDish();
            orderSystem.placeOrder(dish.getClass().getSimpleName());
            dish.prepare();
        }
    }
}
