class Vehicle {
int passengers;
int fuelcap;
int mpg;
int range() {
return mpg * fuelcap;
}
}
class RetMeth {
public static void main(String args[]) {
Vehicle minivan= new Vehicle();
Vehicle sportscar= new Vehicle();
int range1 , range2;
minivan.passengers=7;
minivan.fuelcap=16;
minivan.mpg=21;
sportscar.passengers=2;
sportscar.fuelcap=14;
sportscar.mpg=12;
range1= minivan.range();
range2= minivan.range();
System.out.print("Minivan can carry " + minivan.passengers + 
" with range of " + range1 + " Miles");
System.out.print("Sportcsar can carry " + sportscar.passengers + 
" with range of " + range2 + " Miles");
sportscar.range();
}
}