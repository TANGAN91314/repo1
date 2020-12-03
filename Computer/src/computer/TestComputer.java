package computer;

public class TestComputer {
    public static void main(String[] args) {
       Computer.turnOn();

        Computer lt = new Computer();
        USB m = new Mouse();
        //不能直接用m 去调用 Computer类中的 useDevice方法，要用Computer创建出来的对象去调用它
        lt.useDevice(m);
        USB k = new KeyBoard();
        lt.useDevice(k);
        Computer.turnOff();

    }
}









  /*
       //  多态 向上转移
        USB mouse = new Mouse();
        mouse.open();
        mouse.close();
        USB keyboard = new KeyBoard();
        keyboard.open();
        keyboard.close();
        以上虽然可以运行但是不是直接同过Computer类来调用  有点麻烦
        */
        /*USB usb = new Mouse();   其实不必要 和参数的名字都一摸一样  参数名字只是一个示范
        usb.open();
        usb.close();
        //USB usb = new KeyBoard();  和上面的重名了
        */
