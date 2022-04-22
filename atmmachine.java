import java.util.Scanner;

public class atmmachine{
    
    public static void main(String[] args) {

        int balance = 5000, right = 3, select = 0, price;

        String username, password, Language, bankname1 = "X Bankası", bankname2 = "X Bank";


        Scanner input = new Scanner(System.in);


        switch(select){

            case 0:

            System.out.println("1- Türkçe\n2- English");

            System.out.print("Seçiniz/Choose : ");

            select = input.nextInt();

            Language = input.nextLine();

                if(select == 1){

                    System.out.println(bankname1 + "na Hoşgeldiniz ! ");

                    while(right > 0){

                        System.out.print("Kullanıcı Adınız : ");

                        username = input.nextLine();

                        System.out.print("Parolanız : ");

                        password = input.nextLine();

                        if(username.equals("patika") && password.equals("dev123")){

                            System.out.println("Sisteme Giriş Yapılmıştır.");

                            do {

                                System.out.println("1- Para Yatırma\n2- Para Çekme\n3- Bakiye Sorgula\n4- Çıkış Yap");

                                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");

                                select = input.nextInt();

                                switch(select){

                                    case 1:

                                    System.out.print("Yatırmak İstediğiniz Tutar : ");

                                    price = input.nextInt();

                                    balance += price;

                                    System.out.println("Bakiyeniz : " + balance + " TL ");

                                    break;

                                    case 2:

                                    System.out.print("Çekmek İstediğiniz Tutar : ");

                                    price = input.nextInt();

                                        if(price > balance){

                                            System.out.println("Bakiye Yetersiz!");

                                        }else{

                                            balance -= price;
                                            System.out.println("Kalan Tutar : " + balance + " TL ");

                                        }
                                    break;

                                    case 3:

                                    System.out.println("Bakiyeniz : " + balance + " TL ");

                                    break;

                                }

                            }while(select != 4);

                            System.out.println("Sistemden Çıkış Yapılmıştır ! Tekrar Görüşmek Üzere.");

                            break;

                        }else{

                            right--;

                            System.out.println("Hatalı Kullanıcı Adı veya Parola ! ");

                            switch(right){

                                case 0:

                                System.out.println("Hesabınız Bloke Olmuştur. Bankanız ile İletişime Geçiniz !");

                                break;

                                default:

                                System.out.println("Kalan Hakkınız : " + right);

                                break;

                            }
                        }
                    }
                }

                if(select == 2){

                    System.out.println("Welcome to " + bankname2 + "!");

                    while(right > 0){

                        System.out.print("Your User Name : ");

                        username = input.nextLine();

                        System.out.print("Your Password : ");

                        password = input.nextLine();

                        if(username.equals("patika") && password.equals("dev123")){

                            System.out.println("Logged to The System. Welcome !");

                            do {

                                System.out.println("1- Deposit Money\n2- Withdraw Money\n3- Check Balance\n4- EXIT");

                                System.out.print("Please select the action you want to take : ");

                                select = input.nextInt();

                                switch(select){

                                    case 1:

                                    System.out.print("Enter Money to be Deposited : ");

                                    price = input.nextInt();

                                    balance += price;

                                    System.out.println("Your Balance : " + balance + " $ ");

                                    break;

                                    case 2:

                                    System.out.print("Enter Money to be Withdrawn : ");

                                    price = input.nextInt();

                                        if(price > balance){

                                            System.out.println("Insufficient Balance!");

                                        }else{

                                            balance -= price;

                                            System.out.println("Remaining Balance : " + balance + " $ ");

                                        }
                                    break;

                                    case 3:

                                    System.out.println("Your Balance : " + balance + " $ ");

                                    break;

                                }

                            }while(select != 4);

                            System.out.println("Signed Out of The System! See You Again.");

                            break;

                        }else{

                            right--;

                            System.out.println("Incorrect Username or Password ! ");

                            switch(right){

                                case 0:

                                System.out.println("Your Account has been Blocked. Contact Your Bank !");

                                break;

                                default:

                                System.out.println("Your Remaining Rights : " + right);

                                break;
                            }
                        }
                    }
                }
        }

    }
}
