package com.tc.booking.repo;

import com.tc.booking.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    // Tìm kiếm customer theo ID
    Optional<Customer> findById(Integer id);

    // Tìm kiếm customer theo email
    Optional<Customer> findByEmail(String email);
    
    // Thêm các phương thức truy vấn khác nếu cần
}
