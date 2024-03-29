package com.carrental.CarRental.Repository;
import com.carrental.CarRental.Data.Entity.OwnerEntity;
import com.carrental.CarRental.Data.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository

public interface OwnerRepository extends JpaRepository<OwnerEntity,Integer> {

    List<OwnerEntity> findByEmailAndPassword(String email, String password);

    OwnerEntity getOwnerById(int id);
}
