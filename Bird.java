public class Bird implements Flyable, IFeathers{

    @Override
    public String hasFeathers() {
        return "I'm a bird, i have feathers!";
    }

    @Override
    public String fly() {
        return "I'm a bird, I can also fly!";
    }

    
}//end Bird
