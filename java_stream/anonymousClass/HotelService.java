package java_stream.anonymousClass;

import java.util.ArrayList;
import java.util.List;

public class HotelService {
    List<Hotel> list = new ArrayList<Hotel>();

    public HotelService() {
        list.add(new Hotel(2, 3000, 4));
        list.add(new Hotel(1, 5000, 4));
        list.add(new Hotel(6, 3000, 3));
        list.add(new Hotel(8, 4000, 4));
        list.add(new Hotel(7, 6000, 5));
    }

    public List<Hotel> filterHotels(FilteringCond filter) {
        List<Hotel> filteredList = new ArrayList<Hotel>();
        for (Hotel hotel : list) {
            if (filter.test(hotel)) {
                filteredList.add(hotel);
            }
        }
        return filteredList;
    }
}
