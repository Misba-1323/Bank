public class Bank_Customer {
    String cust_name;
    String cust_id;
    String cust_address;

    public Bank_Customer(String cust_name, String cust_id, String cust_address) {
        this.cust_name = cust_name;
        this.cust_id = cust_id;
        this.cust_address = cust_address;
    }

    public void displayBankCustomer(){
        System.out.println("Bank Customer Details : ");
        System.out.println("Customer name : "+cust_name);
        System.out.println("Customer ID : "+cust_id);
        System.out.println("Customer Address : "+cust_address);
    }

    public static void main(String[] args) {
        Bank_Customer b = new Bank_Customer("Alinah", "CC101", "Hubli");
        b.displayBankCustomer();
    }
    
}
