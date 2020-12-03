package library;
import java.util.*;



/*  编号找 有 */
public class RecordBooksOrder {
    //书架,让书架静态了 就可以被直接调用
    static ArrayList<Books> booksList = new ArrayList<>();

    public static void main(String[] args) {
        //初始化书架，目的是为了让书架有书。
        //卖书 肯定要人家知道有什么书咯 i兄弟
        init();
        for (int i = 0; i < booksList.size(); i++) {
            System.out.println(booksList.get(i));
        }
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入图书编号：");
            int bookId = sc.nextInt();
            //要遍历一下看看是否有没有书,在外面定义一个方法吧，使方法等于对象  故所以方法的参数是对象



        }
    }
        private static void init(){
            Books a1= new Books(101,"泡妞三十六计",33,991,"北京大学出版社");
            Books a2= new Books(102,"神马",43,876,"人马出版社");
            Books a3= new Books(103,"泡妞计划",53,544,"清华大学出版社");
            Books a4= new Books(104,"泡妞大师",35,643,"中山大学出版社");
            Books a5= new Books(105,"泡妞入门",90,324,"广东工业大学出版社");
            Books a6= new Books(106,"泡妞基础知识",67,123,"华南理工大学出版社");
            booksList.add(a1);
            booksList.add(a2);
            booksList.add(a3);
            booksList.add(a4);
            booksList.add(a5);
            booksList.add(a6);
            )

        }
        private Books sockBooks(Books ){
            for (int i = 0; i < booksList.size(); i++) {
                 int id1 = booksList.get(i).id;
            }
        }



}
