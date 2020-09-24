import java.util.Map;

public class AddressBook {
    private Map<String, BuddyInfo> book;

    public static void main(String[] arg){
        System.out.println("Address Book");
    }

    private void addBuddy(String name, String address, String phone){
        book.put(name, new BuddyInfo(name, address, phone));
    }

    private void removeBuddy(String name){
        book.remove(name);
    }
}
