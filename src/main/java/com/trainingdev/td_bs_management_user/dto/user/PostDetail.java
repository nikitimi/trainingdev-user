package com.trainingdev.td_bs_management_user.dto.user;

import com.trainingdev.td_bs_management_user.enums.FeelingEnum;
import com.trainingdev.td_bs_management_user.enums.PostTypeEnum;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class PostDetail {
    @NotNull
    private int id;

    private int userUd;

    private PostTypeEnum type;

    private FeelingEnum feeling;

    private String description;

    private String image;

    private LocalDate creationDate;

    private LocalDate modificationDate;

    private Comment[] commentList;
}
