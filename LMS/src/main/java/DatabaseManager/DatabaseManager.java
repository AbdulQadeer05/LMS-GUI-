/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseManager;
import Bean.Book;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;


/**
 *
 * @author Qadeer
 */
public class DatabaseManager {

    private static Connection con;
    
    static{
        try{
            init();
        }catch(Exception e){
        e.printStackTrace();
        }
    }
    
    
    private static void init()throws Exception{
    Class.forName("com.mysql.jdbc.Driver");
    String userName="root";
    String password="root";
    String url="jdbc:mysql://localhost:3306/LMS";
    
    con=DriverManager.getConnection(url,userName,password);
    }

    public static int addBook(int bookId, String bookName, String author)throws Exception{
    String query="insert into book(id,title,author) values ("+bookId+",'"+bookName+"','"+author+"')";
    System.out.print(query);

        Statement st=null;
            
        try{
            st=con.createStatement();
            int rows=st.executeUpdate(query);
            return rows;
        
        }finally{
            if(st!=null);
            st.close();
            if(con!=null);
            con.close();
            
        }
         
}

    public static int updateBook(int bookId, String bookName, String author)throws Exception{
        String query="update book set title='"+bookName+"',author='"+author+"' where id="+bookId;
        System.out.println(query);
        Statement st=null;
        
        try{
            st=con.createStatement();
            int rows=st.executeUpdate(query);
            return rows;
        }finally{
        if(st!=null);
        st.close();
        }
    }
    
    public static int deleteBook(int bookId)throws Exception{
        String query="delete from book where id=" +bookId;
        System.out.print(query);
        Statement st=null;
        
        try{
            st=con.createStatement();
            int rows=st.executeUpdate(query);
            return rows;
            
        }finally{
        if(st!=null);
        st.close();
        }
    }
}












