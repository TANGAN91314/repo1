package library;

public class Books {
    int id;
    String name;
    double price;
    int number;
    String publish;

    public Books(int id, String name, int price, int number, String publish) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.number = number;
        this.publish = publish;
    }

    @Override
    public String toString() {
        String message = "图书编号"+id +"名称"+name+"价格"+price+"数量"+number+"出版社"+publish;
        return message;
    }
    public void setNumber(){
        this.number = number ;
    }
}
