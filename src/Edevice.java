import java.util.Scanner;
//generalized class
class Device {
    String color = "black";
    int warranty = 1;
    public void On()
    {
        System.out.println("Turn On the Device");
    }
    public void Off()
    {
        System.out.println("Turn OFF the Device");
    }
    public void Operate()
    {
        System.out.println("Operate");
    }
    @Override
    public String toString(){
        return "color: " + color + "\n"+ "Year of warranty: " + warranty + "year"+"\n__________________________";
    }
}
//Subclasses
class Mobile extends Device {
    String SIM = "Dual";
    byte netwrk = 4;
    byte RAM = 4;
    byte ROM = 64;
    String OS = "Android";
    boolean audio = true;
    boolean extndble_str = true;
    double display = 6.53;
    int battary = 5000;

    Mobile() {
        System.out.println("SIM: " + SIM + "\n" + "Network: " + netwrk + "G" + "\n" + "RAM: " + RAM + "GB\n" + "ROM:  "
                + ROM + "\nOperating System:  " + OS + "\nAudio:  " + audio + "\nExtendable Storage:   " + extndble_str
                + "\nDisplay: " + display + " inch HD +IPS" + "\nBattary: " + battary + "mAh");
    }
}

class Android extends Mobile {
    String processor;
    int rcamera;
    int fcamera;
    public void setCamera(int rcamera,int fcamera)
    {
        this.rcamera=rcamera;
        this.fcamera=fcamera;
    }
    public void getCamera()
    {
        System.out.println("rcamera:   "+rcamera+"MP"+"       fcamera:    "+fcamera+"MP");
    }
}
class Redmi extends Android  {
    private int IMEI = 234654656;
    String brand = "redmi";
    private long debitno;
    public void setMethod(long debitno)
    {
        this.debitno=debitno;
    }
    public String toString() {
        return "======================\n"+"       Redmi          "+"\n======================";
    }
    public void getImei() {
        System.out.println(IMEI);
    }
}

class Samsang extends Android {
    private int IMEI = 654645345;
    String brand = "Samsang";
    private long debitno;
    public void setMethod(long debitno)
    {
        this.debitno=debitno;
    }

    public void getImei() {
        System.out.println(IMEI);
    }
}

class Nokia extends Android {
    private int IMEI = 57686454;
    String brand = "Nokia";
    private long debitno;
    public void setMethod(long debitno)
    {
        this.debitno=debitno;
    }
    public void getImei() {
        System.out.println(IMEI);
    }
}

class Vivo extends Android {
    private int IMEI = 234353456;
    String brand = "Vivo";
    private long debitno;
    public void setMethod(long debitno)
    {
        this.debitno=debitno;
    }

    public void getImei() {
        System.out.println(IMEI);
    }
}
class Oppo extends Android {
    private int IMEI = 546331635;
    String brand = "Oppo";
    private long debitno;
    public void setMethod(long debitno)
    {
        this.debitno=debitno;
    }

    public void getImei() {
        System.out.println(IMEI);
    }
}

class Realme extends Android {
    private int IMEI = 5784641;
    String brand = "Realme";
    private long debitno;
    public void setMethod(long debitno)
    {
        this.debitno=debitno;
    }
    public String toString() {
        return "-----------Realme----------------";
    }
    public void getImei() {
        System.out.println(IMEI);
    }
}

