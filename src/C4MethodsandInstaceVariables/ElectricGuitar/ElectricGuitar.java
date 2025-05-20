
package C4MethodsandInstaceVariables.ElectricGuitar;

public class ElectricGuitar {
    String brand;
    int numOgPickups;
    boolean rockStartUsesIt;

    String getBrand(){
        return brand;
    }

    void setBrand(String aBrand){
        brand = aBrand;
    }

    int getNumOgPickups(){
        return numOgPickups;
    }

    void setNumOgPickups(int aNumOgPickups){
        numOgPickups = aNumOgPickups;
    }

    boolean getRockStartUsesIt(){
        return rockStartUsesIt;
    }

    void setRockStartUsesIt(boolean aRockStartUsesIt){
        rockStartUsesIt = aRockStartUsesIt;
    }
}
