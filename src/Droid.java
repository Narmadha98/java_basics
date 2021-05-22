public class Droid
{
    int batteryLevel;
    String name;

    public Droid(String droidName){
        name = droidName;
        batteryLevel = 100;
    }

    public void performTask(String Task, int energyConsumed){
        System.out.println(name+" is performing a task: "+ Task);
        batteryLevel -= energyConsumed;
    }

    public void energyReport(){
        System.out.println(name+"'s battery level: "+ batteryLevel+"%");
    }

    public void energyTransfer(Droid a, Droid b){
        int temp = a.batteryLevel;
        a.batteryLevel = b.batteryLevel;
        b.batteryLevel = temp;
        System.out.println("Transferred batteries between "+a.name+" and "+b.name);
    }

    public String toString(){
        return "Hello, I’m the droid: "+ name;
    }
    public static void main(String[] args){

        Droid codey = new Droid("Codey");
        System.out.println(codey);
        codey.performTask("Coding", 20);
        codey.energyReport();
        Droid joey = new Droid("Joey");
        System.out.println(joey);
        joey.performTask("Acting", 15);
        joey.energyReport();
        codey.energyTransfer(codey, joey);
        codey.energyReport();
        joey.energyReport();
    }
}