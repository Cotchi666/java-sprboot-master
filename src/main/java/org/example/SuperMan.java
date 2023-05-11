package org.example;


import java.time.LocalDateTime;

@JsonName(value = "super_man")
public class SuperMan {
    // Không chú thích, thì chúng ta sẽ coi như lấy tên field là `name` luôn
    private String name;

    @JsonName("date_of_birth")
    private LocalDateTime dateOfBirth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}

