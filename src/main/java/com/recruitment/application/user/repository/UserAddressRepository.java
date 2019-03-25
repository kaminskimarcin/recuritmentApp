package com.recruitment.application.user.repository;

import com.recruitment.application.user.domain.UserAddress;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAddressRepository extends CrudRepository<UserAddress, Long> {
}
