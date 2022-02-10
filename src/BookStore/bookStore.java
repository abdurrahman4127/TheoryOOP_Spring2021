package BookStore;

class Books {
    private String []authorNames = new String[5];
    private String []bookNames = new String[5];
    private double []priceOfBook = new double[5];


    public String[] getAuthorNames() {
        return authorNames;
    }

    public String[] getBookNames() {
        return bookNames;
    }

    public double[] getPriceOfBook() {
        return priceOfBook;
    }

    void showDetails() {
        //
    }

    void buyBook(double money) {
        if (money > priceOfBook[0]) //price of 1st indexed book
        {
            System.out.println("successfully bought");
            System.out.println("Change : " + (money - priceOfBook[0]));
        }
        else System.out.println("Can't buy due to lack of money!");
    }
}

class Classified extends Academic {
    @Override
    void buyBook(double money) {
        System.out.println("Can't buy from BookStore.Classified section");
    }
}

class Novel extends Books{}
class Academic extends Novel{}


public class bookStore {
    public static void main(String[] args) {
        Novel novel = new Novel();
        System.out.println(novel.getPriceOfBook());


    }
}

//        BookStore.Novel novel = new BookStore.Novel("Harper Lee","To Kill A Mocking Bird", 281);
//        novel.showDetails();
//        novel.buyBook(500);
//
//        System.out.println();
//
//        Fiction fiction = new Fiction("Gorge Orwell","1984", 277);
//        fiction.showDetails();
//        fiction.buyBook(200);
//
//        System.out.println();
//
//        BookStore.Classified classified = new BookStore.Classified("Abdur Rahman","LIEf",7);
//        classified.showDetails();
//        classified.buyBook(2000);
//    }
//
//
////    public BookStore.Classified(String authorName, String bookName, double priceOfBook)
////    {
////        super(authorName, bookName, priceOfBook);
////    }
////
////    @Override
////    void buyBook(double money)
////    {
////        System.out.println("BookStore.Classified book cannot be bought");
////    }
