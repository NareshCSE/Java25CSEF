package javaprograms;
import java.util.Scanner; 
public class BankApplication { 
static Scanner sc = new Scanner(System.in);    
static int[] accountNumbers = new int[100];   
static String[] names = new String[100];    
static String[] aadhaarNumbers = new String[100];  
static String[] panNumbers = new String[100];    
static double[] balances = new double[100];     
static int accountCount = 0;    
static int nextAccountNumber = 1001;     
public static void main(String[] args) {   
int choice;      
char continueChoice;  
do {             
System.out.println("\n========== BANK APPLICATION ==========");   
System.out.println("1. Account Creation");         
System.out.println("2. Credit Amount");            
System.out.println("3. Debit Amount");            
System.out.println("4. Balance Enquiry");         
System.out.println("5. Mini Statement");           
System.out.println("6. Transfer Funds");            
System.out.println("7. Exit");           
System.out.println("======================================");    
System.out.print("Enter your choice: ");         
choice = sc.nextInt();            
sc.nextLine();            
switch (choice) { 
case 1:                   
createAccount();                 
break;               
case 2:              
creditAmount();           
break;            
case 3:          
debitAmount();     
break;                 
case 4:                 
balanceEnquiry();             
break;                   
case 5:              
miniStatement();          
break;               
case 6:               
transferFunds();       
break;                  
case 7:              
System.out.println("Thank you for using the Bank Application.");   
return;                
default:              
System.out.println("Invalid choice! Please select a valid option.");   
}            
if (choice != 7) {           
System.out.print("\nDo you want to continue? (Y/N): ");         
continueChoice = sc.next().charAt(0);           
} else {              
continueChoice = 'N'; 
} 
 while (continueChoice == 'Y' || continueChoice == 'y');    
System.out.println("Thank you. Application exited.");    
} 
    // Account Creation     
static void createAccount() {      
if (accountCount >= accountNumbers.length) {   
System.out.println("Cannot create more accounts.");   
return;     
}   
System.out.println("\n----- ACCOUNT CREATION -----");  
System.out.print("Enter customer name: ");   
names[accountCount] = sc.nextLine();          
System.out.print("Enter Aadhaar number: ");   
aadhaarNumbers[accountCount] = sc.nextLine();     
System.out.print("Enter PAN number: ");      
panNumbers[accountCount] = sc.nextLine();       
System.out.print("Enter initial deposit: ");     
double initialDeposit = sc.nextDouble();       
if (initialDeposit < 0) {        
System.out.println("Initial deposit cannot be negative."); 
return;         
} 
 accountNumbers[accountCount] = nextAccountNumber++; 
balances[accountCount] = initialDeposit;        
System.out.println("\nAccount created successfully!");
System.out.println("Account Number: " + accountNumbers[accountCount]);    
System.out.println("Customer Name: " + names[accountCount]); 
System.out.println("Initial Balance: ₹" + balances[accountCount]); 
   accountCount++;  
}     
// Find account index
static int findAccount(int accountNumber) {  
for (int i = 0; i < accountCount; i++) {    
if (accountNumbers[i] == accountNumber) {       
return i;          
} 
}          
return -1; 
} 
  // Credit Amount    
static void creditAmount() { 
System.out.println("\n----- CREDIT AMOUNT -----");
System.out.print("Enter account number: ");      
int accountNumber = sc.nextInt();        
int index = findAccount(accountNumber);     
if (index == -1) {           
System.out.println("Account not found.");    
return;        
}         
System.out.print("Enter amount to credit: ");   
double amount = sc.nextDouble();         
if (amount <= 0) {            
System.out.println("Amount must be greater than zero.");  
} else {   
balances[index] += amount;      
System.out.println("Amount credited successfully!");       
System.out.println("Credited Amount: ₹" + amount); 
System.out.println("New Balance: ₹" + balances[index]);     
}    
}   
// Debit Amount   
static void debitAmount() { 
System.out.println("\n----- DEBIT AMOUNT -----"); 
System.out.print("Enter account number: ");        
int accountNumber = sc.nextInt();         
int index = findAccount(accountNumber);       
if (index == -1) {     
System.out.println("Account not found.");        
return;        
}        
System.out.print("Enter amount to debit: ");    
double amount = sc.nextDouble();       
if (amount <= 0) {           
System.out.println("Amount must be greater than zero.");     
} else if (amount > balances[index]) {           
System.out.println("Insufficient balance.");     
} else {       
balances[index] -= amount; 
System.out.println("Amount debited successfully!");       
System.out.println("Debited Amount: ₹" + amount);         
System.out.println("Remaining Balance: ₹" + balances[index]);   
}   
} 
// Balance Enquiry     
static void balanceEnquiry() { 
System.out.println("\n----- BALANCE ENQUIRY -----"); 
  System.out.print("Enter account number: ");        
int accountNumber = sc.nextInt();       
int index = findAccount(accountNumber);      
if (index == -1) {            
System.out.println("Account not found.");  
} else {             
System.out.println("Account Number: " + accountNumbers[index]);        
System.out.println("Customer Name: " + names[index]);         
System.out.println("Current Balance: ₹" + balances[index]);  
}   
} 
  // Mini Statement     
static void miniStatement() {    
System.out.println("\n----- MINI STATEMENT -----");  
System.out.print("Enter account number: ");        
int accountNumber = sc.nextInt();         
int index = findAccount(accountNumber);       
if (index == -1) {           
System.out.println("Account not found.");  
} else {             
System.out.println("Account Number : " + accountNumbers[index]);     
System.out.println("Customer Name  : " + names[index]);          
System.out.println("Aadhaar Number : " + aadhaarNumbers[index]);      
System.out.println("PAN Number     : " + panNumbers[index]);     
System.out.println("Balance        : ₹" + balances[index]);        
} 
} 
 // Transfer Funds     
static void transferFunds() {     
System.out.println("\n----- FUND TRANSFER -----");   
System.out.print("Enter source account number: "); 
   int sourceAccount = sc.nextInt();     
System.out.print("Enter destination account number: ");  
int destinationAccount = sc.nextInt();        
int sourceIndex = findAccount(sourceAccount);        
int destinationIndex = findAccount(destinationAccount);     
if (sourceIndex == -1) {          
System.out.println("Source account not found.");   
return;         
}     
if (destinationIndex == -1) { 
System.out.println("Destination account not found.");    
return;         
}  
if (sourceAccount == destinationAccount) {   
System.out.println("Source and destination accounts cannot be the same.");  
return;          
}
System.out.print("Enter transfer amount: "); 
double amount = sc.nextDouble();             
if (amount <= 0) {        
System.out.println("Transfer amount must be greater than zero.");   
} else if (amount > balances[sourceIndex]) {   
System.out.println("Insufficient balance in source account."); 
} else { balances[sourceIndex] -= amount;         
balances[destinationIndex] += amount;        
System.out.println("Fund transfer successful!");       
System.out.println("Transferred Amount: ₹" + amount);    
System.out.println("Source Account Balance: ₹"                      + balances[sourceIndex]);     
}    
}  
} 







