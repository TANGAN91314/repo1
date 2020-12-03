package computer;

public class Computer {

    public static void turnOn(){
        System.out.println("开机。");
    }


    public void useDevice(USB usb){
        usb.open();
        //向下转移是在这里搞掂
        if(usb instanceof Mouse){
            //强制类型转换 ，向下转
            Mouse m = (Mouse) usb;
            m.click();
        }
        if(usb instanceof KeyBoard){
            KeyBoard kp = (KeyBoard) usb;
            kp.type();
        }
        usb.close();
    }
    public static void turnOff() {
        System.out.println("关机。");
    }
}
