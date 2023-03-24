class ObjectCreation
{
    int age;            //Object knows  
    String name;      //Object knows
    public static void main(String []args)
    {
        //declare the Variable
        //create an object
        int num=9;
        ObjectCreation obj1 = new ObjectCreation();
        ObjectCreation obj2 = new ObjectCreation();
        
        obj1.name ="Navin";
        obj1.age = 16;
        obj2.name="Suvrat";
        obj2.age =22;

        System.out.println(obj1.age);
        System.out.println(obj1.name);


        System.out.println(obj2.age);
        System.out.println(obj2.name);

    }
}
