interface RoomPricing{double price(int nights);}
class Standard implements RoomPricing{public double price(int n){return 2000*n;}}
class Deluxe implements RoomPricing{public double price(int n){return 3000*n;}}
class Suite implements RoomPricing{public double price(int n){return 5000*n;}}
class Customer{String name;Customer(String n){name=n;}}
class Room{String id;RoomPricing pricing;Room(String i,RoomPricing p){id=i;pricing=p;}}
class Reservation{Room room;Customer customer;int nights;boolean active=true;Reservation(Room r,Customer c,int n){room=r;customer=c;nights=n;}double total(){return room.pricing.price(nights);}void cancel(){active=false;}}
public class Main{public static void main(String[]a){Reservation r=new Reservation(new Room("101",new Deluxe()),new Customer("Asha"),2);System.out.println(r.total());}}