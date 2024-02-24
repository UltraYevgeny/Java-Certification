
public class Main {
    public static void main(String[] args) {
        String name1; String name2; String name3;
        int phone1; int phone2; int phone3;

        name1 = "Ivanov"; name2 = "Petrov"; name3 = "Aleshin";
        phone1 = 123456; phone2 = 654321; phone3 = 897103;

        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add(name3, phone2);
        myPhoneBook.add(name3, phone1);
        myPhoneBook.add(name1, phone3);
        myPhoneBook.add(name2, phone1);
        myPhoneBook.add(name2, phone2);
        myPhoneBook.add(name2, phone3);

        myPhoneBook.getPhoneBook();
    }
}
