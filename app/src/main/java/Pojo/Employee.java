package Pojo;

import com.google.gson.annotations.Expose;

import java.io.Serializable;
import java.security.PrivateKey;
import java.util.List;

public class Employee {

    @Expose
    private String FirstName;
    @Expose
    private String mail;
    @Expose
    private int age;

    private Address address;
    private List<FamilyMember> familyMembers;


    //TRANSIENT WILL COMPLETELY EXCLUDE THE FIELD FROM SERIALIZATION OR DESERIALIZATION.
    private transient  String Password;







    //EXPOSE NOTATION WILL GIVE US FREEDOM TO CONTROL OVER SERIALIZE OR DESERIALIZE.
    //DEFAULT MODE WITH EXPOSE FOR SERIALIZATION IS TRUE.
    @Expose(serialize = true , deserialize = false)
    private String Gender;








    //ANOTHER WAY TO ACHIEVE TRANSIENT.
    @Expose(deserialize = false, serialize = false)
    private String CurrentLocaiton;







    //CONSTRUCTOR FOR SERIALIZATION TEST.
    public Employee(String firstName, String mail, int age, String password, String gender, String currentLocaiton) {
        FirstName = firstName;
        this.mail = mail;
        this.age = age;
        Password = password;
        Gender = gender;
        CurrentLocaiton = currentLocaiton;
    }








    public Employee(String firstName, String mail, int age, Address address, List<FamilyMember> familyMembers) {
        FirstName = firstName;
        this.mail = mail;
        this.age = age;
        this.address = address;
        this.familyMembers = familyMembers;
    }








    public Employee(String firstName, String mail, int age, Address address) {
        FirstName = firstName;
        this.mail = mail;
        this.age = age;
        this.address = address;
    }








    public Employee(String firstName, String mail, int age) {
        FirstName = firstName;
        this.mail = mail;
        this.age = age;
    }







    public void setFamilyMembers(List<FamilyMember> familyMembers) {
        this.familyMembers = familyMembers;
    }



    public List<FamilyMember> getFamilyMembers() {
        return familyMembers;
    }


    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
