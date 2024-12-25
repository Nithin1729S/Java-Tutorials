class Dog{
    private
        String color="Blue";
    public
        void setColor(String color){
            this.color=color;
        }
        String getColor(){
            return color;
        }

}

class Edgar extends Dog{
    void bark(){
        System.out.println("BOW");
    }
}
public class Main{
    public static void main(String[] args){
        Dog rottweiler=new Dog();
        System.out.println(rottweiler.getColor());
        rottweiler.setColor("Black");
        System.out.println(rottweiler.getColor());
        Edgar edgar = new Edgar();
        edgar.getColor();

    }
    
}