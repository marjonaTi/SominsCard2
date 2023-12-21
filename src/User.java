import java.util.ArrayList;
import java.util.List;

public class User {


    private Integer userId;
    private String name;
    private String surname;
    private int age;
    private String gender;

    public User(Integer iD, String name, String surname, int age, Gender gender) {
    }

//    private List<User> userList = new ArrayList<>();

    public Integer getId() {
        return userId;
    }

    public void setId(Integer id) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
//    public List<User> getUserList() {
//        return userList;
//    }

//    public void setUserList(List<User> userList) {
//        this.userList = userList;
//    }


    public User() {
        this.userId = userId;
        this.name = this.name;
        this.surname = this.surname;
        this.age = this.age;
        this.gender = this.gender;
    }

    @Override
    public String toString() {
        return "USER:  " +
                "Id: " + userId +
                ", Name: " + name +
                ", Surname: " + surname +
                ", Age: " + age +
                ", Gender: " + gender + '\'' ;
    }

    public boolean changeUserName(Integer userID , String newName){
        if (this.userId.equals(userID)){
            this.name = newName;
            return true;
        } else {
            return false;
        }
    }

    public boolean changeSurname(Integer userID, String newSurname){
        if (this.userId.equals(userID)){
            this.surname = newSurname;
            return true;
        }else {
            return  false;
        }
    }


    public boolean changeAge(Integer userID, Integer newAge){
        if (this.userId.equals(userID)){
            this.age = newAge;
            return true;
        } else {
            return false;
        }
    }


    public boolean changeGender(Integer userID, String newGender){
        if (this.userId.equals(userID)){
            this.gender = newGender;
            return  true;
        } else {
            return false;
        }
    }


}