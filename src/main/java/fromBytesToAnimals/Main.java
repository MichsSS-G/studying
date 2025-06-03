package fromBytesToAnimals;

import java.io.*;

public class Main {


    public static Animal[] deserializeAnimalArray(byte[] data) {
        int number;
        Animal[] result;
        try (ObjectInputStream input = new ObjectInputStream(new ByteArrayInputStream(data))) {
            number = input.readInt();
            result = new Animal[number];
            for (int i = 0; i < number; ++i) {
                try {
                    result[i] = (Animal) input.readObject();
                }
                catch (Exception e) {
                    throw new IllegalArgumentException(e);
                }
            }
        }
        catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
        return result;
    }

    public static void main(String[] args) {
        byte[] byteArr = GeneratorOfAnimalArray.AnimalArrayToByteArray(new Animal[] {new Animal("Murzik"), new Animal("Bobik"), new Animal("Sharik")});
//        byte[] byteArr = GeneratorOfAnimalArray.AnimalArrayToByteArray(new Animal[] {null});
        Animal[] animals = deserializeAnimalArray(byteArr);
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
