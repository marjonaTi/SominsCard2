// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

Platform platfort = new Platform();

      User user1 = platfort.addUser("Dante","Russo",25,"Male");
        Card card1 = platfort.addCard(user1,"123456789","12/27","Dante Russo",  1299);
      User user2 = platfort.addUser("Kalix", "Monterosso", 29, "Male");
        Card card2 = platfort.addCard(user2,"987654321","07/45","Kalix Monterosso", 3435);

//       platfort.showUser(user1);
//       platfort.showCard(card1);
//
//
//       platfort.showUser(user2);
//       platfort.showCard(card2);
//
//
//       user1.changeAge(1,27);
//        platfort.showUser(user1);
//
//
//       card2.changePinCode("987654321", 2334);
//       platfort.showCard(card2);

//       card1.addMoney();
//          platfort.showCard(card1);
//
//          card1.transferMoney(card2);
//          platfort.showCard(card2);
//
//          card2.withdrawMoney();
//          platfort.showCard(card2);



    }
}