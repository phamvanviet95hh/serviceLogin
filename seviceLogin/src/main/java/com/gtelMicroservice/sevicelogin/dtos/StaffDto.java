package com.gtelMicroservice.sevicelogin.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StaffDto {
    private int id;
    private String nameStaff;
    private String oldStaff;
    private String addressStaff;
    private String createAt;
    private String updateAt;
    private String deleteAt;
    private String emailStaff;
}
