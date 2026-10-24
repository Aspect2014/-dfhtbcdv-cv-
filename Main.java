import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
abstract class item{
    private String id;
    private String title;
    private LocalDate pd;
    private int days;
    public item(String id, String title, LocalDate pd,int days){
        this.id=id;
        this.title=title;
        this.pd=pd;
        this.days=days;
    }
    public String getId(){
        return id;
    }
     public String getTitle(){
        return title;
    } 
    public LocalDate getPd(){
        return pd;
    } 
    public int getDays(){
        return days;
    }
}
class book extends item{
    private String author;
    private int pages;
    public book(String id, String title, LocalDate pd,String author,int pages){
        super(id,title,pd,21);
        this.author=author;
        this.pages=pages;

    }
    public String getAuthor(){
        return author;

    }
    public int getPages(){
        return pages;

    }
}
    public class Main{
        public static void main(String[] args) {
            book d=new book("d001","The Architecture of Quiet Rain",LocalDate.of(1949,6,8),"Rajbir S",667);
            System.out.println(d.getId());
            System.out.println(d.getTitle());
            System.out.println(d.getPd());
            System.out.println(d.getDays());
            System.out.println(d.getAuthor());
            System.out.println(d.getPages());

        }
    }


                                                                                                             
                                          




























































































