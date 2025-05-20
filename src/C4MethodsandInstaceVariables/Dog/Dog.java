package C4MethodsandInstaceVariables.Dog;

class Dog {
    int size;
    String name;

    void bark(){
        if(size > 60){
            System.out.println("!Guau !Guau");
        }else if(size > 14){
            System.out.println("Ruff !Ruff");
        }else{
            System.out.println("Yipp !Yipp");
        }
    }
}

class DogTestDrive{
    public static void main(String[] args) {
        Dog one = new Dog();
        one.size = 70;
        Dog two = new Dog();
        two.size = 20;
        Dog three = new Dog();
        three.size = 8;

        one.bark();
        two.bark();
        three.bark();
    }
}
