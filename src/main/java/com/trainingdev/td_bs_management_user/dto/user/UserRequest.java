package com.trainingdev.td_bs_management_user.dto.user;

import com.trainingdev.td_bs_management_user.enums.GenderEnum;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {
    @NotEmpty(message = "firstname can't be empty")
    @Size(max = 20, message = "firstname can't be more than 20 characters")
    private String firstName;

    @NotEmpty(message = "lastName can't be empty")
    @Size(max = 20, message = "lastName can't be more than 20 characters")
    private String lastName;

    @NotEmpty(message = "birthday can't be empty")
    private LocalDate birthday;

    @NotEmpty(message = "email can't be empty")
    @Size(max = 60, message = "email can't be more than 20 characters")
    @Email
    private String email;

    @NotEmpty(message = "password can't be empty")
    @Pattern(
            regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}",
            message="The password must have at least one uppercase latter, one lowercase letter, and special character"
    )
    private String password;

    @NotNull(message = "gender can't be null")
    private GenderEnum gender;
}
