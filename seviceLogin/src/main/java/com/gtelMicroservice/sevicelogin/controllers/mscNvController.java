package com.gtelMicroservice.sevicelogin.controllers;

import com.gtelMicroservice.sevicelogin.dtos.StaffDto;
import com.gtelMicroservice.sevicelogin.dtos.requestBody.loginDto;
import com.gtelMicroservice.sevicelogin.dtos.response.DefaultResponse;
import com.gtelMicroservice.sevicelogin.models.StaffModel;
import com.gtelMicroservice.sevicelogin.services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("api/v1/")
public class mscNvController {

    @Autowired
    private StaffService staffService;
    Boolean success;
    String message;

    @PostMapping("createStaff")
    public DefaultResponse createStaff(@RequestBody StaffDto staff){
        int check = staffService.createStaff(staff);
        if (check == 1){
            success = true;
            message = "Create Staff Successfull!!";
        }else {
            success = false;
            message = "Create Staff Fail!!";
        }
        return new DefaultResponse(success, message);
    }
    @PostMapping("login")
    public Optional<StaffModel> login(@RequestBody loginDto loginDto){
        return staffService.login(loginDto);
    }
}
