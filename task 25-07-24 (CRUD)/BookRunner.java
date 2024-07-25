class BookRunner {
    public static void main(String[] args) {
        Book book = new Book();
        int length = book.getArrayLength();
        System.out.println("======== Creation ========");
        System.out.println("The Array is created of length: " + length);

        System.out.println("======== Insertion ========");
        book.insertBookNames("Harry Potter");
        book.insertBookNames("Lord of the Rings");
        book.insertBookNames("Game of Thrones");
        book.insertBookNames("To Kill a Mockingbird");

        System.out.println("======== Reading ========");
        book.readBookNames();

        System.out.println("======== Updating ========");
        book.updateBookName("Game of Thrones", "The Hobbit");
        book.readBookNames();

        System.out.println("======== Deleting ========");
        book.deleteBookName("The Hobbit");
        book.readBookNames();

        System.out.println("======== Searching ========");
        String search = book.searchBookName("Lord of the Rings");
        System.out.println("Result: " + search);
    }
}
