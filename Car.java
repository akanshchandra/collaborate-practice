interface Car{

  abstract String getCarName(String name); 
}

class CarImplementation implements Car{

    public String getCarName(String name){

        return name;
     }
}

class CarDriver {

 public static void main(String[] args){

       CarImplementation c1 = new CarImplementation();
      String res = c1.getCarName("Maruti-Suzuki-Brezza");

       System.out.println(res);
   }
}