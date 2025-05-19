package C3Variables.Books;

class Books {
    String title;
    String author;
}

class BookTestDrive{
    public static void main(String[] args) {
        Books[] books = new Books[3]; // Declare array of Books class [0-2] 3 Positions
        int x = 0;
        books[0] = new Books(); //Create instances of one position of array
        books[1] = new Books();
        books[2] = new Books();

        //Set titles of Books
        books[0].title= "The Grapes of Java";
        books[1].title= "The Java Gatsby";
        books[2].title= "The Java CookBook";
        //Set author of Books
        books[0].author = "Bob";
        books[1].author = "Sus";
        books[2].author = "Ian";
        //Print every author of array
        while(x< books.length){
            System.out.println(books[x].title);
            System.out.println(books[x].author);
            x+=1;
        }
    }
}