class Honar extends Android {
    private int IMEI = 587684345;
    String brand = "Honar";
    private long debitno;
    public void setMethod(long debitno)
    {
        this.debitno=debitno;
    }
    static {
        System.out.println("======================");
        System.out.println("       Honar          ");
        System.out.println("======================");
    }
    public void getImei() {
        System.out.println(IMEI);
    }
}
class Apple extends Mobile
{
    String processor;
    int rcamera;
    int fcamera;
    public void setCamera(int rcamera,int fcamera)
    {
        this.rcamera=rcamera;
        this.fcamera=fcamera;
    }
    public void getCamera()
    {
        System.out.println("rcamera:  "+rcamera+"MP"+"     fcamera:"+fcamera+"MP");
    }
}
class iphone11 extends Apple
{
    private int IMEI = 58845745;
    String brand = "iphone11";
    private long debitno;
    public void setMethod(long debitno)
    {
        this.debitno=debitno;
    }
    static {
        System.out.println("======================");
        System.out.println("       iphone11       ");
        System.out.println("======================");
    }
}
class iphone12 extends Apple
{
    private int IMEI = 58474345;
    String brand = "iphone12";
    private long debitno;
    public void setMethod(long debitno)
    {
        this.debitno=debitno;
    }
    static {
        System.out.println("======================");
        System.out.println("       iphone12       ");
        System.out.println("======================");
    }
}
class iphone13 extends Apple
{
    private int IMEI = 18438645;
    String brand = "iphone13";
    private long debitno;
    public void setMethod(long debitno)
    {
        this.debitno=debitno;
    }
    static {
        System.out.println("======================");
        System.out.println("       iphone13       ");
        System.out.println("======================");
    }
}
class iphone13promax extends Apple
{
    private int IMEI = 12847445;
    String brand = "iphone13 pro max";
    private long debitno;
    public void setMethod(long debitno)
    {
        this.debitno=debitno;
    }
    static {
        System.out.println("======================");
        System.out.println("  iphone13 pro max    ");
        System.out.println("======================");
    }
}
class Laptop extends Device
{
    String ps = "intel";
    int gnrtn = 10;
    String os = "window 10";
}
class Hp extends Laptop
{
    int price = 34000;
    private long debitno;
    public void setMethod(long debitno)
    {
        this.debitno=debitno;
    }
    static {
        System.out.println("======================");
        System.out.println("         HP           ");
        System.out.println("======================");
    }
    Hp(){
        System.out.println("Processor: "+ps+"\n"+"Generation: "+gnrtn+"\nOperating System: "+os+"\nPrice: "+price+"rs");
    }

}
class Dell extends Laptop
{
    int price = 40000;
    private long debitno;
    public void setMethod(long debitno)
    {
        this.debitno=debitno;
    }
    static {
        System.out.println("======================");
        System.out.println("      dell            ");
        System.out.println("======================");
    }
    Dell(){
        System.out.println("Processor: "+ps+"\n"+"Generation: "+gnrtn+"\nOperating System"+os+"\nPrice"+price+"rs");
    }

}
class Mac extends Laptop
{
    int price = 60000;
    String os = "Mac OS";
    private long debitno;
    public void setMethod(long debitno)
    {
        this.debitno=debitno;
    }
    static {
        System.out.println("======================");
        System.out.println("         iMac         ");
        System.out.println("======================");
    }
    Mac()
    {
        System.out.println("Processor: "+ps+"\n"+"Generation: "+gnrtn+"\nOperating System: "+os+"\nPrice: "+price+"rs: ");
    }
}
class Asus extends Laptop
{
    int price = 40350;
    static {
        System.out.println("======================");
        System.out.println("      ASUS           ");
        System.out.println("======================");
    }
    Asus(){
        System.out.println("Processor: "+ps+"\n"+"Generation: "+gnrtn+"\nOperating System"+os+"\nPrice"+price+"rs");
    }
}
class Lenovo extends Laptop
{
    int price = 43540;
    static {
        System.out.println("======================");
        System.out.println("      Lenovo          ");
        System.out.println("======================");
    }
    Lenovo(){
        System.out.println("Processor: "+ps+"\n"+"Generation: "+gnrtn+"\nOperating System"+os+"\nPrice"+price+"rs");
    }
}
class Microsoft extends Laptop
{
    int price = 245540;
    static {
        System.out.println("======================");
        System.out.println("      Microsoft       ");
        System.out.println("======================");

    }
    Microsoft(){
        System.out.println("Processor: "+ps+"\n"+"Generation: "+gnrtn+"\nOperating System"+os+"\nPrice"+price+"rs");
    }
}
class Confirm{
    public static void confirm()
    {
        System.out.println("Should we proceed to payment");
        System.out.println("1.Y\t         2.N");
    }
}
class Edevice {
    static String name1 = "arun";
    static int pwd1 = 12345;

