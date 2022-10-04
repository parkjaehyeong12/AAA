package my.hello.javastudy02;

public class Traveler {
   private String name;
   private String nation;
   private int age;
   private String personNum;
   
   public Traveler() {
	   
   }
   
   public Traveler(String name) {
	   this.name = name;
   }
   
   public Traveler(String name,String nation) {
	   this.name= name;
	   this.nation=nation;
   }
  //3 
   public Traveler(String name, String nation,int age) {
	   this.name= name;
	   this.nation=nation;
	   this.age=age;
   }
}
