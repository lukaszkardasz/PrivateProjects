package nauka.training.core.inOut.serialization.serializationExercise;

import java.io.*;

class Human implements Serializable {

    private static final long serialVersionUID = 1L; //ważny parametr w serializacji

    private transient Integer age; //nie będzie serializowane bo transient
    private String name;

    public Human(String name, Integer age) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Human human = new Human("Krzysiek", 21);

        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("human.bin"))) {
            output.writeObject(human);
        }

        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("human.bin"))) {
            Human readHuman = (Human) input.readObject();
            System.out.println(readHuman.getName());
            System.out.println(readHuman.getAge()); //null bo jest to wartość domyslna dla atrybutów poprzedzonych słowem kluczowym transient, które są obiektami.
        }
    }
}
