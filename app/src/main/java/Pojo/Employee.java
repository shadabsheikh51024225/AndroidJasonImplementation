package Pojo;

import java.security.PrivateKey;
import java.util.List;

public class Employee {


    private String FirstName;
    private String mail;
    private int age;
    private Address address;
    private List<FamilyMember> familyMembers;


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