    public static String hexadecimal(int n)
    {
        String hex = "";
        int rem = 0;
        while(n!=0)
        {
            rem = n%16;
            switch (rem) {
                case 10: hex = "a" + hex;
                    break;
                case 11: hex = "b" + hex;
                    break;
                case 12: hex = "c" + hex;
                    break;
                case 13: hex = "d" + hex;
                    break;
                case 14: hex = "e" + hex;
                    break;
                case 15: hex = "f" + hex;
                    break;
                default: hex = rem + hex;
                    break;
            }
            n = n/16;
        }
        return hex;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Username: ");
        String name2 = sc.next();
        System.out.println("Password: ");
        int pwd2 = sc.nextInt();
        if(name1.equals(name2) && pwd1==pwd2) {
            System.out.println(" -------------------------------");
            System.out.println("|  Welcome to Electronic Store  |");
            System.out.println(" -------------------------------");
            System.out.println("Select the below Devices");
            System.out.println("1.Mobile\n2.Laptop");
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Enter range of price");
                    int r = sc.nextInt();
                    if (r >= 9000 && r <= 24000) {
                        System.out.println("Select brand");
                        sc.nextLine();
                        System.out.println("1.Redmi\n" + "2.Samsung\n" + "3.Nokia\n" + "4.Vivo\n" + "5.Oppo\n" + "6.Realme\n" + "7.Honar");
                        int i = sc.nextInt();
                        switch (i) {
                            case 1:
                                Redmi e1 = new Redmi();
                                e1.setCamera(64,13);
                                e1.getCamera();
                                e1.On();
                                e1.Operate();
                                e1.Off();
                                System.out.println("Enter 1 to buy");
                                int b1 = sc.nextInt();
                                System.out.println("Debit Card no.");
                                long rd = sc.nextLong();
                                e1.setMethod(rd);
                                System.out.println("Payment Successfully Completed");
                                System.out.println("transaction ID: "+hexadecimal(e1.hashCode()));
                                System.out.println("Enter 1 to get IMEI number");
                                int j = sc.nextInt();
                                switch (j) {
                                    case 1:
                                        e1.getImei();
                                        break;
                                    default:
                                        System.out.println("invalid number");
                                        break;
                                }
                                break;
                            case 2:
                                Samsang e2 = new Samsang();
                                e2.setCamera(50,8);
                                e2.getCamera();
                                e2.On();
                                e2.Operate();
                                e2.Off();
                                System.out.println("Enter 1 to buy");
                                int b2 = sc.nextInt();
                                System.out.println("Debit Card no.");
                                long sg = sc.nextLong();
                                e2.setMethod(sg);
                                System.out.println("Payment Successfully Completed");
                                System.out.println("transaction ID: "+hexadecimal(e2.hashCode()));
                                System.out.println("Enter 1 to get IMEI number");
                                int k = sc.nextInt();
                                switch (k) {
                                    case 1:
                                        e2.getImei();
                                        break;
                                    default:
                                        System.out.println("invalid number");
                                        break;
                                }
                                break;
                            case 3:
                                Nokia e3 = new Nokia();
                                e3.setCamera(13,8);
                                e3.getCamera();
                                e3.On();
                                e3.Operate();
                                e3.Off();
                                System.out.println("Enter 1 to buy");
                                int  b3 = sc.nextInt();
                                System.out.println("Debit Card no.");
                                long nk = sc.nextLong();
                                e3.setMethod(nk);
                                System.out.println("Payment Successfully Completed");
                                System.out.println("transaction ID: "+hexadecimal(e3.hashCode()));
                                System.out.println("Enter 1 to get IMEI number");
                                int l = sc.nextInt();
                                switch (l) {
                                    case 1:
                                        e3.getImei();
                                        break;
                                    default:
                                        System.out.println("invalid number");
                                        break;
                                }
                                break;
                            case 4:
                                Vivo e4 = new Vivo();
                                e4.setCamera(50,16);
                                e4.getCamera();
                                e4.On();
                                e4.Operate();
                                e4.Off();
                                System.out.println("Enter 1 to buy");
                                int b4 = sc.nextInt();
                                Confirm.confirm();
                                int c = sc.nextInt();
                                if(c==1) {
                                    System.out.println("Debit Card no.");
                                    long vv = sc.nextLong();
                                    e4.setMethod(vv);
                                    System.out.println("Payment Successfully Completed");
                                    System.out.println("transaction ID: " + hexadecimal(e4.hashCode()));
                                    System.out.println("Enter 1 to get IMEI number");
                                    int m = sc.nextInt();
                                    switch (m) {
                                        case 1:
                                            e4.getImei();
                                            break;
                                        default:
                                            System.out.println("invalid number");
                                            break;
                                    }
                                }if(c==0) {
                                System.out.println("Your Payment is canceled");
                                }
                                else {
                                System.out.println("invalid number");
                                }
                                break;
                            case 5:
                                Oppo e5 = new Oppo();
                                e5.setCamera(50,18);
                                e5.getCamera();
                                e5.On();
                                e5.Operate();
                                e5.Off();
                                System.out.println("Enter 1 to buy");
                                int b5 = sc.nextInt();
                                System.out.println("Debit Card no.");
                                long op = sc.nextLong();
                                e5.setMethod(op);
                                System.out.println("Payment Successfully Completed");
                                System.out.println("transaction ID: "+hexadecimal(e5.hashCode()));
                                System.out.println("Enter 1 to get IMEI number");
                                int n = sc.nextInt();
                                switch (n) {
                                    case 1:
                                        e5.getImei();
                                        break;
                                    default:
                                        System.out.println("invalid number");
                                        break;
                                }
                                break;
                            case 6:
                                Realme e6 = new Realme();
                                System.out.println(e6);
                                e6.setCamera(40,23);
                                e6.getCamera();
                                e6.On();
                                e6.Operate();
                                e6.Off();
                                System.out.println("Enter 1 to buy");
                                int b6 = sc.nextInt();
                                System.out.println("Debit Card no.");
                                long re = sc.nextLong();
                                e6.setMethod(re);
                                System.out.println("Payment Successfully Completed");
                                System.out.println("transaction ID: "+hexadecimal(e6.hashCode()));
                                System.out.println("Enter 1 to get IMEI number");
                                int o = sc.nextInt();
                                switch (o) {
                                    case 1:
                                        e6.getImei();
                                        break;
                                    default:
                                        System.out.println("invalid number");
                                        break;
                                }
                                break;
                            case 7:
                                Honar e7 = new Honar();
                                e7.setCamera(54,25);
                                e7.getCamera();
                                e7.On();
                                e7.Operate();
                                e7.Off();
                                System.out.println("Enter 1 to buy");
                                int b7 = sc.nextInt();
                                System.out.println("Debit Card no.");
                                long hn = sc.nextLong();
                                e7.setMethod(hn);
                                System.out.println("Enter 1 to get IMEI number");
                                int p = sc.nextInt();
                                switch (p) {
                                    case 1:
                                        e7.getImei();
                                        break;
                                    default:
                                        System.out.println("invalid number");
                                        break;
                                }
                                break;
                            default:
                                System.out.print("Invalid number");
                                break;
                        }
                        break;
                    } else {
                        if (r >= 30000 && r <= 100000) {
                            System.out.println("Apple series");
                            {
                                System.out.println("1.iphone 11\n2.iphone 12\n3.iphone 13\n4.iphone pro max");
                                int s = sc.nextInt();
                                switch (s) {
                                    case 1:
                                        iphone11 i11 = new iphone11();
                                        i11.setCamera(34,12);
                                        i11.getCamera();
                                        i11.On();
                                        i11.Operate();
                                        i11.Off();
                                        System.out.println("Enter 1 to buy");
                                        int b1 = sc.nextInt();
                                        System.out.println("Debit Card no.");
                                        long i1 = sc.nextLong();
                                        i11.setMethod(i1);
                                        break;
                                    case 2:
                                        iphone12 i12 = new iphone12();
                                        i12.setCamera(36,15);
                                        i12.getCamera();
                                        i12.On();
                                        i12.Operate();
                                        i12.Off();
                                        System.out.println("Enter 1 to buy");
                                        int b2 = sc.nextInt();
                                        System.out.println("Debit Card no.");
                                        long i2 = sc.nextLong();
                                        i12.setMethod(i2);
                                        break;
                                    case 3:
                                        iphone13 i13 = new iphone13();
                                        i13.setCamera(32,23);
                                        i13.getCamera();
                                        i13.On();
                                        i13.Operate();
                                        i13.Off();
                                        System.out.println("Enter 1 to buy");
                                        int b3 = sc.nextInt();
                                        System.out.println("Debit Card no.");
                                        long i3 = sc.nextLong();
                                        i13.setMethod(i3);
                                        break;
                                    case 4:
                                        iphone13promax i13pm = new iphone13promax();
                                        i13pm.setCamera(45,26);
                                        i13pm.getCamera();
                                        i13pm.On();
                                        i13pm.Operate();
                                        i13pm.Off();
                                        System.out.println("Enter 1 to buy");
                                        int b4 = sc.nextInt();
                                        System.out.println("Debit Card no.");
                                        long i4 = sc.nextLong();
                                        i13pm.setMethod(i4);
                                        break;
                                    default:
                                        System.out.println("Invalid number");
                                        break;
                                }
                            }
                        }
                        else {
                            System.out.println("Not Found");
                        }
                    }
                    break;
                case 2:
                    System.out.println("select laptop brand");
                    System.out.println("1.HP\n2.DELL\n3.MAC");
                    int v = sc.nextInt();
                    switch (v) {
                        case 1:
                            Hp hp1 = new Hp();
                            hp1.On();
                            hp1.Operate();
                            hp1.Off();
                            System.out.println("Enter 1 to buy");
                            int b1 = sc.nextInt();
                            System.out.println("Debit Card no.");
                            long l1 = sc.nextLong();
                            hp1.setMethod(l1);
                            break;
                        case 2:
                            Dell dl = new Dell();
                            dl.On();
                            dl.Operate();
                            dl.Off();
                            System.out.println("Enter 1 to buy");
                            int b2 = sc.nextInt();
                            System.out.println("Debit Card no.");
                            long l2 = sc.nextLong();
                            dl.setMethod(l2);
                            break;
                        case 3:
                            Mac mc = new Mac();
                            mc.On();
                            mc.Operate();
                            mc.Off();
                            System.out.println("Enter 1 to buy");
                            int b3 = sc.nextInt();
                            System.out.println("Debit Card no.");
                            long l3 = sc.nextLong();
                            mc.setMethod(l3);
                            break;
                        default:
                            System.out.println("invalid number");
                            break;
                    }
                    break;
                default:
                    System.out.print("Invalid number");
                    break;
            }
        }else {
            System.out.println("Username & Password is not match");
        }
    }
}