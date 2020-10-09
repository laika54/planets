public class Driver{
    public static void main(String[] args){
        createSolarSystem();
    }

    public static void createSolarSystem(){
        SolarSystem mySolarSystem = new SolarSystem(1000,1000);
        int mercury = 0;
        int venus = 0;
        int earth = 0;
        int moon = 0;
        int mars = 0;
        int jupiter = 0;
        int saturn = 0;
        int uranus = 0; //xD
        int neptune = 0;
        while(true){
            mySolarSystem.drawSolarObject(0, 0, 50, "YELLOW");
            mySolarSystem.drawSolarObjectAbout(70, mercury+=8, 8, "GREY", 0, 0);
            mySolarSystem.drawSolarObjectAbout(150, venus+=3, 10, "ORANGE", 0, 0);
            mySolarSystem.drawSolarObjectAbout(200, earth+=6, 10, "BLUE", 0, 0);
            mySolarSystem.drawSolarObjectAbout(20, moon+=10, 5, "  WHITE", 200, earth);
            mySolarSystem.drawSolarObjectAbout(250, mars+=7, 8, "RED", 0, 0);
            mySolarSystem.drawSolarObjectAbout(300, jupiter+=1, 30, "ORANGE", 0, 0);
            mySolarSystem.drawSolarObjectAbout(400, saturn+=2, 20, "YELLOW", 0, 0);
            mySolarSystem.drawSolarObjectAbout(450, uranus+=5, 15, "CYAN", 0, 0);
            mySolarSystem.drawSolarObjectAbout(480, neptune+=3, 15, "BLUE", 0, 0);

            mySolarSystem.finishedDrawing();
        }
    }
}
