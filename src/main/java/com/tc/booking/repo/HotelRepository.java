package com.tc.booking.repo;

import com.tc.booking.model.entity.Hotel;
import com.tc.booking.model.entity.Room;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer> {
   List<Room> findByHotelId(int hotelId);
   List<Hotel> findAll();
   
}
