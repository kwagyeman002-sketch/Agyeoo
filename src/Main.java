public class Main  {
    public static void  main (String[]  args){
        double degrees =30.0;
        double radians;
        radians = Math.toRadians(degrees);

        double sinValue = Math.sin(radians);
        double cosValue = Math.cos(radians);
        double tanValue = Math.tan(radians);

        System.out.println("sin value =" + sinValue);
        System.out.println("cos value =" + cosValue);
        System.out.println("tan value =" + tanValue);


    }
}