package com.carrental.CarRental.Service;

import com.carrental.CarRental.Data.Entity.UserEntity;
import com.carrental.CarRental.Data.Model.UserInfoParam;
import com.carrental.CarRental.Data.Model.UserRegisterParam;

import java.util.List;

public interface IUserService {
    UserEntity saveUser(UserRegisterParam param);
    List<UserEntity> getUserByEmailAndPassword(String email, String password);

    List<UserEntity> getAllUser();

    UserEntity getUserById(int id);

    void updatePhone(int id,String phone);

    UserEntity updateUserInfo(int id, UserInfoParam userInfoParam);
}
