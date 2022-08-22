public class exmaple {
    public static void main(String[] args) {
        Item item = new Book();
        // Book book = (Book) item;
        // System.out.print(item.price);
        // System.out.print(",");
        // System.out.print(item.getPrice());
        // System.out.print(",");
        // System.out.print(book.price);
        // System.out.print(",");
        // System.out.print(book.getPrice());
        System.out.println(item.getPrice());
        
    }
}
class Item{
    protected double price = 5;
    public double getPrice(){
        return price*-1;

    }
}

class Book extends Item{
    double price =15;
    public double getPrice(){
        return price +=3;
    }
}