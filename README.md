# **ATM MACHINE**

## INFORMATION

* **You can do anything with virtual money at this ATM.**

## TECHNOLOGIES USED

* **JAVA**

## CONTENTS

* The variables **balance**, **right**, **select** and **price** are defined with int.

* The variables **username**, **password**, **language**, **bankname1** and **bankname2** are defined with String.

* Scanner class is defined for the user to enter username and password.

* A huge ATM was created using switch-case, if-else, do-while loops.

* Added multi-language option.

* Multi-currency added.

## CODES

```Java

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


```

```Java

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

```
````Java

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

```

```bash

    1- Türkçe
    2- English
    Seçiniz/Choose : 1
    X Bankasına Hoşgeldiniz !
    Kullanıcı Adınız : a
    Parolanız : a
    Hatalı Kullanıcı Adı veya Parola !
    Kalan Hakkınız : 2
    Kullanıcı Adınız : a
    Parolanız : a
    Hatalı Kullanıcı Adı veya Parola !
    Kalan Hakkınız : 1
    Kullanıcı Adınız : a
    Parolanız : a
    Hatalı Kullanıcı Adı veya Parola !
    Hesabınız Bloke Olmuştur. Bankanız ile İletişime Geçiniz !

```
```bash

    1- Türkçe
    2- English
    Seçiniz/Choose : 1
    X Bankasına Hoşgeldiniz !
    Kullanıcı Adınız : patika
    Parolanız : dev123
    Sisteme Giriş Yapılmıştır.
    1- Para Yatırma
    2- Para Çekme
    3- Bakiye Sorgula
    4- Çıkış Yap
    Lütfen yapmak istediğiniz işlemi seçiniz : 1
    Yatırmak İstediğiniz Tutar : 1100
    Bakiyeniz : 6100 TL
    1- Para Yatırma
    2- Para Çekme
    3- Bakiye Sorgula
    4- Çıkış Yap
    Lütfen yapmak istediğiniz işlemi seçiniz : 2
    Çekmek İstediğiniz Tutar : 2000
    Kalan Tutar : 4100 TL
    1- Para Yatırma
    2- Para Çekme
    3- Bakiye Sorgula
    4- Çıkış Yap
    Lütfen yapmak istediğiniz işlemi seçiniz : 3
    Bakiyeniz : 4100 TL
    1- Para Yatırma
    2- Para Çekme
    3- Bakiye Sorgula
    4- Çıkış Yap
    Lütfen yapmak istediğiniz işlemi seçiniz : 4
    Sistemden Çıkış Yapılmıştır ! Tekrar Görüşmek Üzere.

```
```bash

    1- Türkçe
    2- English
    Seçiniz/Choose : 2
    Welcome to X Bank!
    Your User Name : a
    Your Password : a
    Incorrect Username or Password !
    Your Remaining Rights : 2
    Your User Name : a
    Your Password : a
    Incorrect Username or Password !
    Your Remaining Rights : 1
    Your User Name : a
    Your Password : a
    Incorrect Username or Password !
    Your Account has been Blocked. Contact Your Bank !

```
```bash

    1- Türkçe
    2- English
    Seçiniz/Choose : 2
    Welcome to X Bank!
    Your User Name : patika
    Your Password : dev123
    Logged to The System. Welcome !
    1- Deposit Money
    2- Withdraw Money
    3- Check Balance
    4- EXIT
    Please select the action you want to take : 1
    Enter Money to be Deposited : 750
    Your Balance : 5750 $
    1- Deposit Money
    2- Withdraw Money
    3- Check Balance
    4- EXIT
    Please select the action you want to take : 2
    Enter Money to be Withdrawn : 900
    Remaining Balance : 4850 $
    1- Deposit Money
    2- Withdraw Money
    3- Check Balance
    4- EXIT
    Please select the action you want to take : 3
    Your Balance : 4850 $
    1- Deposit Money
    2- Withdraw Money
    3- Check Balance
    4- EXIT
    Please select the action you want to take : 4
    Signed Out of The System! See You Again.

```   

<br />

## LINK

* Click here https://github.com/Fogo9/ATMMachine.git to access the Github page for this project.

<br />

## LICENSE

* This software is licensed By Tuncay Demir under the MIT license.

<br />

>[Patika.dev](https://app.patika.dev/fogomurphy)

<br/>

| Name |  Email |
| ---- |  ----- |
| Tuncay | tuncaydemir682@gmail.com |
