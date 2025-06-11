package vn.hienht.hienht_example_code.dto.request;

import java.io.Serializable;

public class UserRequestDTO implements Serializable {
    public UserRequestDTO(String firstName, String lastName, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
    }

    public String firstName;
    public String lastName;
    public String phone;
    public String email;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
}
