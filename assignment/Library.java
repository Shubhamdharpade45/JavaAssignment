package assignment;

public class Library {
    public void issueBook(String bookName , boolean isAvailable){
        if(isAvailable==true){
            System.out.println(bookName+": Is Available");
        }
        else {
            System.out.println(bookName+": Is Not Available");
        }
    }
}
