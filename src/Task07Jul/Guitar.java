package Task07Jul;

 interface Playable {
    public void play();

 }
 class Guitar implements Playable {
   public void play(){
       System.out.println("Playing Guitar");
   }
 }
class Piano implements Playable{
    public void play(){
        System.out.println("Playing Piano");
    }

    public static void main(String[] args) {
        Playable play=new  Piano();//interface can be a reference -Dynamic dispatch
        play.play();
        Playable play1=new  Guitar();//interface can be a reference -Dynamic dispatch
        play1.play();
    }
}