package com.carrental.CarRental.ResponseEntity;


public class UserCustomException extends RuntimeException{
   public UserCustomException(String message){
        super(message);
    }
}
