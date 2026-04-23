package Projects.ClassAndObjectLab.TelevisionLab;

/*The purpose of this class is to model a television
  Your name and today’s date 
*/ 
public class Television {
    /* --- Properties & State --- */
    private final String MANUFACTURER; // Brand name
    private final int SCREEN_SIZE;    // In inches
    private boolean powerOn;          // Current power status
    private int channel;              // Current station
    private int volume;               // Loudness level

    /**
     * Initializes a new Television instance with specified hardware specifications.
     * Sets the manufacturer and screen size while defaulting power to off, 
     * channel to a starting station, and volume to a base level.
     * * @param brand The name of the manufacturer
     * @param size The screen size in inches
     */
    public Television(String brand, int size){
        this.MANUFACTURER = brand;
        this.SCREEN_SIZE = size;
        // Default states
        this.powerOn = false;
        this.channel = 2;
        this.volume = 20;
    }
    /**
     * Sets the channel to a specific station
     * @param station the channel number to store
     */
    public void setChannel(int station){
        channel = station;
    }

    /**
     * Turn the TV on or off
     */
    public void power(){
        this.powerOn = !this.powerOn;
    }

    /**
     * Turn the volume up by 1
     */
    public void increaseVolume(){
        this.volume++;
    }

    /**
     * Turn the volume down by 1
     */
    public void decreaseVolume(){
        this.volume--;
    }

    /**
     * Return the current channel station
     * @return the channel
     */
    public int getChannel(){
        return this.channel;
    }

    /**
     * Return the current volume of the TV
     * @return the volume
     */
    public int getVolume(){
        return this.volume;
    }

    /**
     * Return the manufacturer of the TV
     * @return the manufacturer
     */
    public String getManufacturer(){
        return MANUFACTURER;
    }

    /**
     * Return the screen size of the TV
     * @return the screen size
     */
    public int getScreenSize(){
        return SCREEN_SIZE;
    }
}

