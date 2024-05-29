package com.gtelMicroservice.sevicelogin.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
public class DefaultResponse {
    private Boolean success;
    private String message;


}
