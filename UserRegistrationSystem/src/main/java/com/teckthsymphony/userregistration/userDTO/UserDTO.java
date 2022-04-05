package com.teckthsymphony.userregistration.userDTO;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class UserDTO {

//    public UserDTO() {
//    }

     @Id
     @GeneratedValue
     @Column(name = "user_id")
     private Long id;

     @Column(name = "name")
     private String name;

     @Column(name = "address")
     private String address;

     @Column(name = "email")
     private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
