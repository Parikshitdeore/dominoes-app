import java.util.Scanner;

interface Dominos{
}

interface customer extends Dominos{
}

interface order extends Dominos{
}

class details implements customer,order {
  String name;
  private long mobnum;
  details() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your Name");
    String name = scan.nextLine();
    System.out.println("Enter your Mobile number");

    mobnum = scan.nextLong();
    System.out.println("Your entered mobile number is : +91" + mobnum + " , Please check OTP message on your Mobile");
    System.out.println("");
    System.out.println("Please Enter the 4-digit OTP send to your Mobile Number");
    short otp;
    otp = scan.nextShort();
    this.name = name;
    System.out.println("******************************************");
    System.out.println("");
    }
}

class login extends details {
  login() {
    super();
    System.out.println("Login Successful!");
    System.out.println("");
    System.out.println("Welcome " + name + " , You are now ready to place your order");
    System.out.println("");
    System.out.println("====== Welcome back to Domino's ====="); // welcoming already registered customers
    System.out.println("");
    System.out.println("******************************************");
  }
}

 class signup extends details {
  signup() {
    super();
    System.out.println("******************************************");
    System.out.println("");
    System.out.println("You have successfully created a new account");
    System.out.println("");
    System.out.println("====== Welcome to Domino's =====");
    System.out.println("");
    System.out.println("******************************************");
  }
}

class menu implements order,customer {
  }
// pizza name, size, price, pizza info?, // super most class
class sides extends menu {
}

class desserts extends menu {
}


class size extends menu {
  //Variables for selected items and size 
  String sp;//selected pizza
  String ss;//selected size
  String bss;//beverage selected size
  String sbs;//selected party combo
  String spc;// selected beverages
  String sbev;
  String sdes;

  public void size_sel() {  // CALL THIS METHOD FOR SIZE SELECTION
    int p;
    do {
      System.out.println("====Please select size===");
      System.out.println("1. Regular  ( 4 slices Serves 1)");
      System.out.println("2. Medium   ( 6 slices Serves 2-3)");
      System.out.println("3. Large    ( 8 slices Serves 3-5)");
      Scanner scan = new Scanner(System.in);
      int siz = scan.nextInt();
      p = 0;
      switch (siz) // Options for Size
      {
      case 1:
        ss="Regular";
        Dominoes.ss=ss;
        //System.out.println("You have selected "+this.ss);
        break;
      case 2:
        ss="Medium";
        Dominoes.ss=ss;
        //System.out.println("You have selected "+this.ss);
        break;
      case 3:
        ss="Large";
        Dominoes.ss=ss;
        //System.out.println("You have selected "+this.ss);
        break;
      default:
        System.out.println("Please enter a proper input");
        p = 1;

      }
    }
    while (p == 1);

  }

public void bev_size_sel() {       // CALL THIS METHOD FOR BEVERAGE SIZE SELECTION
  int p;
  do {
    System.out.println("====Please select size===");
    System.out.println("1. Regular  (200ml) ");
    System.out.println("2. Medium   (350ml) ");
    System.out.println("3. Large    (600ml) ");
    Scanner scan = new Scanner(System.in);
    int siz = scan.nextInt();
    p = 0;
    switch (siz) // Options for Size
    {
    case 1:
      bss="Regular (200ml)";
      Dominoes.bss=bss;
      //System.out.println("You have selected "+this.bss);
      break;
    case 2:
      bss="Medium (350ml)";
      Dominoes.bss=bss;
      //System.out.println("You have selected Medium "+this.bss);
      break;
    case 3:
      bss="Large (600ml)";
      Dominoes.bss=bss;
      //System.out.println("You have selected "+this.bss);
      break;
    default:
      System.out.println("Please enter a proper input");
      p = 1;
    }
  } while (p == 1);
}
public void final_order() // Use this method for final order
  {
  System.out.println("");
  //to check
  //System.out.println("-"+Dominoes.sp+" "+Dominoes.ss);
  //System.out.println("-"+Dominoes.sbev+" "+Dominoes.bss);
  //System.out.println("-"+Dominoes.sdes);
  System.out.println("Your Orders");
  System.out.println("");
  if(Dominoes.sp!=null) {
  System.out.println(Dominoes.sp+" "+Dominoes.ss+" size");
  }

  if(Dominoes.sbev!=null) {
    System.out.println(Dominoes.sbev+" "+Dominoes.bss+" size");
}

  if(Dominoes.sdes!=null) {
    System.out.println(Dominoes.sdes);
  }
    System.out.println("");
    System.out.println("Do you want to Change your Pizza or Order anything else?");
    System.out.println("Press 1 to Change your selected Pizza");
    System.out.println("Press 2 for Order sides");
    System.out.println("Press 3 to Confirm your order");
    Scanner scan = new Scanner(System.in);
    int yn = scan.nextInt();
    switch (yn) {
    case 1:Dominoes.part2();

      break;
    case 2:Dominoes.part3();

    break;

    default:
      System.out.println("Your order has been confirmed");
      System.out.println("");
      System.out.println("Your Orders : ");
      System.out.println("");
    if(Dominoes.sp!=null) {
    System.out.println(Dominoes.sp+" "+Dominoes.ss+" size");
    }

    if(Dominoes.sbev!=null) {
      System.out.println(Dominoes.sbev+" "+Dominoes.bss+" size");
  }

    if(Dominoes.sdes!=null) {
      System.out.println(Dominoes.sdes);
    }
    System.out.println();

    break;
    }


  }
  }

