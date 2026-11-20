import java.util.*;

void main() {
    Scanner sc = new Scanner(System.in);

 Fronta f = new Fronta();

 f.add("Astarion", "Rogue", 6);
 f.add("Halsin", "Druid", 12);
 f.add("Gale", "Mage", 32);
 f.add("Karlach", "Barbarian", 29);

    System.out.println("jmeno:");
    String jmeno = sc.nextLine();
    System.out.println("oblibena classa:");
    String classsa = sc.nextLine();
    System.out.println("MMR:");
    int mmr = sc.nextInt();
    sc.nextLine();
    if (mmr < 0) {
        System.out.println("nesmi byt mensi nez 0");
    }else{
        f.add(jmeno, classsa, mmr);
    }



 boolean bezi = true;
 while(bezi){

     System.out.println("-------------- MENU --------------");
     System.out.println("1 - pridat noveho hrace");
     System.out.println("2 - registrace/odebrani prvniho hrace");
     System.out.println("3 - vypis vsech hracu");
     System.out.println("4 - nakouknuí");
     System.out.println("5 - konec");
     System.out.println();
     System.out.println("-EXTRA-");
     System.out.println("10 - vypis nad urcitym MMR");
     System.out.println("20 - vypsat podle jmena");

     int choice = sc.nextInt();
     sc.nextLine();

     switch (choice) {

         case 1:

             System.out.println("jmeno:");
             jmeno = sc.nextLine();
             System.out.println("oblibena classa:");
             classsa = sc.nextLine();
             System.out.println("MMR:");
             mmr = sc.nextInt();
             sc.nextLine();
             if (mmr < 0) {
                 System.out.println("nesmi byt mensi nez 0");
                 break;
             }

             f.add(jmeno, classsa, mmr);
             break;

         case 2:
             f.zaregistrovat();
             break;

         case 3:
             f.printAll();
             break;

         case 4:
             f.nakouknuti();
             break;

         case 5:
             bezi = false;
             break;




         case 10:
             System.out.println("zadej min mmr:");
             mmr = sc.nextInt();
             sc.nextLine();

             f.printAboveMMR(mmr);
             break;

         case 20:
             System.out.println("zadej jmeno:");
             jmeno = sc.nextLine();

             f.printForName(jmeno);
             break;




         default:
             break;






     }




 }










}
