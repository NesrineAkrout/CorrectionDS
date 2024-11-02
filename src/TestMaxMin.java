public class TestMaxMin {
   public static void main(String[] args) {
     if (args.length != 3) 
     {
        System.out.println("Veuillez entrer trois nombres réels (x, y, z) en ligne de commande :");
        return;
      }
     
double x = Double.parseDouble(args[0]);
double y = Double.parseDouble(args[1]);
double z = Double.parseDouble(args[2]);
double max = x;
if (y > max) {
max = y;
}
if (z > max) {
max = z;
}
double min = x;
if (y < min) {
min = y;
}
if (z < min) {
min = z;
}
System.out.println("Le maximum de " + x + ", " + y + " et " + z + " est " + max);
System.out.println("Le minimum de " + x + ", " + y + " et " + z + " est " + min);
}
}