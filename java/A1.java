

class Animal{
    void Sound(){
        System.out.println("Sound of Animals");
    }
    boolean hasLife(){
        return true;
    }
    boolean hasTail(){
        return true;
    }
    int noOfEyes(){
        return 2;
    }
    int noOfLegs(){
        return 4;
    }
}

class Dog extends Animal{
    void Sound(){
        System.out.println("Barking");
    }
}
class Tiger extends Animal{
    void Sound(){
        System.out.println("Roaring");
    }
}


public class A1{
    public static void main(String[] arg){
        Dog ob = new Dog();
        ob.Sound();
        Tiger ob1 = new Tiger();
        ob1.Sound();

    }
}