class Veg extends size {
  Veg() {
    super();
  }
}


class Nonveg extends size {
  Nonveg() {
  }
}


//Driver class
class Dominoes {
  public long getMobnum() 
    {
      return getMobnum();
     }
  static String ss; //selected size
  static String bss;// beverage selected size
  static String sp;//selected pizza
  static String spc;//selected party combo
  static String sbs;//selected best seller
  static String sbev;//selected beverage
  static String sdes;//selected dessert
  static String p;//pizza
  static String ps;//pizza size
  static String bev;//beverage
  static String bs;//beverage size
  static String des;//dessert
  static int last;

  public static void part1() {

    size piz = new size();
    // 1st phase (signup or login)
    System.out.println();
    System.out.println("Welcome to Dominoes Pizza!!!");
    System.out.println();
    System.out.println("*******************************");
    System.out.println();
    Scanner scan = new Scanner(System.in);
    System.out.println("Press Enter to Start!");
    System.out.println();
    String start = scan.nextLine();

    System.out.println("Press 1 to Login");
    System.out.println("Press 2 to Signup");

    int i = 0;
    do {
      int login = scan.nextInt();
      i = 0;
      switch (login) {
      case 1:
        details l1 = new login();
        break;
      case 2:
        details l2 = new signup();
        break;
      default:
        System.out.println("Please enter a proper input");
        i = 1;
      }
    } while (i == 1);
  }
  public static void part2() {
    Scanner scan = new Scanner(System.in);
    size piz = new size();


    System.out.println("Press 1 for Veg Pizza");
    System.out.println("Press 2 for Non-Veg Pizza");
    System.out.println("Press 3 for Bestsellers");

    int o = 0;
    do {
      int vnv = scan.nextInt();
      o = 0;
      switch (vnv) // Options for Veg nonveg
      {
      case 1:
        int v;
        do {
          System.out.println("Press 1 for Margherita");
          System.out.println("Press 2 for Farmhouse");
          System.out.println("Press 3 for Veggie Paradise");
          System.out.println("Press 4 for Cheese and corn");
          System.out.println("Press 5 for Veg Extravaganza");
          System.out.println("Press 6 for The Cheese Dominator");
          int sw = scan.nextInt();
          v=0;
          switch (sw) // Options for Veg Pizza
          {
          case 1:
            sp = "Margherita";
            piz.sp=sp;
            System.out.println("You have selected "+piz.sp);
            piz.size_sel();
            piz.final_order();
            break;
          case 2:
            sp = "Farmhouse";
            piz.sp=sp;
            System.out.println(piz.sp);
            System.out.println("You have selected "+piz.sp);
            piz.size_sel();
            piz.final_order();
            break;
          case 3:
            sp = "Veggie paradise";
            piz.sp=sp;
            System.out.println(piz.sp);
            System.out.println("You have selected "+piz.sp);
            piz.size_sel();
            piz.final_order();
            break;
          case 4:
            sp="Cheese n Corn";
            piz.sp=sp;
            System.out.println(piz.sp);
            System.out.println("You have selected "+piz.sp);
            piz.size_sel();
            piz.final_order();
            break;
          case 5:
            sp="Veg Extravaganza";
            piz.sp=sp;
            System.out.println(piz.sp);
            System.out.println("You have selected "+piz.sp);
            piz.size_sel();
            piz.final_order();
            break;
          case 6:
            sp="The Cheese Dominator";
            piz.sp=sp;
            System.out.println(piz.sp);
            System.out.println("You have selected "+piz.sp);
            piz.size_sel();
            piz.final_order();
            break;
          default:
            System.out.println("Please enter a proper input");
            v = 1;
          }
        } while (v == 1);
        break;
      case 2:
        int nv;
        do {
          System.out.println("Press 1 for Chicken Sausage");
          System.out.println("Press 2 for Chicken Fiesta");
          System.out.println("Press 3 for Pepper Barbecue Chicken");
          System.out.println("Press 4 for Indi Chicken tikka");
          System.out.println("Press 5 for Non Veg Supreme");
          System.out.println("Press 6 for Chicken Dominator");
          int sw = scan.nextInt();
          nv = 0;
          switch (sw) // Options for Veg Pizza
          {
          case 1:
            sp="Chicken Sausage";
            piz.sp=sp;
            System.out.println(piz.sp);
            System.out.println("You have selected Chicken Sausage");
            piz.size_sel();
            piz.final_order();

            break;
          case 2:
            sp="Chicken Fiesta";
            piz.sp=sp;
            System.out.println(piz.sp);
            System.out.println("You have selected Chicken Fiesta");
            piz.size_sel();
            piz.final_order();
            break;
          case 3:
            sp="Barbecue Chicken";
            piz.sp=sp;
            System.out.println(piz.sp);
            System.out.println("You have selected Pepper Barbecue Chicken");
            piz.size_sel();
            piz.final_order();
            break;
          case 4:
            sp="Indi Chicken Tikka";
            piz.sp=sp;
            System.out.println(piz.sp);
            System.out.println("You have selected Indi Chicken Tikka");
            piz.size_sel();
            piz.final_order();
            break;
          case 5:
            sp="Non-Veg Supreme";
            piz.sp=sp;
            System.out.println(piz.sp);
            System.out.println("You have selected Non-Veg Supreme");
            piz.size_sel();
            piz.final_order();
            break;
          case 6:
            sp="The Chicken Dominator";
            piz.sp=sp;
            System.out.println(piz.sp);
            System.out.println("You have selected The Chicken Dominator");
            piz.size_sel();
            piz.final_order();
            break;
          default:
            System.out.println("Please enter a proper input");
            nv = 1;
          }
        } while (nv == 1);
        break;
      case 3:
        int bs;
        do {
          System.out.println("* = Vegeaterian options");
          System.out.println("Press 1 for Veg loaded*");
          System.out.println("Press 2 for Non veg loaded");
          System.out.println("Press 3 for Chicken Maximus");
          System.out.println("Press 4 for The Chicken Dominator");
          System.out.println("Press 5 for The Cheese Dominator*");
          int sw = scan.nextInt();
          bs = 0;
          switch (sw) // Options for Party combo
          {
          case 1:
            sbs="Veg loaded";
            piz.sp=sbs;
            System.out.println(piz.sp);
            System.out.println("You have selected Veg loaded");
            piz.size_sel();
            piz.final_order();
            break;
          case 2:
            sbs="Non veg loaded";
            piz.sp=sbs;
            System.out.println(piz.sp);
            System.out.println("You have selected Non veg loaded");
            piz.size_sel();
            piz.final_order();
            break;
          case 3:
            sbs="Chicken Maximus";
            piz.sp=sbs;
            System.out.println(piz.sp);
            System.out.println("You have selected Chicken Maximus");
            piz.size_sel();
            piz.final_order();
            break;
          case 4:
            sbs="The Chicken Dominator";
            piz.sp=sbs;
            System.out.println(piz.sp);
            System.out.println("You have selected The Chicken Dominator");
            piz.size_sel();
            piz.final_order();
            break;
          case 5:
            sbs="The Cheese Dominator*";
            piz.sp=sbs;
            System.out.println(piz.sp);
            System.out.println("You have selected The Cheese Dominator* ");
            piz.size_sel();
            piz.final_order();
            break;
          default:
            System.out.println("Please enter a proper input");
            bs = 1;
          }
        } while (bs == 1);
        break;
      default:
        System.out.println("Please enter a proper input");
        o = 1;
      }
    } while (o == 1);

  }
  public static void part3() {
    Scanner scan = new Scanner(System.in);
    size piz = new size();

    System.out.println("Press 1 for Beverages");
    System.out.println("Press 2 for Dessert");
    System.out.println("Press 3 to Continue to Payment");
    int o = 0;
    do {
      int vnv = scan.nextInt();
      o = 0;
      switch (vnv) // Options for Veg nonveg
      {
      case 1:
        int bev;
        do {
          System.out.println("Press 1 for Coca-Cola");
          System.out.println("Press 2 for Pepsi");
          System.out.println("Press 3 for Diet Coke");
          System.out.println("Press 4 for Chocolate Smoothie");
          System.out.println("Press 5 for Fruit Punch");
          int sw = scan.nextInt();
          bev = 0;
          switch (sw) // Options for Party combo
          {
          case 1:
            sbev="Coca-cola";
            piz.sbev=sbev;
            System.out.println("You have selected "+piz.sbev);
            piz.bev_size_sel();
            piz.final_order();
            break;
          case 2:
            sbev="Pepsi";
            piz.sbev=sbev;
            System.out.println("You have selected "+piz.sbev);
            piz.bev_size_sel();
            piz.final_order();
            break;
          case 3:
            sbev="Diet Coke";
            piz.sbev=sbev;
            System.out.println("You have selected "+piz.sbev);
            piz.bev_size_sel();
            piz.final_order();
            break;
          case 4:
            sbev="Chocolate smoothie";
            piz.sbev=sbev;
            System.out.println("You have selected "+piz.sbev);
            piz.bev_size_sel();
            piz.final_order();
            break;
          case 5:
            sbev="Fruit Punch";
            piz.sbev=sbev;
            System.out.println("You have selected "+piz.sbev);
            piz.bev_size_sel();
            piz.final_order();
            break;
          default:
            System.out.println("Please enter a proper input");
            bev = 1;
          }
        } while (bev == 1);
        break;
      case 2:
        int des=0;
        do {
          System.out.println("Press 1 for Choco Lava Cake ");
          System.out.println("Press 2 for Red Velvet Lava Cake");
          System.out.println("Press 3 for Butterscotch Mousse Cake");
          System.out.println("Press 4 for Brownie Fantasy");
          System.out.println("Press 5 for Oreo Fantasy");
          int sw = scan.nextInt();
          des = 0;
          switch (sw) // Options for Party combo
          {
          case 1:
            sdes="Choco Lava Cake";
            piz.sdes=sdes;
            System.out.println("You have selected Choco Lava Cake");
            piz.final_order();
            break;
          case 2:
            sdes="Red Velvet Lava Cake";
            piz.sdes=sdes;
            System.out.println("Red Velvet Lava Cake");
            piz.final_order();
            break;
          case 3:
            sdes="Butterscotch Mousse Cake";
            piz.sdes=sdes;
            System.out.println("You have selected Butterscotch Mousse Cake");
            piz.final_order();
            break;
          case 4:
            sdes="Brownie Fantasy";
            piz.sdes=sdes;
            System.out.println("You have selected Brownie Fantasy ");
            piz.final_order();
            break;
          case 5:
            sdes="Oreo Fantasy";
            piz.sdes=sdes;
            System.out.println("You have selected Oreo Fantasy");
            piz.final_order();
            break;
          default:
            System.out.println("Please enter a proper input");
          des = 1;
          }
        } while (des==1);
        break;
      default:
        //System.out.println("Please enter a proper input");
        o = 1;
      }
    } while (o >= 2);

  }
  public static void part4() {
    System.out.println("Select your payment option");
    System.out.println("Press 1 for UPI");
    System.out.println("Press 2 for Cash on Delievery");
    Scanner scan= new Scanner(System.in);
    int i = 0;
    do {
      int pay  = scan.nextInt();
      i = 0;
      switch (pay) {
      case 1:	System.out.println("Press 1 for G-pay");
                System.out.println("Press 2 Phonepe");
        int j = 0;
      do {
        int upi  = scan.nextInt();
        i = 0;
        switch (upi) {
        case 1:System.out.println("You have selected G-Pay");
        System.out.println();
        System.out.println("Enter your Gpay id");
        String gpay= scan.next();
        System.out.println("");
        System.out.println("Your Gpay id is "+gpay);
        System.out.println("");
        Scanner googlepay  = new Scanner(System.in);
        System.out.println("Press Enter to Continue if payment is completed");
        String lastG = googlepay.nextLine();
          break;
        case 2:
        System.out.println("You have selected Phonepe");
        System.out.println("Enter your Phonepe id");
        System.out.println();
        String ppay= scan.next();
        System.out.println("");
        System.out.println("Your PhonePe id is "+ppay);
        System.out.println("");
        Scanner phonepe  = new Scanner(System.in);
        System.out.println("Press Enter to Continue if payment is completed");
        String lastP = phonepe.nextLine();
        break;
        
        default:
          System.out.println("Please enter a proper input");
          i = 1;
        }
      } while (i == 1);
        break;
        
      case 2:System.out.println("Payment will be collected on Delivery, Keep the Cash Ready!");
      break;

      default:
        System.out.println("Please enter a proper input");
        i = 1;
      }
    } while (i == 1);
  }

  public static void main(String[] args) {
    part1();
    part2();
    part3();
    part4();
    System.out.println();
    System.out.println("**************Thank you for ordering from Dominoes**************");
  }

}
  /*System.out.println("Thank you for ordering");
 * System.out.print(this_pizza); System.out.println(this.bev);
 * System.out.println(this_pizza2); //optional if (extra=1); {
 * System.out.println(this_extra); } 3. int n = 0; do { int nveg =
 * scan.nextInt(); n = 0; switch (nveg) { n=0; case 1: Nonveg nv1 = // new pizza
 * name(); break; case 2: Nonveg nv2 = //new pizza name(); break; default:
 * System.out.println("Please enter a proper input"); n = 1; } while (n == 1); }
 * break;
 * use if else in final order for veg nonveg give variable in switch 0,1 
 * 
 * Updated Program. 05/01/2024
*/
