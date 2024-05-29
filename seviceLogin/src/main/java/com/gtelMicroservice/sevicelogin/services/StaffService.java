package com.gtelMicroservice.sevicelogin.services;

import com.gtelMicroservice.sevicelogin.dtos.StaffDto;
import com.gtelMicroservice.sevicelogin.dtos.requestBody.loginDto;
import com.gtelMicroservice.sevicelogin.models.StaffModel;
import com.gtelMicroservice.sevicelogin.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class StaffService {
    @Autowired
    private StaffRepository staffRepository;
    int status = 0;
    public int createStaff(StaffDto staffDto){

        try{
            StaffModel staffModel = StaffModel.builder()
                    .id(staffDto.getId())
                    .nameStaff(staffDto.getNameStaff())
                    .emailStaff(staffDto.getEmailStaff())
                    .oldStaff(staffDto.getOldStaff())
                    .addressStaff(staffDto.getAddressStaff())
                    .createAt(staffDto.getCreateAt())
                    .updateAt(staffDto.getUpdateAt())
                    .addressStaff(staffDto.getAddressStaff())
                    .build();
            staffRepository.save(staffModel);
            status = 1;
        }catch (Exception e){
            e.printStackTrace();
        }
        return status;
    }

    public Optional<StaffModel> login(loginDto loginDto){
        try {
            return staffRepository.findById(loginDto.getEmail());
        }catch (Exception e){
            e.printStackTrace();
        }
        return Optional.empty();
    }
}
