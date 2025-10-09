
class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void init(){
		
   System.out.println(gpa(93));
   System.out.println(gpa(70));

    if( isGraduating(12,45) )
      System.out.println("Student is graduating");
    else
      System.out.println("Student is not graduating");

    if(isGraduating(11,45))
      System.out.println("Student is graduating");
    else
      System.out.println("Student is not graduating");
    

    System.out.println(BMI(174,72));
    System.out.println(BMI(124,72));
    System.out.println(BMI(224,72));

    System.out.println(shippingCost(9.5));
    System.out.println(shippingCost(19));
    System.out.println(shippingCost(40));
}
   
double gpa(double RAWGPA){
 if(RAWGPA > 90)
      return RAWGPA * 1.1;
    else
      return RAWGPA;
  }
  
 boolean isGraduating(int gradeLevel, int credits){
    if(gradeLevel==12 && credits>=44)
      return true;
    else
      return false;
  }

 String BMI(double weight, double height){
    double bmi=weight/Math.pow(height,2)*703;
    System.out.println(bmi);
    if(bmi <=18.4)
      return "Underweight";
    else if(bmi>=18.5 && bmi <=24.9)
      return "Normal";
    else if(bmi<39.9 && bmi>=25)
      return "Overwe ight";
    else if(bmi>=40)
      return "Obese";
    else
      return "undifined";
  }

double shippingCost(double wgt){
    if (wgt<=10)
      return 0;
    else if (wgt>10 && wgt<=15)
      return 5;
    else if (wgt>15 && wgt<=25)
      return 10;
    else
      return 10+(wgt-25)*0.02;
  }

boolean blueOrViolet(int freq){
    if(freq>=600 && freq<=670 || freq>=700 && freq<=750)
      return true;
    else 
      return false;
  }
}