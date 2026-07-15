public class Main{
    public static void main(String[] args){
        Book javaBook = new Book("978-1-1111-1111-1", "Java Programming",
                "John Doe", 1000.00, 2024);

        // Invalid Discount (-20%)
        System.out.println(javaBook.applyDiscount(-20.0));

        // Invalid Discount (0%)
        System.out.println(javaBook.applyDiscount(0.0));

        // Invalid Discount (100%)
        System.out.println(javaBook.applyDiscount(100.0));

        // Invalid Discount (430%)
        System.out.println(javaBook.applyDiscount(430.0));

        // Valid Discount (25%)
        System.out.println(javaBook.applyDiscount(25.0));

        // Verify final price is exactly 750.00
        System.out.println(javaBook.getDetails());
    }
}