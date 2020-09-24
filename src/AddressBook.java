import java.util.Map;

public class AddressBook {
    private Map<String, BuddyInfo> book;

    public static void main(String[] arg){
        BuddyInfo buddy = new BuddyInfo("Carl", "There", "123");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }

    private void addBuddy(BuddyInfo buddy){
        book.put(buddy.getName(), buddy);
    }

    private void removeBuddy(BuddyInfo buddy){
        book.remove(buddy.getName());
    }
}
