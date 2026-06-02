class Animal {

    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

class p18 extends Animal {

    void makeSound() {
        System.out.println("Bark");
    }

public static void main(String[] args) {

        Animal a = new p18();

        a.makeSound();
    }
}