import java.util.*;

public class Platfort {

 private Map<Integer, User> userMap;
 private Map<String, Card> cardMap;

 public Platfort(){
  this.userMap = new HashMap<>();
  this.cardMap = new HashMap<>();
 }





 private String generateRandomId() {
  Random random = new Random();
  long randomValue = random.nextLong();
  return Long.toHexString(randomValue);
 }

 public void addCard(String expirationDate, String ownerInfo, short pinCode) {
  String cardId = generateRandomId();
  Card card = new Card( expirationDate, ownerInfo, pinCode);
  cardMap.put(cardId, card);
  System.out.println("Карта добавлена. ID карты: " + cardId);
 }

 public void deleteCard(String cardIdToDelete) {
  if (cardMap.containsKey(cardIdToDelete)) {
   cardMap.remove(cardIdToDelete);
   System.out.println("Карта с ID " + cardIdToDelete + " удалена.");
  } else {
   System.out.println("Карта с ID " + cardIdToDelete + " не найдена.");
  }
 }

 public void showCard(){
  for (Card card : cardMap.values()){
   System.out.println(card.toString());
  }


 }





 public void addUser(Integer iD, String name, String surname, int age, String gender) {
  User user = new User(iD, name, surname, age, gender);
  userMap.put(iD, user);
  System.out.println("Пользователь добавлен");
 }


 public void deleteUser(String userIdToDelete){
  if (userMap.containsKey(userIdToDelete)){
   userMap.remove(userIdToDelete);
   System.out.println("Пользователь с ID:" + userIdToDelete + " удален.");
  } else {
   System.out.println("Пользователь с ID:" + userIdToDelete + " не найден.");
  }
}


public  void showUser(){
 for (User user: userMap.values()) {
  System.out.println("USER:" +
                    " Id: " + user.getId() +
                    " Name: " + user.getName() +
                    " Surname: " + user.getSurname() +
                    " Gender: " + user.getGender() +
                    " Age: " + user.getAge());

   }
  }
 }
