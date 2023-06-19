package vehicles;

public class RoadCycle extends Bicycle{
    String name;
    public RoadCycle(){

    }

    public RoadCycle(String productname, int price, String color){
        this.name=productname;
        super.price = price;
        super.color = color;
        
    }//초기화?

    public String toString(){
        String spec = "Product name :" +this.name+
        "/ Price :"+this.price+
        "/ Color :"+this.color; 
        return spec;
    } // toString 출력?
    
}
