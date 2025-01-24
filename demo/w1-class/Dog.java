public class Dog {
  // member value
  public int weight;
  public String name;

  // member function
  public void set_weight(int weight) { this.weight = weight; }

  public void bark(int weight) {
    if (weight < 10) {
      System.out.println("Bark!");
    } else {
      System.out.println("Woof!");
    }
  }

  public static Dog maxDog(Dog d1, Dog d2) {
    if (d1.weight >= d2.weight) {
      return d1;
    }
    return d2;
  }

  public Dog(int w, String n) {
    this.weight = w;
    this.name = n;
  }

  public static void main(String[] args) {
    Dog d;
    d = new Dog(15, "Man");
    d.set_weight(20);
    System.out.println(d.weight);
  }
}

/*
 * `Static` shows that something is a shared property of a class
 * `Non-static` shows that every object of a class has a copy of the thing
 */