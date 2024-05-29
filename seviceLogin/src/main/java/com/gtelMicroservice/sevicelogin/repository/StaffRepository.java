package com.gtelMicroservice.sevicelogin.repository;

import com.gtelMicroservice.sevicelogin.models.StaffModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StaffRepository extends MongoRepository<StaffModel, String> {

}
