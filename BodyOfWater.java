public class BodyOfWater {
    private String name;
    private int largestDiameter;
    private int avgDepth;
    private boolean isSaltWater;

    public BodyOfWater(String n, int l, int d, boolean i){
        name= n;
        largestDiameter=l;
        avgDepth=d;
        isSaltWater=i;
    
    }
    public BodyOfWater(String n, int d){
        name=n;
        avgDepth=d;

    }
    public void setName(String n){
       name = n;
    }
    public void setlargestDiameter(int l){
        largestDiameter = l;
    }
    
    public void printState(){
        System.out.println("Name: " + name);

        System.out.println("Diameter: " + largestDiameter);

        System.out.println("avgDepth: "+ avgDepth);

        System.out.println("isSaltWater: "+ isSaltWater);
    }

}
