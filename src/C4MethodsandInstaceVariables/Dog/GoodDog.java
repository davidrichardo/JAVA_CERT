package C4MethodsandInstaceVariables.Dog;

class GoodDog {
    private int size;

    public int getSize(){
        return size;
    }

    public void setSize(int s){
        size = s;
    }

    void bark(){
        if(size > 60){
            System.out.println("Woof! Woof! Woof! Woof!");
        }else if(size > 14){
            System.out.println("Ruff! Ruff! Ruff! Ruff!");
        }else{
            System.out.println("Yipp! Yipp! Yipp!");
        }
    }
}

class PoorDog{
    private int size;
    private String name;

    public int getSize(){
        return size;
    }
    public String getName(){
        return name;
    }

    public void setSize(int s){
        size = s;
    }

    public void setName(String n){
        name = n;
    }
}

class PoorDogTestDrive{
    public static void main(String[] args) {
        PoorDog poorDog = new PoorDog();
        System.out.println(poorDog.getSize());
        System.out.println(poorDog.getName());
    }
}

class GoodDogDriveTest{
    public static void main(String[] args) {
        GoodDog one = new GoodDog();
        GoodDog two = new GoodDog();
        one.setSize(70);
        two.setSize(20);

        System.out.println("Dog One: " + one.getSize());
        System.out.println("Dog Two: " + two.getSize());

        one.bark();
        two.bark();
    }
}
