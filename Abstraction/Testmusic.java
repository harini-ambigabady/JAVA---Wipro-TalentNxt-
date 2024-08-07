interface Playable {
    void play();
}
class Veena implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the Veena.");
    }
}   
class Saxophone implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the Saxophone.");
    }
}

public class Testmusic {
    public static void main(String[] args) {
        // Create instances of Veena and Saxophone
        Veena veena = new Veena();
        Saxophone saxophone = new Saxophone();
        
        // Call play() method on Veena instance
        veena.play();
        
        // Call play() method on Saxophone instance
        saxophone.play();
        
        // Use Playable reference to call play() method
        Playable playableVeena = veena;
        Playable playableSaxophone = saxophone;
        
        playableVeena.play();
        playableSaxophone.play();
    }
}
