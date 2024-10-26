package RuntimePoly;

class GreatGrandFater{
    void feature()
    {
        System.out.println("Great Grand Father");
    }
};

class GrandFather extends GreatGrandFater
{
    void feature()
    {
        System.out.println("Grand Father");
    }
};

class Father extends GrandFather
{
    void feature()
    {
        System.out.println("Father");
    }
};

class Son extends Father{
    void feature()
    {
        System.out.println("Son");
    }
}


public class Gen{
    public static void main(String[] args)
    {
        GreatGrandFater obj=new GreatGrandFater();
        obj.feature();

        obj=new GrandFather();
        obj.feature();

        obj=new Son();
        obj.feature();


    }
}