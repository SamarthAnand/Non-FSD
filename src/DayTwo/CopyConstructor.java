package DayTwo;
class Test{
    int a;
    int b;
    public Test(int a, int b){
        this.a = a;
        this.b = b;
    }

}
public class CopyConstructor implements Cloneable {
    int id;
    String name;

    int a;
    int b;
    Test test = new Test(a,b);

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    public CopyConstructor(){

    }

    public CopyConstructor(int id, String name ){
        this.id = id;
        this.name = name;
    }
    public CopyConstructor(CopyConstructor c2){
        id = c2.id;
        name = c2.name;
    }

    void display(){
        System.out.println(id+" "+name);
    }
    public static void main(String[] args)throws CloneNotSupportedException {

        CopyConstructor cp2 = new CopyConstructor();
        cp2.a = 10;
        cp2.b = 20;


        CopyConstructor cp = new CopyConstructor(101, "Nidu");

    }

}

