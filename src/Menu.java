import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private String menuHeader;
    private String leadText;
    private ArrayList<String> menuItems = new ArrayList();
    private Scanner sc;

    public Menu(String menuHeader, String leadText, ArrayList<String> menuItems) {
        this.sc = new Scanner(System.in);
        this.menuHeader = menuHeader;
        this.leadText = leadText;
        this.menuItems = menuItems;
    }

    public void printMenu() {
        int menuSize = this.menuItems.size();
        System.out.println(this.menuHeader);

        for(int i = 0; i < menuSize; ++i) {
            System.out.println("  " + (i + 1) + ". " + (String)this.menuItems.get(i));
        }

        System.out.print(this.leadText);
    }

    public int readChoice() {
        try {
            int choseMenu = this.sc.nextInt();
            this.sc.nextLine();
            return choseMenu;
        } catch (Exception var2) {
            System.out.println(this.leadText);
            System.out.println(var2.getMessage());
            this.sc.next();
            return this.readChoice();
        }
    }
}
