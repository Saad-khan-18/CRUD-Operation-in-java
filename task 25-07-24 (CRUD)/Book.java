class Book {
    String[] books = new String[4];
    int index = 0;

    public int getArrayLength() {
        return books.length;
    }

    public String insertBookNames(String bookName) {
        if (this.index < this.getArrayLength()) {
            books[index] = bookName;
            System.out.println(index + ":" + books[index]);
            index++;
            return "Inserted Successfully";
        }
        return "Not Inserted";
    }

    public void readBookNames() {
        for (String name : books) {
            System.out.println("- " + name);
        }
    }

    public String updateBookName(String oldBookName, String newBookName) {
        for (int i = 0; i < getArrayLength(); i++) {
            if (books[i].equals(oldBookName)) {
                books[i] = newBookName;
                return "Updated Successfully";
            }
        }
        return "Not Found";
    }

    public String deleteBookName(String bookName) {
        for (int i = 0; i < getArrayLength(); i++) {
            if (books[i].equals(bookName)) {
                books[i] = null;
                return "Deleted Successfully";
            }
        }
        return "Not Deleted";
    }

    public String searchBookName(String bookName) {
        for (int i = 0; i < getArrayLength(); i++) {
            if (books[i] != null && books[i].equals(bookName)) {
                return "Search Book Found: " + bookName;
            }
        }
        return "Not Found";
    }
}
