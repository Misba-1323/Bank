public class Bank_Transaction {
    String account_name;
    String accountholder_name;
    String account_type;
    String account_number ;

    public Bank_Transaction(String account_name, String accountholder_name, String account_type,
            String account_number) {
        this.account_name = account_name;
        this.accountholder_name = accountholder_name;
        this.account_type = account_type;
        this.account_number = account_number;
    }

     public void displayBankTransaction(){
        System.out.println("Bank Transaction Details : ");
        System.out.println("Account name : "+account_name);
        System.out.println("Account Holder name: "+accountholder_name);
        System.out.println("Account type : "+account_type);
        System.out.println("Account number : "+account_number);
    }

    public static void main(String[] args) {
        Bank_Transaction bt = new Bank_Transaction("SBI","Alinah","Saving","123456789011");
        bt.displayBankTransaction();
    }
    
    
}
