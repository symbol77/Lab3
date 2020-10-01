public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phone;
    }

    public static void main(String[] arg){
        System.out.println("Hello world!");
        BuddyInfo buddy = new BuddyInfo("Bob", "Yes.", "123");
        System.out.println("Hello " + buddy.getName());
    }

    public String getName() {
        return name;
    }
}
