class LocalVar
{
    int age;            //Object knows       //Innstance Variable
    String name;      //Object knows     //Innstance Variable
    public static void main(String []args)
    {
        //declare the Variable
        //create an object
        int num=9;                             //Local Variable

        System.out.println(num);
        LocalVar obj1 = new LocalVar();
        LocalVar obj2 = new LocalVar();
        
        obj1.name ="Navin";
        obj1.age = 15;
        obj2.name="Suvrat";
        obj2.age =22;

        System.out.println(obj1.age);
        System.out.println(obj1.name);


        System.out.println(obj2.age);
        System.out.println(obj2.name);

    }
}
