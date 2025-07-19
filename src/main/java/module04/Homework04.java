package module04;

public class Homework04 {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Рекс", Breed.LABRADOR, 4);
        Dog dog2 = new Dog("Дік", Breed.HUSKY, 3);
        Dog dog3 = new Dog("Патрон", Breed.JACK_RUSSELL_TERRIER, 5);

        if (dog1.name.equals(dog2.name) || dog1.name.equals(dog3.name) || dog2.name.equals(dog3.name)) {
            System.out.println("Знайдено собак з однаковими іменами!");
        } else {
            System.out.println("Собак з однаковими іменами немає.");
        }

        System.out.println("---");

        Dog oldestDog = dog1;
        if (dog2.age > oldestDog.age) {
            oldestDog = dog2;
        }
        if (dog3.age > oldestDog.age) {
            oldestDog = dog3;
        }

        System.out.println("Найстарша собака:");
        System.out.println("Ім'я: " + oldestDog.name);
        System.out.println("Порода: " + oldestDog.breed);
    }
}

class Dog {
    String name;
    Breed breed;
    int age;

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }
}
enum Breed{
    HUSKY,
    LABRADOR,
    JACK_RUSSELL_TERRIER
}