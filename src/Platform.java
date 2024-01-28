import java.util.*;

public class Platform {

 List<User> userList;
 List<Card> cardList;


 public Platform(){
  this.userList = new ArrayList<>();
   this.cardList = new ArrayList<>();

 }


 private int generateUserId(){
    return userList.size() + 1;
 }


 public User addUser(String name, String surname, int age, String gender) {
      int userId = generateUserId();
           User user =  new User(userId,name,surname,age,gender);
      userList.add(user);
  return user;
 }


 public Card addCard(User user, String cardId, String expirationDate, String ownerInfo, int pinCode) {
      if (user != null){
          Card card = new Card(user.getUserId(),cardId,expirationDate,ownerInfo,pinCode);
       cardList.add(card);
  return card;
 }
 else {
       System.out.println("Не удалось сощдать карту");
  return null;
   }
 }



 public void showCard(Card card){
  if (card != null){
   System.out.println("Информация о карте: ");
    System.out.println("Номер карты: "+ card.getCardNumber());
     System.out.println("Информация о пользователе: " + card.getOwnerData());
      System.out.println("Срок действия: "+ card.getExpriationDate());
       System.out.println("Баланс: "  + card.getBalance());
        System.out.println("Пин код: "+ card.getPinCode());

  }
 }


public  void showUser(User user){
    if (user != null) {
     System.out.println("Информация о пользователе: ");
      System.out.println("ID пользователя: " + user.getUserId());
       System.out.println("Имя: " + user.getName());
        System.out.println("Фамилия: " + user.getSurname());
         System.out.println("Возраст: " + user.getAge());
          System.out.println("Пол: " + user.getGender());
           System.out.println("---------------");
    }
else {
     System.out.println("Пользователь не найден");
 }
}


 //  вспомогательная функция для получения пользователя по айди
 private  User getUserById(int userId){
   for (User user : userList){
     if (user.getUserId() == userId){
     return user;
    }
  }
    return null;
 }

 //  вспомогательная функция для получения карты по айди
 private Card getCardByCardId(String cardId){
  for(Card card : cardList){
   if (card.getCardNumber() == cardId){
    return card;
    }
  }
  return  null;
 }


//удаляем пользователя по айди
  public void deleteUser(int userId){
    User user = getUserById(userId);
       if (user != null){
        userList.remove(user);
      System.out.println("Пользователь удален");
  } else {
   System.out.println("ОШИБКА");
   }
  }

//  удаляем карту по его номеру
  public void deleteCard(String cardId){
      Card card = getCardByCardId(cardId);
       if (card != null){
         cardList.remove(card);
     System.out.println("Карта удалена");
  } else {
   System.out.println("ОШИБКА");
   }
  }






 }
