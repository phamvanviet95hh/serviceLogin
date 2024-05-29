package com.gtelMicroservice.sevicelogin.models;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(value = "mscStaff")
@Builder
@Data
public class StaffModel {

    @Id
    private int id;

    @Field("name_msc")
    private String nameStaff;
    private String oldStaff;
    private String addressStaff;
    private String createAt;
    private String updateAt;
    private String deleteAt;
    private String emailStaff;
}
