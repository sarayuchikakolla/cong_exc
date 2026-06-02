interface Playable {
    void play();
}

class Guitar implements Playable {

    public void play() {
        System.out.println("Playing Guitar");
    }
}

class p19 implements Playable {

    public void play() {
        System.out.println("Playing Piano");
    }

    public static void main(String[] args) {

        Guitar g = new Guitar();
        p19 p19 = new p19();
        g.play();
        p19.play();
    }
}