package com.trainingdev.td_bs_management_user.dto.user;

import com.trainingdev.td_bs_management_user.enums.GenderEnum;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class UserDetail {

    @NotNull
    private int id;

    @Size(max = 40, message = "name can't be more than 40 characters")
    private String name;

    private LocalDate birthday;

    @Size(max = 60, message = "email can't be more than 20 characters")
    @Email
    private String email;

    @Pattern(
            regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}",
            message="The password must have at least one uppercase latter, one lowercase letter, and special character"
    )
    private String password;

    private GenderEnum gender;

    private String profilePhoto;

    private String coverPhoto;

    private LocalDate creationDate;

    private LocalDate modificationDate;
}
