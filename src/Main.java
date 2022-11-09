public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Davran", "Developer", "Peaksoft");
        System.out.println(programmer);
        programmer.coding();
        programmer.learn();
        programmer.eat();
        programmer.walk();
        System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\n");


        Dancer dancer = new Dancer("Michael Flatley", "Tango", "Grand Show");
        System.out.println(dancer);
        dancer.dancing();
        dancer.learn();
        dancer.eat();
        dancer.walk();
        System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\n");
        Singer singer = new Singer("Miyagi", "Hip-hop+Rap", "MiyaGi + Andy Panda");
        System.out.println(singer);
        singer.singing();
        singer.playGitar();
        dancer.learn();
        dancer.eat();
        dancer.walk();
    }
}
