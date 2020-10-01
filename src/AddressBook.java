import java.util.ArrayList;
// This is an edit outside of IntelliJ
public class AddressBook {
    private ArrayList<BuddyInfo> book;

    public AddressBook(){
        book = new ArrayList<>();
    }

    public static void main(String[] arg){
        BuddyInfo buddy = new BuddyInfo("Tom", "There", "123");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }

    private void addBuddy(BuddyInfo buddy){
        if (buddy != null) {
            book.add(buddy);
        }
    }

    private BuddyInfo removeBuddy(int index){
        if (index >= 0 && index < book.size()) {
            return book.remove(index);
        }
        return null;
    }
    private int newMethod(){
        return 0;
    }
}
