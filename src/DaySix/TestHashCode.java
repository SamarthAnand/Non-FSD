package DaySix;

class TestHashCode{
    public TestHashCode(int a, int b){

    }



    public static void main(String[] args){
        String a = "Andrew";
        String b = "Andrew";

        TestHashCode t1 = new TestHashCode(10,20);
        TestHashCode t2 = new TestHashCode(10,20);

        System.out.println(t1.equals(t2));


        if(a.equals(b)){   //checking the equality of objects using equals() methods
            System.out.println("a & b are equal variables, and their respective hashvalues are:" + " "+ a.hashCode() + " & " + b.hashCode());

        }

        String c = "Marie";
        String d= "Julie";

        if(!c.equals(d)){    //checking  the equality of objects using equals() method
            System.out.println("\nc & d are Un-equal variables, and their respective hashvalues are:" + " "+ c.hashCode() + " & " + d.hashCode());

        }
    }
}