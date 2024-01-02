import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Card {

    private String  cardId;
    private  double balance;
    private short pinCode;
    private String expriationDate;
    private String ownerData;
    private Status cardStatus;
    private List<Card> cardList = new ArrayList<>();


    public Card( String expirationDate, String ownerInfo, short pinCode) {
        this.pinCode = pinCode;
        this.expriationDate = expirationDate;
        this.ownerData = ownerInfo;

    }



    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public short getPinCode() {
        return pinCode;
    }

    public void setPinCode(short pinCode) {
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

    public Status getCardstatus() {
        return cardStatus;
    }

    public void setCardstatus(Status cardstatus) {
        this.cardStatus = cardstatus;
    }

    public List<Card> getCardList() {
        return cardList;
    }

    public void setCardList(List<Card> cardList) {
        this.cardList = cardList;
    }

    @Override
    public String toString() {
        return "CARD: " +
                "Id: " + cardId +
                ", Balance: " + balance +
                ", PinCode: " + pinCode +
                ", ExpirationDate: " + expriationDate +
                ", OwnerData: " + ownerData +
                ",CardStatus: " + cardStatus +
                 '\'' ;
    }

    public void  addMoney (String cardid, short pincode,Double blnc){
        for (Card card: getCardList()) {
            if (card.getCardId().equals(cardid) && card.getPinCode() == pincode){
                if (blnc != null && blnc >0){
                    card.setBalance(card.getBalance()+ blnc);

                    System.out.println("Добавлено на карту:" + cardId + " " + "Баланс:" + card.getBalance());
                }
                else {
                    System.out.println("ОШИБКА! Сумма должна быть положительной и не должна быть равно null.");
                }
            }

        }
    }



    public boolean changePinCode(Card card, String ownerData, short newPin) {
        if (card != null && card.getOwnerData().endsWith(ownerData)) {
            card.setPinCode(newPin);
            return true;
        } else {
            return false;
        }
    }


    public boolean changeOwnerData(Card card, String ownerData, String newOwnerData){
        if (card != null && card.getOwnerData().endsWith(ownerData)){
            card.setOwnerData(newOwnerData);
            return true;
        } else {
            return false;
        }
    }


}
