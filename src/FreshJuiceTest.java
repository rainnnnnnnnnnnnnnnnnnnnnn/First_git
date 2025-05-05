class FreshJuice {
    enum FreshJuiceSize{ SMALL, MEDIUM , LARGE }
    FreshJuiceSize size;
 }
  
 public class FreshJuiceTest {
    public static void main(String[] args){
       FreshJuice juice = new FreshJuice();
       juice.size = FreshJuice.FreshJuiceSize.MEDIUM  ;
      //  System.out.println("命令行参数");
      //  for (String arg:args)
      //  {
      //    System.out.println(arg);
      //  }
      //  System.out.println("hello");
      int i =128;   
      byte b = (byte)i;
      System.out.println(b);
    }
 }