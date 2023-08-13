import java.util.Scanner;

public class ZodiacSign{

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int month, day;

        System.out.println("Month you were born: ");
        month=input.nextInt();
        System.out.println("Day you were born: ");
        day=input.nextInt();

        switch (month) {
            case 1:
                if(day>=1 && day<=31){
                    
                    if(day<22){
                    System.out.println("Capricorn Sign");
                    }
                    else{
                    System.out.println("Aquaris Sign");
                    }
                }
                else{
                    System.out.println("Invalid number entered");
                }
                
        break;

        case 2: 
                if(day>=1 && day<= 28){
                       if(day<20){
                        System.out.println("Aquaris Sign");
                       } 
                       else{System.out.println("Pisces Sign");
                        }
                }else{
                    System.out.println("Invalid number entered");
                }
        break;
        
        case 3: 
                if(day>=1 && day<= 31){
                       if(day<20){
                        System.out.println("Pisces Sign");
                       } 
                       else{System.out.println("Aries Sign");
                        }
                }else{
                    System.out.println("Invalid number entered");
                }
        break;

        case 4: 
                if(day>=1 && day<= 30){
                       if(day<20){
                        System.out.println("Aries Sign");
                       } 
                       else{System.out.println("Taurus Sign");
                        }
                }else{
                    System.out.println("Invalid number entered");
                }
        break;

        case 5: 
                if(day>=1 && day<= 31){
                       if(day<22){
                        System.out.println("Taurus Sign");
                       } 
                       else{System.out.println("Gemini Sign");
                        }
                }else{
                    System.out.println("Invalid number entered");
                }
        break;

        case 6: 
                if(day>=1 && day<= 30){
                       if(day<23){
                        System.out.println("Gemini Sign");
                       } 
                       else{System.out.println("Cancer Sign");
                        }
                }else{
                    System.out.println("Invalid number entered");
                }
        break;

        case 7: 
                if(day>=1 && day<= 31){
                       if(day<23){
                        System.out.println("Cancer Sign");
                       } 
                       else{System.out.println("Leo Sign");
                        }
                }else{
                    System.out.println("Invalid number entered");
                }
        break;

        case 8: 
                if(day>=1 && day<= 31){
                       if(day<23){
                        System.out.println("Leo Sign");
                       } 
                       else{System.out.println("Virgo Sign");
                        }
                }else{
                    System.out.println("Invalid number entered");
                }
        break;

        case 9: 
                if(day>=1 && day<= 30){
                       if(day<23){
                        System.out.println("Virgo Sign");
                       } 
                       else{System.out.println("Libra Sign");
                        }
                }else{
                    System.out.println("Invalid number entered");
                }
        break;

        case 10: 
                if(day>=1 && day<= 31){
                       if(day<23){
                        System.out.println("Vibra Sign");
                       } 
                       else{System.out.println("Scorpio Sign");
                        }
                }else{
                    System.out.println("Invalid number entered");
                }
        break;

        case 11: 
                if(day>=1 && day<= 30){
                       if(day<22){
                        System.out.println("Scorpio Sign");
                       } 
                       else{System.out.println("Sagittarius Sign");
                        }
                }else{
                    System.out.println("Invalid number entered");
                }
        break;

        case 12: 
                if(day>=1 && day<= 31){
                       if(day>20){
                        System.out.println("Sagittarius Sign");
                       } 
                       else{System.out.println("Capricorn Sign");
                        }
                }else{
                    System.out.println("Invalid number entered");
                }
        break;

        


        
            default:
                System.out.println("You entered incorrect information");
            break;
        }



    }
}