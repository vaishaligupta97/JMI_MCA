import java.util.*;

class Customer{  
int amount=10000;  
  
void withdraw(int amount){  
System.out.println("going to withdraw...");  
  
if(this.amount<amount){  
System.out.println("Less balance; waiting for deposit...");  
try{wait();}catch(Exception e){}  
}  
this.amount-=amount;  
System.out.println("withdraw completed...");  
}  
  
 void deposit(int amount){  
System.out.println("going to deposit...");  
this.amount+=amount;  
System.out.println("deposit completed... ");  
notify();  
}  
}  
  
class AmountWaitTest{  
public static void main(String args[]){  
final Customer c=new Customer();  
new Thread(){  
public void run(){c.withdraw(15000);}  
}.start();  
new Thread(){  
public void run(){c.deposit(10000);}  
}.start();  
  
}}  