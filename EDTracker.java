package EDTracker;
//ED stands for "Emergency Department". This will track patients who attend different sections of the department.
import java.util.Scanner;

class Main {
    
  public static mainDept MDPatient1 = new mainDept();   //Setting up objects
  public static mainDept MDPatient2 = new mainDept();   //MD stands for "Main Department" for more serious issues 
  public static sAndT STPatient1 = new sAndT();         //ST is "See and Treat" for cuts and injuries
  public static sAndT STPatient2 = new sAndT();
  public static Scanner check = new Scanner(System.in);  // making a scanner for user inout throughout the program
  public static String ans;
  
  public static void main(String[] args) {
      //This section runs an initial setup so that everything has a value saved
      System.out.println("Running initial patient setup.");
      System.out.println("Main department patient 1:");
      MDPatient1.setNum();
      MDPatient1.setSize();
      MDPatient1.setType();
      System.out.println("Is this a paediatric patient (Y/N)?");
      ans = check.nextLine().toLowerCase();
      if ("y".equals(ans))
      {
          MDPatient1.setPaeds();
          System.out.println("Patient set to paediatric.\n");
      }
      else
      {
          System.out.println("Patient not set to paediatric.\n");
      }
      System.out.println("Main department patient 2:");
      MDPatient2.setNum();
      MDPatient2.setSize();
      MDPatient2.setType();
      System.out.println("Is this a paediatric patient (Y/N)?");
      ans = check.nextLine().toLowerCase();
      if ("y".equals(ans))
      {
          MDPatient2.setPaeds();
          System.out.println("Patient set to paediatric.\n");
      }
      else
      {
          System.out.println("Patient not set to paediatric.\n");
      }
      System.out.println("See and Treat patient 1:");
      STPatient1.setNum();
      STPatient1.setSize();
      System.out.println("Does patient require a bed?(Y/N)");
      ans = check.nextLine().toLowerCase();
      if("y".equals(ans))
      {
          STPatient1.setBed();
          System.out.println("Patient requires bed.");
      }
      else
      {
          System.out.println("Patient does not require a bed.");
      }
      STPatient1.setType();
      System.out.println("\nSee and Treat patient 2:");
      STPatient2.setNum();
      STPatient2.setSize();
      System.out.println("Does patient require a bed?(Y/N)");
      ans = check.nextLine().toLowerCase();
      if("y".equals(ans))
      {
          STPatient2.setBed();
          System.out.println("Patient requires bed.\n");
      }
      else
      {
          System.out.println("Patient does not require a bed.\n");
      }
      STPatient2.setType();
      menu(); 
  }
  public static void menu(){
      //Here is a menu for the user to go back and forth between editing details and just looking at them
      Scanner action = new Scanner(System.in);
      int choice;
      System.out.println("Please choose one:");
      System.out.println("1. Alter Main Department patient.");
      System.out.println("2. Alter See and Treat patient.");
      System.out.println("3. See summary");
      System.out.println("4. Exit");
      choice = action.nextInt();
      switch (choice){
          case 1 -> mainDept();
          case 2 -> sat();
          case 3 -> summary();
          case 4 -> System.exit(0);
          default -> {
                  System.out.println("Unrecognised response");
                  menu();
                  }
      }    
  }
  
  public static void mainDept(){
      //The user can alter MD patients from here
      System.out.println("Alter patient 1? (Y/N)");  //The user can skip patients if nothing needs changing
      ans = check.nextLine().toLowerCase();
      if ("y".equals(ans))
      {
          System.out.println("Main department patient 1:");
          MDPatient1.setNum();
          MDPatient1.setSize();
          MDPatient1.setType();
          System.out.println("Switch paediatric setting? (Y/N)");
          System.out.println("Current setting: Patient is " + MDPatient1.isPaeds());
          ans = check.nextLine().toLowerCase();
          if ("y".equals(ans))
          {
              MDPatient1.setPaeds();
              System.out.println("Patient paediatric setting changed.\n");
          }
      }
      System.out.println("Alter patient 2? (Y/N)");
      ans = check.nextLine().toLowerCase();
      if ("y".equals(ans))
      {
          System.out.println("Main department patient 2:");
          MDPatient2.setNum();
          MDPatient2.setSize();
          MDPatient2.setType();
          System.out.println("Switch paediatric setting? (Y/N)");
          System.out.println("Current setting: Patient is " + MDPatient2.isPaeds());
          ans = check.nextLine().toLowerCase();
          if ("y".equals(ans))
          {
              MDPatient2.setPaeds();
              System.out.println("Patient paediatric setting changed.\n");
          }
      }
      menu();
  }
  
  public static void sat(){
      //The user can alter ST patients from here
      System.out.println("Alter patient 1? (Y/N)"); //The user can skip patients if nothing needs changing
      ans = check.nextLine().toLowerCase();
      if ("y".equals(ans))
      {
          System.out.println("See and Treat patient 1:");
          STPatient1.setNum();
          STPatient1.setSize();
          System.out.println("Change bed status?(Y/N)");
          System.out.println("Cubicle currently " + STPatient1.isBed());
          ans = check.nextLine().toLowerCase();
          if("y".equals(ans))
          {
              STPatient1.setBed();
              System.out.println("Patient bed setting changed.");
          }
          STPatient1.setType();
          System.out.println("");
      }
      System.out.println("Alter patient 2? (Y/N)");
      ans = check.nextLine().toLowerCase();
      if ("y".equals(ans))
      {
          System.out.println("See and Treat patient 2:");
          STPatient2.setNum();
          STPatient2.setSize();
          System.out.println("Change bed status?(Y/N)");
          System.out.println("Cubicle currently " + STPatient2.isBed());
          ans = check.nextLine().toLowerCase();
          if("y".equals(ans))
          {
              STPatient2.setBed();
              System.out.println("Patient bed setting changed.");
          }
          STPatient2.setType();
          System.out.println("");
      }
      menu();
  }
  
