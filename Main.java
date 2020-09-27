class Main {
  public static void main(String[] args) {
   // kindly use appropriate data types for your declaration
   // declare variables days the debtor defaulted, amount the debtor is to pay per day, amount the debtor is to pay and assign values to them
   int days_defaulted= 5;
   int amount_per_day= 300;
   int amount_debtor_paid= 1200;

   
   //Declare the variable of the total amount the debtor is to pay, the days the debtor paid for, amount the debtor is left to pay, days the debtor has not payed for
   int totalAmount_to_pay;
   int days_paid_for;
   int amount_left;
   int days_not_paid;

   // calculate and print total amount the debtor is to pay
   totalAmount_to_pay= days_defaulted*amount_per_day;
   System.out.println("The total amount the debtor is to pay is:" + totalAmount_to_pay);

   // calculate and print the days the debtor paid for
   days_paid_for= amount_debtor_paid/amount_per_day;
   System.out.println("The days the debtor paid for:" + days_paid_for);
  
  // calculate and print the amount whose day was not captured because the amount was incomplete
  int incompleteAmount= amount_debtor_paid % amount_per_day;
  System.out.println("The amount not captured is: " + incompleteAmount);

   // calculate and print amount the debtor is left to pay
   amount_left=(amount_per_day*days_defaulted)-amount_debtor_paid;
   System.out.println("The amount the debtor is left to pay is:" + amount_left);
   
   // calculate and print days the debtor has not payed for
   days_not_paid=days_defaulted-(amount_debtor_paid/amount_per_day);
   System.out.println("The number of days the debtor has not payed for is:" + days_not_paid);
  }
}