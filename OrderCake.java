//this is a java file
public class OrderCake extends Cake {
    float weight;
    public OrderCake(String n, double r) {
        super(n, r);
    }
    public float getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double calcPrice(/*float weight,int rate*/){
        return weight*rate;
    }

    public OrderCake(float weight,int rate){
        this.weight=weight;
        this.rate=rate;
    }
}
