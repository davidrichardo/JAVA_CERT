package C3Variables.Hobbits;

public class Hobbits {
    String name;

    public static void main(String[] args) {
        Hobbits[] h = new Hobbits[3];

        int z = 0;

        while (z<2){
            z = z+1;
            h[z] = new Hobbits();
            h[z].name = "Bilbo";
            if(z == 1){
                h[z].name = "Frodo";
            }
            if(z == 2){
                h[z].name = "Sam";
            }
            System.out.println(h[z].name + " Is a ");
            System.out.println("Good Hobbit name");
        }
    }
}
