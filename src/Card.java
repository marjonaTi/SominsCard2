import java.util.Scanner;

public class Card {
    private Integer userId;
    private String cardNumber;
    private double balance;
    private int pinCode;
    private String expriationDate;
    private String ownerData;


    public Card(int userId, String cardId, String expirationDate, String ownerInfo, int pinCode) {
        this.cardNumber = cardId;
        this.pinCode = pinCode;
        this.expriationDate = expirationDate;
        this.ownerData = ownerInfo;

    }


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getExpriationDate() {
        return expriationDate;
    }

    public void setExpriationDate(String expriationDate) {
        this.expriationDate = expriationDate;
    }

    public String getOwnerData() {
        return ownerData;
    }

    public void setOwnerData(String ownerData) {
        this.ownerData = ownerData;
    }



// Меняет информацию о карте
    public boolean changeOwnerData(String cardNumber, String newOwnerData) {
        if (this.cardNumber.equals(cardNumber) ) {
            this.ownerData = newOwnerData;
            return true;
        } else {
            return false;
        }
    }

    public boolean changePinCode(String cardNumber, int newPinCode){
        if (this.cardNumber.equals(cardNumber)){
            this.pinCode = newPinCode;
            return  true;
        } else {
            return false;
        }
    }


//    добавляет деньги на карту
 public void addMoney(){
    Scanner scanner = new Scanner(System.in);

     System.out.println("----------------------------------");
      System.out.println("Введите номер карты: ");
       String enteredCardNum = scanner.nextLine();

    System.out.println("Введите пин код: ");
        int enterPinCode = scanner.nextInt();
        scanner.nextLine();

//      проверяем на совпадаемость введенного номера карты из списка
    if (enteredCardNum.equals(this.cardNumber) &&
                         enterPinCode == this.pinCode) {
        System.out.println("Введите сумму: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        if (amount > 0) {
            this.balance += amount;
             System.out.println("Ваш баланс пополнен. Ваш баланс:" + this.balance);
              System.out.println("------------------------------------------------");
        } else {
             System.out.println("ОШИБКА. Сумма должна быть положительной");
        }
    } else {
             System.out.println("ОШИБКА. Неверный номер карты или пин код");
    }
}




// Перевод денег с карты на карту
public void transferMoney(Card card){
        Scanner scanner =  new Scanner(System.in);
    System.out.println("-----------------------------------");
     System.out.println("Введите номер карты для перевода: ");
      String cardNumber = scanner.nextLine();

    if (cardNumber.equals(card.getCardNumber())){
        System.out.println("Введите сумму для перевода: ");
            double amount = scanner.nextDouble();

        if (amount > 0 && amount <= this.balance){
            this.balance -= amount;
             card.balance += amount;
              System.out.println("Перевод выполнен успешно.");
               System.out.println("Ваш баланс: " + this.balance);
                System.out.println("---------------------------------");
        } else {
            System.out.println("ОШИБКА! Недостаточно средств или неверная сумма для перевода.");

        }
    } else {
            System.out.println("ОШИБКА! Неверный номер карты");
    }
}




// Снимает деньги с карты на платежи
  public void withdrawMoney (){
        Scanner scanner = new Scanner(System.in);
      System.out.println("--------------------------");
       System.out.println("ВВедите номер карты: ");
        String enteredCardNumber = scanner.nextLine();

      System.out.println("Введите пин код: ");
         Integer enterPinCode = scanner.nextInt();

      if (enteredCardNumber.equals(this.cardNumber) && enterPinCode.equals(this.pinCode)){
          System.out.println("КАТЕГОРИЯ ПЛАТЕЖА: ");
           System.out.println("1. Кредит");
            System.out.println("2. Интернет");
             System.out.println("3. Налог");
              System.out.println("4. Мобильные операторы");

//          для выбора категории
          int categoryChoice = scanner.nextInt();
              scanner.nextLine();


          System.out.println("Введите сумму для платежа: ");
              double amount = scanner.nextDouble();

          if (amount > 0 && amount <= this.balance){
              this.balance -= amount;
              System.out.println("Оплата прошла успешно. Ваш баланс: " + this.balance);
               System.out.println("----------------------------------------------------");

          } else {
                System.out.println("ОШИБКА. Недостаточно средств или неверный ввод суммы.");
          }
      } else {
          System.out.println("ОШИБКА. Неверный номер карты или пин код");
      }
  }

}
