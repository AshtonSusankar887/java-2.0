class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    String[] friends = {"Joe","Mary","Toni","Charlie"};

    double[] tempC = {-4.5,0,23,34,5,10};

    double[] tempF = convert(tempC);
    
    
  }

  double[] convert(double[] temp){

    double[] farhen = new double[temp.length];
    for(int x=0; x<=temp.length-1;x++){
      farhen[x] = celsiusToFarhenheit(temp[x]);
    }
    return farhen;
  }

  double celsiusToFarhenheit(double c){
        return c*9/5+32;
  }
}