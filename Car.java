interface Car{

  abstract String getCarName(String name); 
}

class CarImplementation implements Car{

    public String getCarName(String name){

        return name;
     }
}