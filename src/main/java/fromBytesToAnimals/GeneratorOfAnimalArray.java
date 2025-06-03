package fromBytesToAnimals;

import java.io.*;

public class GeneratorOfAnimalArray {

    static byte[] AnimalArrayToByteArray(Animal[] animals) {
        int number = animals.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (ObjectOutputStream output = new ObjectOutputStream(byteArrayOutputStream)) {
            output.writeInt(number);
            for (Animal animal : animals) {
                try {
                    output.writeObject(animal);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            output.flush();
            output.close();
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
