import java.util.ArrayList;
import java.util.Scanner;

class MenuItem {
    private String name;
    private int price;

    public MenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - Rp" + String.format("%,d", price);
    }
}
total = sum(item.price * quantity for item, quantity in self.items)
class Order {
    private ArrayList<OrderItem> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(MenuItem menuItem, int quantity) {
        items.add(new OrderItem(menuItem, quantity));
    }

    public int calculateTotal() {
        int total = 0;
        for (OrderItem item : items) {
            total += item.getMenuItem().getPrice() * item.getQuantity();
        }
        return total;
    }

    public void printReceipt() {
        System.out.println("\n=== Nota Pemesanan ===");
        for (OrderItem item : items) {
            System.out.printf("%s (x%d) - Rp%,d\n",
                    item.getMenuItem().getName(),
                    item.getQuantity(),
                    item.getMenuItem().getPrice() * item.getQuantity());
        }
        System.out.println("========================");
        System.out.printf("Total: Rp%,d\n\n", calculateTotal());
    }

    private static class OrderItem {
        private MenuItem menuItem;
        private int quantity;

        public OrderItem(MenuItem menuItem, int quantity) {
            this.menuItem = menuItem;
            this.quantity = quantity;
        }

        public MenuItem getMenuItem() {
            return menuItem;
        }

        public int getQuantity() {
            return quantity;
        }
    }
}

public class RestaurantOrderApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MenuItem[] menu = {
                new MenuItem("Nasi Goreng", 20000),
                new MenuItem("Mie Ayam", 15000),
                new MenuItem("Es Teh", 5000),
                new MenuItem("Ayam Bakar", 25000)
        };

        System.out.println("=== Menu Restoran ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }

        Order order = new Order();

        while (true) {
            try {
                System.out.print("\nPilih nomor menu (0 untuk selesai): ");
                int choice = scanner.nextInt();
                if (choice == 0) {
                    break;
                }
                if (choice >= 1 && choice <= menu.length) {
                    System.out.print("Masukkan jumlah: ");
                    int quantity = scanner.nextInt();
                    order.addItem(menu[choice - 1], quantity);
                } else {
                    System.out.println("Pilihan tidak valid, coba lagi.");
                }
            } catch (Exception e) {
                System.out.println("Input tidak valid, masukkan angka.");
                scanner.next(); // Clear invalid input
            }
        }

        if (order.calculateTotal() > 0) {
            order.printReceipt();
        } else {
            System.out.println("Tidak ada item yang dipesan.");
        }

        scanner.close();
    }
}
