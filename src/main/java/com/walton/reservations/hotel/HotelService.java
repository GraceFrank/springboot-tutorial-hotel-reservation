package com.walton.reservations.hotel;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class HotelService {

    private List<Hotel> hotelList =  new ArrayList<>(Arrays.asList(
            new Hotel(1, "Eko", "VI", 5),
            new Hotel(2, "Sheraton", "Lekki", 5),
            new Hotel(3, "Admiralty", "Ajah", 1)
    ));

    public List<Hotel> getAllHotels() {
        return hotelList;
    }

    public Hotel getHotelById (int id){
        return hotelList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addHotel(Hotel hotel) {
        hotelList.add(hotel);
    }

    public void updateHotel(int id, Hotel hotel) {
        for (int i = 0; i< hotelList.size(); i++){
            Hotel h = hotelList.get(i);
            if(h.getId().equals(id)){
                hotelList.set(i, hotel);
            }
        }
    }

    public void deleteHotel(int id) {
        hotelList.removeIf(hotel -> hotel.getId().equals(id));
    }
}

