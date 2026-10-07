interface Pricing{double price(int days);}
class Vehicle{String id;Pricing pricing;boolean available=true;Vehicle(String i,Pricing p){id=i;pricing=p;}}
class SedanPricing implements Pricing{public double price(int d){return 1000*d;}}
class SUVPricing implements Pricing{public double price(int d){return 1500*d;}}
class TruckPricing implements Pricing{public double price(int d){return 2000*d;}}
class Customer{String name;Customer(String n){name=n;}}
class Rental{Vehicle v;Customer c;Rental(Vehicle v,Customer c){if(!v.available)throw new IllegalStateException("Vehicle unavailable");this.v=v;this.c=c;v.available=false;}double charge(int days){return v.pricing.price(days);}void end(){v.available=true;}}
public class Main{public static void main(String[]a){Vehicle v=new Vehicle("S1",new SedanPricing());Rental r=new Rental(v,new Customer("Asha"));System.out.println(r.charge(2));r.end();}}