  public static void summary(){
      //User gets a display to clearly show what details have been saved
      System.out.println("\n");
      System.out.println("-------------------------");
      System.out.println("Main Department Patient 1");
      System.out.println("-------------------------");
      System.out.println("Cubicle Number: " + MDPatient1.getNum());
      System.out.println("Cubicle Size: " + MDPatient1.getSize());
      System.out.println("Patient Type: " + MDPatient1.getType());
      System.out.println("Patient 1 is " + MDPatient1.isPaeds());
      System.out.println("-------------------------");
      System.out.println("Main Department Patient 2");
      System.out.println("-------------------------");
      System.out.println("Cubicle Number: " + MDPatient2.getNum());
      System.out.println("Cubicle Size: " + MDPatient2.getSize());
      System.out.println("Patient Type: " + MDPatient2.getType());
      System.out.println("Patient 1 is " + MDPatient2.isPaeds());
      System.out.println("-------------------------");
      System.out.println("See and Treat Patient 1");
      System.out.println("-------------------------");
      System.out.println("Cubicle Number: " + STPatient1.getNum());
      System.out.println("Cubicle Size: " + STPatient1.getSize());
      System.out.println("Bed: Patient " + STPatient1.isBed());
      System.out.println("Complaint Type: " + STPatient1.getType());
      System.out.println("-------------------------");
     System.out.println("See and Treat Patient 2");
      System.out.println("-------------------------");
      System.out.println("Cubicle Number: " + STPatient2.getNum());
      System.out.println("Cubicle Size: " + STPatient2.getSize());
      System.out.println("Bed: Patient " + STPatient2.isBed());
      System.out.println("Complaint Type: " + STPatient2.getType());
      System.out.println("-------------------------");
      System.out.println("\n");
      menu();
  }
}

class cubicle{
    int cubicleNum;  //Every cubicle has a number
    String size;     //Every cubicle has a size
    
    cubicle()
    {
       cubicleNum = 0;
       size = "unsized";
    }
    
    int getNum()
    {
        return cubicleNum;
    }
    
    void setNum()
    {
        Scanner cub = new Scanner(System.in);
        do{ //Loop makes sure that the user enters a valid number
        System.out.println("What is the cubicle number?");
        cubicleNum = cub.nextInt();
        if (cubicleNum <= 0)
        {
            System.out.println("Must be a positive number.");
        }
        }while (cubicleNum <= 0);
    }
    
    String getSize()
    {
        return size;
    }
    
    void setSize()
    {
        Scanner cSize = new Scanner(System.in);
        System.out.println("Is cubicle size large, medium or small?");
        String type = cSize.nextLine().toLowerCase();
        switch (type){
            case "large" -> {
                size = "Large";
                break;
            }
            case "medium" -> {
                size = "Medium";
                break;
            }
            case "small" -> {
                size = "Small";
                break;
            }
            default -> {
                    System.out.println("Must be large, medium or small.");
                    setSize();
                    }
        }
    
    }
}

class mainDept extends cubicle{
    String mainType;    //MD has different levels of patient severity
    boolean paeds;      //It needs to be known if a patient is a child (under 18) 
    
    mainDept()
    {
        mainType = "untyped";
        paeds = false;
    }
    
    String getType()
    {
        return mainType;
    }
    
    void setType()
    {
        Scanner mType = new Scanner(System.in);
        System.out.println("Is cubicle type Major, Minor or Critical?");
        String type = mType.nextLine().toLowerCase();
        switch (type){
            case "major" -> {
                mainType = "Major";
                break;
            }
            case "minor" -> {
                mainType = "Minor";
                break;
            }
            case "critical" -> {
                mainType = "Critical";
                break;
            }
            default -> {
                    System.out.println("Must be Major, Minor or Critical.");
                    setType();
                    }
    }
}
    boolean getPaeds()
    {
        return paeds;
    }
    
    void setPaeds()
    {
        paeds = !paeds;   //User can toggle between paeds and not paeds if needed
    }
    
    String isPaeds()
    {
        if (paeds == true)
        {
            return "a paediatric patient.";
        }
        else
        {
            return "not a paediatric patient.";
        }
    }
}

class sAndT extends cubicle{
    boolean withBed;        //Not all ST patients require a bed
    String complaintType;   //Separates type of complaint for different treatmetns
    
    sAndT()
    {
        withBed = false;
        complaintType = "untyped";
    }
    
    boolean getBed()
    {
        return withBed;
    }
    
    void setBed()
    {
        withBed = !withBed; //User can toggle bed status if needed
    }
    
    String isBed()
    {
        if (withBed == true)
        {
            return "has a bed.";
        }
        else
        {
            return "does not have a bed.";
        }
    }
    
    String getType()
    {
        return complaintType;
    }
    
    void setType()
    {
        Scanner cType = new Scanner(System.in);
        System.out.println("Is complaint type laceration, injury or multiple?");
        String type = cType.nextLine().toLowerCase();
        switch (type){
            case "laceration" -> {
                complaintType = "Laceration";
                break;
            }
            case "injury" -> {
                complaintType = "Injury";
                break;
            }
            case "multiple" -> {
                complaintType = "Multiple";
                break;
            }
            default -> {
                    System.out.println("Must be laceration, injury or multiple.");
                    setType();
                    }
        }
    }
}