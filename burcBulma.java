import java.util.Scanner;

public class burcBulma {

    public static void main(String[] args) {
        int month , day ;

        Scanner gem = new Scanner(System.in);
        System.out.println("Doğduğunuz ay :");
        month = gem.nextInt();

        if (month>=1 && month <=12 ){
            System.out.println("Doğduğunuz gün :");
            day = gem.nextInt();
        

          if (month == 1 ) {
            if (day >= 1 && day <=21){
                System.out.println("Oğlak burcusunuz :) ");

            }else if (day > 21){
                System.out.println("Kova burcusunuz :) ");
            }
          }else if(month ==2){
            if (day >= 1 && day <=19){
                System.out.println("Kova burcusunuz :) ");

            }else if (day > 19){
                System.out.println("Balık burcusunuz :) ");
            }
          }else if(month ==3){
            if (day >= 1 && day <=20){
                System.out.println("Balık burcusunuz :) ");

            }else if (day > 20){
                System.out.println("Koç burcusunuz :) ");
            }

           }else if(month ==4){
            if (day >= 1 && day <=20){
                System.out.println("Koç burcusunuz :) ");

            }else if (day > 20){
                System.out.println("Boğa burcusunuz :) ");
            }
            
           }else if(month ==5){
            if (day >= 1 && day <=21){
                System.out.println("Boğa burcusunuz :) ");

            }else if (day > 21){
                System.out.println("İkizler burcusunuz :): ... Allah yardımcınız olsun ...  ");
            }
            
           }else if(month ==6){
            if (day >= 1 && day <=22){
                System.out.println("İkizler burcusunuz :): ... Allah yardımcınız olsun ...  ");

            }else if (day > 22){
                System.out.println("Yengeç burcusunuz :) ");
            }
            
           }else if(month ==7){
            if (day >= 1 && day <=22){
                System.out.println("Yengeç burcusunuz :) ");

            }else if (day > 22){
                System.out.println(" Aslan burcusunuz :) ");
            }
            
           }else if(month ==8){
            if (day >= 1 && day <=22){
                System.out.println("Aslan burcusunuz :)");

            }else if (day > 22){
                System.out.println("Başak burcusunuz :) ");
            }
            
           }else if(month ==9){
            if (day >= 1 && day <=22){
                System.out.println("Başak burcusunuz :)");

            }else if (day > 22){
                System.out.println("Terazi burcusunuz :) ");
            }
            
           }else if(month ==10){
            if (day >= 1 && day <=22){
                System.out.println("Terazi burcusunuz :)");

            }else if (day > 22){
                System.out.println("Akrep burcusunuz :) ");
            }
            
           }else if(month ==11){
            if (day >= 1 && day <=21){
                System.out.println("Akrep burcusunuz :)");

            }else if (day > 21){
                System.out.println("Yay burcusunuz :) ");
            }
            
           }else if(month ==12){
            if (day >= 1 && day <=21){
                System.out.println("Yay burcusunuz :) ");

            }else if (day > 21){
                System.out.println("Oğlak burcusunuz :) ");
            }
            
           }else {
            System.out.println("Hatalı giriş yaptınız , girmiş olduğunuz verileri kontrol ediniz lütfen . ");
           }

        }

    }
}
