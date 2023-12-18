package java_stream.anonymousClass;

public class Main {
    public static void main(String[] args) {
        HotelService service = new HotelService();
        var lessThan4000 = service.filterHotels(new FilteringCond() {

            @Override
            public boolean test(Hotel hotel) {
                return hotel.price<=4000;
            }
            
        });
        System.out.println(lessThan4000);

        //Using lambdas
        var greaterThan4000 = service.filterHotels((Hotel hotel) -> hotel.price>=4000);
        System.out.println(greaterThan4000);
    }
}
