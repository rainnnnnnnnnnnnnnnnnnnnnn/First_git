class Puppy{
    private String name;
    private int age; 
    // 构造器
    public Puppy(){
    }
 
    public Puppy(String name,int age){
        // 这个构造器仅有一个参数：name
        this.name=name;
        this.age=age;
    }

    public void Printpuppy()
    {
        System.out.println("Puppyname:"+name);
        System.out.println("Puppyage:"+age);
    }
}
// 公共类
public class PuppyTest{
    // 主函数
    public static void main(String[] args)
    {
        Puppy doudou=new Puppy("doudou",3);
        doudou.Printpuppy();
    }
}