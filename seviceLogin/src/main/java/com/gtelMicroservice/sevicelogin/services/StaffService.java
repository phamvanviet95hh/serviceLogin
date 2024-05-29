package com.gtelMicroservice.sevicelogin.services;

import com.gtelMicroservice.sevicelogin.dtos.StaffDto;
import com.gtelMicroservice.sevicelogin.models.StaffModel;
import com.gtelMicroservice.sevicelogin.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StaffService {
    @Autowired
    private StaffRepository staffRepository;
    public int createStaff(StaffDto staffDto){
        int status = 0;
        try{
            List<StaffModel> staffModels = new ArrayList<>();
            StaffModel staffModel = StaffModel.builder()
                    .id(staffDto.getId())
                    .nameStaff(staffDto.getNameStaff())
                    .oldStaff(staffDto.getOldStaff())
                    .addressStaff(staffDto.getAddressStaff())
                    .createAt(staffDto.getCreateAt())
                    .updateAt(staffDto.getUpdateAt())
                    .addressStaff(staffDto.getAddressStaff())
                    .build();
            staffModels.add(staffModel);
            staffRepository.saveAll(staffModels);
            status = 1;
        }catch (Exception e){
            e.printStackTrace();
        }
        return status;
    }
}
