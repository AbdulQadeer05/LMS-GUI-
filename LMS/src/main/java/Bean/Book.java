/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bean;

/**
 *
 * @author Qadeer
 */
public class Book {
    
    private int bookId;
    private String bookName;
    private String author;
    
   public void setBookId(int bookId){
       this.bookId=bookId;
   }
   public int getBookId(){
       return bookId;
   }
   
   public void setBookName(String bookName){
       this.bookName=bookName;
   }
   public String getBookName(){
       return bookName;
   }
   
   public void setAuthor(String author){
       this.author=author;
   }
   public String getAuthor(){
       return author;
   }
    
}
