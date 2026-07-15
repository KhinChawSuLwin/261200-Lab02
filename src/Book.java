public class Book {

    // Fields (State)
    String isbn; // String (S is capital letter) is a class, reference type, the default value is null
    String title;
    String author;
    double price; // double is primitive type is 0.0
    int publicationYear; // int is primitive type, the default value is 0
    // TODO: Add author, price, and publicationYear

    // Parameterized Constructor
    public Book(String isbn, String title, String author, double price, int publicationYear) {
        // TODO: Initialize all 5 fields
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
        this.publicationYear = publicationYear;
    }

    // Default Constructor
    public Book() {
        // TODO: Complete this constructor to set default values
        this("000-0-0000-0000-0", "Unknown", "Unknown", 0.0, 1990);
    }

    // Methods (Behaviors)
    // Get book details
    public String getDetails() {
        // TODO: Complete this method to return a formatted string.

        return "[" + this.isbn + "]" + this.title + "(" + this.publicationYear + ") by " + this.author + " - " + this.price;
    }

    // Update book price (only if positive)
    public void updatePrice(double newPrice) {
        // TODO: Check if newPrice is valid. If valid, update the price.
        if (newPrice > 0.0)
            this.price = newPrice;
    }

    // Compare with another book
    public boolean isSameBook(Book otherBook) {
        // TODO: Complete this method to return true if this book's ISBN matches the otherBook's ISBN
        return (otherBook.isbn.equals(this.isbn));
    }

    //Discount
    public boolean applyDiscount(double discountPercentage) {
        if (discountPercentage > 0 && discountPercentage<100) {

            double discountAmount=price*(discountPercentage/100);
            price = price - discountAmount;
            return true;
        }
        return false;
    }
}
