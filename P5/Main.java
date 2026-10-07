interface PaymentMethod{boolean pay(double amount);}
class CardPayment implements PaymentMethod{public boolean pay(double a){return a>0;}}
class UpiPayment implements PaymentMethod{public boolean pay(double a){return a>0;}}
class Customer{String name;Customer(String n){name=n;}}
class Product{String name;double price;Product(String n,double p){name=n;price=p;}}
class Order{Customer customer;java.util.List<Product> products=new java.util.ArrayList<>();String status="Pending";Order(Customer c){customer=c;}void add(Product p){products.add(p);}double total(){double x=0;for(Product p:products)x+=p.price;return x;}void pay(PaymentMethod m){if(m.pay(total()))status="Paid";}}
public class Main{public static void main(String[]a){Order o=new Order(new Customer("Asha"));o.add(new Product("Book",500));o.pay(new UpiPayment());System.out.println(o.status);}}