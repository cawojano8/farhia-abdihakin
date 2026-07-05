//farhia abdihakin
//C1240020
import java.util.Scanner;

public class jeep3 {


    static String pin_keyga = "2000";
    static String ac_password = "2020" ;
    static double ac_haraaga = 2000;
    static double haraa = 5500;
    static boolean isValidPhone(String phone) {
        return phone != null && phone.matches("^061\\d{7}$");
    }

    static boolean isValidAmount(double amount) {
        return amount > 0;
    }
    static boolean isValidPin(String pin) {
        return pin != null && pin.matches("^\\d{4,}$");
    }
    static int askConfirm(Scanner input) {
        while (true) {
            System.out.println("1. Haa");
            System.out.println("2. Maya");
            int c = input.nextInt();
            if (c == 1 || c == 2) return c;
            System.out.println("Fadlan dooro 1 ama 2.");
        }
    }

    static String askPhone(Scanner input, String prompt) {
        System.out.println(prompt);
        return input.next();
    }

    static double askAmount(Scanner input, String prompt) {
        System.out.println(prompt);
        return input.nextDouble();
    }

    static String askNewPin(Scanner input) {
        while (true) {
            System.out.println("Fadlan Geli pin-ka cusub (ugu yaraan 4 lambar oo tiro ah)");
            String newPin = input.next();
            if (!isValidPin(newPin)) {
                System.out.println("Pin-ku waa inuu ka kobnaadaa ugu yaraan 4 lambar (tiro kaliya).");
                continue;
            }
            System.out.println("Hubi pin-kaaga cusub");
            String confirmPin = input.next();
            if (newPin.equals(confirmPin)) {
                return newPin;
            } else {
                System.out.println("Pin-yadu isku mid ma ahan, fadlan isku day mar kale.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("jeep CODE: ");
        String JEEP = input.next();
        String JEEP_CODE = "*810#";

        if (!JEEP_CODE.equals(JEEP)) {
            return;
        }

        System.out.println("- JEEP -");
        System.out.println("faldan geli pin-kaaga(Enter pin)");
        String user_pass = input.next();
        if (!pin_keyga.equals(user_pass)) {
            System.out.println("PIN qaldan.");
            return;
        }

        System.out.println("JEEP");
        System.out.println("1. Itus Haraaga");
        System.out.println("2. kaarka hadalka");
        System.out.println("3. Bixi Biil");
        System.out.println("4.U wareeji JEEP");
        System.out.println("5. Warbixin Kooban");
        System.out.println("6.  Banks");
        System.out.println("7. Maareynta");
        System.out.println("8. Bill Payment");
        int doro_num = input.nextInt();
        switch (doro_num) {
            case 1:
                System.out.println("[-JEEP-] Haraagaagu waa $" + haraa);
                break;
            case 2:
                kaarkaHadalka(input);
                break;
            case 3:
                bixiBiil(input);
                break;
            case 4:
                uWareejiJEEP(input);
                break;
            case 5:
                warbixinKooban(input);
                break;
            case 6:
                Banks(input);
                break;
            case 7:
                maareyntaSystem(input);
                break;
            case 8:
                billPayment(input);
                break;
            default:
                System.out.println("fadlan dooro number sax ah");
        }
    }

    //                    2. KAARKA HADALKA

    static void kaarkaHadalka(Scanner input) {
        System.out.println("Kaarka hadalka");
        System.out.println("1. Ku shubo Airtime");
        System.out.println("2. Ugu shubo Airtime");
        System.out.println("3. MIFI Packages");
        System.out.println("4. Ku shubo Internet");
        System.out.println("5. Ugu shub qof kale (MMT)");

        int kaarka_hadalka = input.nextInt();
        switch (kaarka_hadalka) {
            case 1:
                kuShuboAirtime(input);
                break;
            case 2:
                uguShuboAirtime(input);
                break;
            case 3:
                mifiPackages(input);
                break;
            case 4:
                kuShuboInternet(input);
                break;
            case 5:
                uguShubQofKale(input);
                break;
            default:
                System.out.println("fadlan dooro number sax ah");
        }
    }
    
    static void kuShuboAirtime(Scanner input) {
        while (true) {
            double amount = askAmount(input, "Fadlan Gali lacagta");
            String phone = askPhone(input, "Fadlan Geli numberka");

            System.out.println("Ma hubtaa inaad $" + amount + " ku shubtid " + phone + "?");
            int confirm = askConfirm(input);

            if (confirm == 2) {
                System.out.println("Mahadsanid");
                break;
            }

            if (!isValidPhone(phone)) {
                System.out.println("invalid input lenght");
                continue;
            }
            if (!isValidAmount(amount)) {
                System.out.println("invalid amount");
                continue;
            }

            if (haraa >= amount) {
                haraa -= amount;
                System.out.println("Waad ku guuleysatay inaad $" + amount + " ku shubto " + phone +
                        "\nHaraagaaga hadda waa $" + haraa);
            } else {
                System.out.println("Haraagaagu kuma filna.");
            }
            break;
        }
    }
    
    static void uguShuboAirtime(Scanner input) {
        while (true) {
            String phone = askPhone(input, "Fadlan Geli mobile-ka");
            double amount = askAmount(input, "Fadlan Geli lacagta");

            System.out.println("Ma hubtaa inaad $" + amount + " ku shubtid " + phone + "?");
            int confirm = askConfirm(input);

            if (confirm == 2) {
                System.out.println("Mahadsanid");
                break;
            }

            if (!isValidPhone(phone)) {
                System.out.println("invalid input lenght");
                continue;
            }
            if (!isValidAmount(amount)) {
                System.out.println("invalid amount");
                continue;
            }

            if (haraa >= amount) {
                haraa -= amount;
                System.out.println("Waad ku guuleysatay inaad $" + amount + " ku shubtid " + phone +
                        "\nHaraagaaga hadda waa $" + haraa);
            } else {
                System.out.println("Haraagaagu kuma filna.");
            }
            break;
        }
    }
    static void mifiPackages(Scanner input) {
        System.out.println("JEEP");
        System.out.println("1. Ku shubo Data-da MIFI");
        int data = input.nextInt();
        if (data != 1) {
            System.out.println("fadlan dooro number sax ah");
            return;
        }
        System.out.println("-Internet Bundle Recharge-");
        System.out.println("1. Isbuucle(Weekly)");
        System.out.println("2. maalinle(Daily)");
        System.out.println("3. Bille(MiFi)");
        int mifiDooro = input.nextInt();
        switch (mifiDooro) {
            case 1:
                mifiChoosePlan(input, new double[]{5, 10}, new String[]{"$5= 10 GB", "$10=25 GB"}, "isbuucle");
                break;
            case 2:
                mifiChoosePlan(input, new double[]{2, 5}, new String[]{"$1= 2 GB", "$2=5 GB"}, "maalinle");
                break;
            case 3:
                mifiChoosePlan(input, new double[]{20, 40, 60, 30},
                        new String[]{"$20= 40 GB", "$40=85 GB", "$60= 150 GB", "$30= monthly unlimit"}, "bille");
                break;
            default:
                System.out.println("fadlan dooro number sax ah");
        }
    }

    static void mifiChoosePlan(Scanner input, double[] prices, String[] labels, String planName) {
        System.out.println("fadlan dooro bundle ka");
        for (String label : labels) {
            System.out.println(label);
        }
        int choice = input.nextInt();
        if (choice < 1 || choice > prices.length) {
            System.out.println("number sax ah dooro");
            return;
        }
        double price = prices[choice - 1];

        while (true) {
            System.out.println("fadlan Gali MIFI user");
            String mifiUser = askPhone(input, "(mobile-ka MIFI)");

            System.out.println("Ma hubtaa inaad $" + price + " ugu shubtid " + mifiUser + " ?");
            int confirm = askConfirm(input);

            if (confirm == 2) {
                System.out.println("ok");
                break;
            }

            if (!isValidPhone(mifiUser)) {
                System.out.println("invalid input lenght");
                continue;
            }
            if (!isValidAmount(price)) {
                System.out.println("invalid amount");
                continue;
            }

            if (haraa >= price) {
                haraa -= price;
                System.out.println("waad ku guuleysaday inaad ku shubtid $" + price + " " + planName + " ah" +
                        " \n haraagaga hada waa $" + haraa);
            } else {
                System.out.println("Haraagaagu kuma filna.");
            }
            break;
        }
    }

    
    static void kuShuboInternet(Scanner input) {
        System.out.println("Fadlan dooro number-ka ku shubeyso");
        System.out.println("1. Isbuucle(Weekly)");
        System.out.println("2.TIMES BASED PACKAGES");
        System.out.println("3. DATA");
        System.out.println("4. Maalinle (Daily)");
        System.out.println("5. Bille(MiFi)");
        int choice = input.nextInt();
        String label;
        switch (choice) {
            case 1: label = "data internet-ah"; break;
            case 2: label = "data internet-ah"; break;
            case 3: label = "data internet-ah"; break;
            case 4: label = "data internet-ah"; break;
            case 5: label = "data internet-ah oo bile ah"; break;
            default:
                System.out.println("number sax ah soo geli");
                return;
        }
        internetRecharge(input, label);
    }

    static void internetRecharge(Scanner input, String label) {
        while (true) {
            double amount = askAmount(input, "fadlan geli lacagta");
            String phone = askPhone(input, "fadlan gali mobile-ka");

            System.out.println("Ma hubtaa inaad $" + amount + " ugu shubtid " + phone + " ?");
            int confirm = askConfirm(input);

            if (confirm == 2) {
                System.out.println("ok");
                break;
            }

            if (!isValidPhone(phone)) {
                System.out.println("invalid input lenght");
                continue;
            }
            if (!isValidAmount(amount)) {
                System.out.println("invalid amount");
                continue;
            }

            if (haraa >= amount) {
                haraa -= amount;
                System.out.println("waad ku guuleysaday inaad ku shubtid $" + amount + " " + label +
                        " \n haraagaga hada waa $" + haraa);
            } else {
                System.out.println("haragaagu kuma filno");
            }
            break;
        }
    }

    
    static void uguShubQofKale(Scanner input) {
        while (true) {
            String phone = askPhone(input, "fadlan soo geli mobile-ka");
            double amount = askAmount(input, "fadlan soo geli lacagta");

            System.out.println("Ma hubtaa inaad $" + amount + " ugu shubtid " + phone + " ?");
            int confirm = askConfirm(input);

            if (confirm == 2) {
                System.out.println("ok");
                break;
            }

            if (!isValidPhone(phone)) {
                System.out.println("invalid input lenght");
                continue;
            }
            if (!isValidAmount(amount)) {
                System.out.println("invalid amount");
                continue;
            }

            if (haraa >= amount) {
                haraa -= amount;
                System.out.println("waad ku guuleysaday inaad ugu shubtid " + phone +
                        " \n haraagaga hada waa $" + haraa);
            } else {
                System.out.println("haraagagu kuma filno");
            }
            break;
        }
    }

    //                    3. BIXI BIIL

    static void bixiBiil(Scanner input) {
        System.out.println("Bixi Biil");
        System.out.println("1. Post Paid  ");
        System.out.println("2.ku Iibso");
        int bixi_biil = input.nextInt();
        switch (bixi_biil) {
            case 1:
                postPaid(input);
                break;
            case 2:
                kuIibso(input);
                break;
            default:
                System.out.println("fadlan soo geli number sax ah");
        }
    }

    static void postPaid(Scanner input) {
        System.out.println("Post Paid");
        System.out.println("1. Ogow biil");
        System.out.println("2. Bixi biil");
        System.out.println("3.Ka Bixi Biil");
        int post_paid = input.nextInt();
        switch (post_paid) {
            case 1:
                System.out.println("haraagagu waa $" + haraa);
                break;
            case 2:
                while (true) {
                    double amount = askAmount(input, "Fadlan geli lacagta biil-ka");
                    System.out.println("Ma hubtaa inaa bixisid biil lacagtiisu tahay: $" + amount);
                    int confirm = askConfirm(input);
                    if (confirm == 2) {
                        System.out.println("ok");
                        break;
                    }
                    if (!isValidAmount(amount)) {
                        System.out.println("invalid amount");
                        continue;
                    }
                    if (haraa >= amount) {
                        haraa -= amount;
                        System.out.println("waad ku guuleysay inaa bixiso biilka \n haraagagu hada waa $" + haraa);
                    } else {
                        System.out.println("haragaagu kuma filno");
                    }
                    break;
                }
                break;
            case 3:
                while (true) {
                    String phone = askPhone(input, "fadlan soo geli mobile-ka");
                    double amount = askAmount(input, "fadlan geli lacgta");
                    System.out.println("Ma hubtaa inaad bixisid bill lacagtiisu tahay: $" + amount + " oo laga rabo tell NO " + phone);
                    int confirm = askConfirm(input);
                    if (confirm == 2) {
                        System.out.println("ok");
                        break;
                    }
                    if (!isValidPhone(phone)) {
                        System.out.println("invalid input lenght");
                        continue;
                    }
                    if (!isValidAmount(amount)) {
                        System.out.println("invalid amount");
                        continue;
                    }
                    if (haraa >= amount) {
                        haraa -= amount;
                        System.out.println("waad ku guuleysay inaad bixiso lacagta \n haragaagu hada waa $" + haraa);
                    } else {
                        System.out.println("haragaagu kuma filno ");
                    }
                    break;
                }
                break;
            default:
                System.out.println("fadlan soo geli number sax ah");
        }
    }

    static void kuIibso(Scanner input) {
        System.out.println("Fadlan geli agoonsiga ganacsiga");
        double aqoonsi = input.nextDouble();
        if (aqoonsi != 1) {
            System.out.println("aqoonsigaaga waa qalad");
            return;
        }
        while (true) {
            String phone = askPhone(input, "Fadlan Gali Number ka");
            double amount = askAmount(input, "Fadlan Gali lacagta");
            System.out.println("Ma hubtaa inaad " + amount + " udirto " + phone);
            int confirm = askConfirm(input);
            if (confirm == 2) {
                System.out.println("Mahadsanid!");
                break;
            }
            if (!isValidPhone(phone)) {
                System.out.println("invalid input lenght");
                continue;
            }
            if (!isValidAmount(amount)) {
                System.out.println("invalid amount");
                continue;
            }
            if (haraa >= amount) {
                haraa -= amount;
                System.out.println("waad ku guuleystay howshaan\n" + "Haraagaagu waa " + haraa);
            } else {
                System.out.println("haragaagu kuma filno");
            }
            break;
        }
    }


    //                4. U WAREEJI JEEP

    static void uWareejiJEEP(Scanner input) {
        while (true) {
            String phone = askPhone(input, "fadlan geli mobile-ka");
            double amount = askAmount(input, "fadaln geli lacagta");

            System.out.println("Ma hubtaa inaad $" + amount + " ugu shubtid " + phone + " ?");
            int confirm = askConfirm(input);

            if (confirm == 2) {
                System.out.println("ok");
                break;
            }

            if (!isValidPhone(phone)) {
                System.out.println("invalid input lenght");
                continue;
            }
            if (!isValidAmount(amount)) {
                System.out.println("invalid amount");
                continue;
            }

            if (haraa >= amount) {
                haraa -= amount;
                System.out.println(amount + " $ ayaad uwareejisay " + phone + "\n haraagaga hada waa $" + haraa);
            } else {
                System.out.println("haraagagu kuma filno ");
            }
            break;
        }
    }


    //                5. WARBIXIN KOOBAN

    static void warbixinKooban(Scanner input) {
        System.out.println("Warbixin Kooban");
        System.out.println("1. Last Action ");
        System.out.println("2. Wareejintii u dambeysay");
        System.out.println("3.Iibsashadii u dambeysay");
        System.out.println("4.Last 3 Action");
        System.out.println("5. Email Me My ACtivity");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("$100 Ayaad u wareejisay +252612665118, Taariikh: 20/08/36 10:30:20");
                break;
            case 2:
                System.out.println("Statementiga");
                System.out.println("1. U dirtay");
                System.out.println("2.kaheshay");
                int statement = input.nextInt();
                switch (statement) {
                    case 1:
                        String dirtay = askPhone(input, "fadlan geli mobile-ka");
                        if (!isValidPhone(dirtay)) {
                            System.out.println("invalid input lenght");
                            break;
                        }
                        System.out.println("$10 Ayaad ka dirtay +252" + dirtay + ", Taariikh: 20/08/36 10:30:20");
                        break;
                    case 2:
                        String kaheshay = askPhone(input, "fadlan geli mobile-ka");
                        if (!isValidPhone(kaheshay)) {
                            System.out.println("invalid input lenght");
                            break;
                        }
                        System.out.println("$10 Ayaad ka heshay +252" + kaheshay + ", Taariikh: 20/08/36 10:30:20");
                        break;
                    default:
                        System.out.println("fadlan soo geli number ah");
                }
                break;
            case 3:
                break;
            case 4:
                System.out.println("$100 Ayaad u wareejisay +252619305060, Taariikh: 20/08/36 10:30:20");
                System.out.println("$90 Ayaad u wareejisay 252619305060, Taariikh: 20/08/36 10:30:20");
                System.out.println("$101 Ayaad u wareejisay 252619305060, Taariikh: 20/08/36 10:30:20");
                break;
            case 5:
                System.out.println("email successful");
                break;
            default:
                System.out.println("fadlan soo geli number sax ah");
        }
    }


    //                    6.  BANKS
    static void Banks(Scanner input) {
        System.out.println("Banks");
        System.out.println("1. Itus haraaga");
        System.out.println("2. Lacag dhigasho");
        System.out.println("3. Lacag qaadasho");
        System.out.println("4. Ka wareeji JEEP");
        System.out.println("5. Ka wareeji Account-kaga");
        System.out.println("6. hubi wareeji account");
        System.out.println("7. Maareynta Bankiga");

        int banks = input.nextInt();
        switch (banks) {
            case 1:
                System.out.println("Fadlan Geli numberkaaga sirta ee bangiga");
                String pin1 = input.next();
                if (pin1.equals(ac_password)) {
                    System.out.println("haragaaga bangiga waa:" + ac_haraaga + "USD");
                } else {
                    System.out.println("numberkaaga sirta ee bangiga waa qalad");
                }
                break;
            case 2:
                bankDeposit(input);
                break;
            case 3:
                bankWithdraw(input);
                break;
            case 4:
                bankTojeep(input);
                break;
            case 5:
                bankToAccount(input);
                break;
            case 6:
                hubiWareejiAccount(input);
                break;
            case 7:
                maareyntaBankiga(input);
                break;
            default:
                System.out.println("fadlan soo geli number sax ah");
        }
    }

    static void bankDeposit(Scanner input) {
        while (true) {
            double amount = askAmount(input, "fadlan geli lacagta");
            System.out.println("Fadlan Geli numberkaaga sirta ee bangiga");
            String pin = input.next();
            if (!pin.equals(ac_password)) {
                System.out.println("numberkaaga sirta ee bangiga waa qalad");
                return;
            }
            System.out.println("Ma hubtaa inaad $" + amount + " dhigatid account_kaaga bangiga ?");
            int confirm = askConfirm(input);
            if (confirm == 2) {
                System.out.println("ok");
                break;
            }
            if (!isValidAmount(amount)) {
                System.out.println("invalid amount");
                continue;
            }
            ac_haraaga += amount;
            System.out.println("USD " + amount + " ayaa dhigatay koontadaada bangiga" +
                    "\n haragaagu hada waa: $" + ac_haraaga);
            break;
        }
    }

    static void bankWithdraw(Scanner input) {
        while (true) {
            double amount = askAmount(input, "fadlan geli lacagta");
            System.out.println("Fadlan Geli numberkaaga sirta ee bangiga");
            String pin = input.next();
            if (!pin.equals(ac_password)) {
                System.out.println("numberkaaga sirta ee bangiga waa qalad");
                return;
            }
            System.out.println("Ma hubtaa inaad $" + amount + " qaadatid account_kaaga bangiga ?");
            int confirm = askConfirm(input);
            if (confirm == 2) {
                System.out.println("ok");
                break;
            }
            if (!isValidAmount(amount)) {
                System.out.println("invalid amount");
                continue;
            }
            if (ac_haraaga >= amount) {
                ac_haraaga -= amount;
                System.out.println("USD " + amount + " ayaa kala baxday koontadaada bangiga" +
                        "\n haragaagu hda waa: $" + ac_haraaga);
            } else {
                System.out.println("haragaagu kuma filno");
            }
            break;
        }
    }

    static void bankTojeep(Scanner input) {
        System.out.println("fadlan soo dooro xisaabta bangiga");
        System.out.println("SALAAM SOMALI BANK");
        int salaam_dooro = input.nextInt();
        if (salaam_dooro != 1) {
            System.out.println("numberkaaga sirta ee bangiga waa qalad");
            return;
        }
        while (true) {
            String account = askPhone(input, "fadlan soo geli account-ka");
            System.out.println("fadlan geli macluumad");
            String macluumad = input.next();
            double amount = askAmount(input, "fadlan soo geli lacagta");
            System.out.println("Fadlan Geli numberkaaga sirta ee bangiga");
            String pin = input.next();
            if (!pin.equals(ac_password)) {
                System.out.println("fadlan soo dooro number sax ah ");
                return;
            }
            System.out.println("Ma hubtaa inaa u dhigatay  accounta NO:" + account + " ?");
            int confirm = askConfirm(input);
            if (confirm == 2) {
                System.out.println("mahadsanid!");
                break;
            }
            if (!isValidPhone(account)) {
                System.out.println("invalid input lenght");
                continue;
            }
            if (!isValidAmount(amount)) {
                System.out.println("invalid amount");
                continue;
            }
            if (haraa >= amount) {
                haraa -= amount;
                System.out.println("waad ku guuleysay inaa dhigato  ACCOUNT NO:" + account);
            } else {
                System.out.println("haragagu kuma filno");
            }
            break;
        }
    }

    static void bankToAccount(Scanner input) {
        while (true) {
            String account = askPhone(input, "fadlan soo geli account ama mobile");
            double amount = askAmount(input, "fadlan soo geli lacagta");
            System.out.println("fadlan soo geli macluumad");
            String macluumad = input.next();
            System.out.println("Fadlan Geli numberkaaga sirta ee bangiga");
            String pin = input.next();
            if (!pin.equals(ac_password)) {
                System.out.println("numberkaaga sirta ee bangiga waa qalad");
                return;
            }
            System.out.println("Ma hubtaa inaad USD" + amount + " u wareejiso Bank Account NO:" + account + "?");
            int confirm = askConfirm(input);
            if (confirm == 2) {
                System.out.println("mahadsanid!");
                break;
            }
            if (!isValidPhone(account)) {
                System.out.println("invalid input lenght");
                continue;
            }
            if (!isValidAmount(amount)) {
                System.out.println("invalid amount");
                continue;
            }
            if (ac_haraaga >= amount) {
                ac_haraaga -= amount;
                System.out.println("waad ku guuleysay inaad u wareejiso lacagtan \n haraagagu hada waa $" + ac_haraaga);
            } else {
                System.out.println("haragaagu kuma filno");
            }
            break;
        }
    }

    static void hubiWareejiAccount(Scanner input) {
        System.out.println("fadlan geli OTP");
        int otp = input.nextInt();
        System.out.println("Ma hubtaa in aad aqbasho lacgta diridan");
        int confirm = askConfirm(input);
        if (confirm == 1) {
            System.out.println("waad ku guuleysay inaa ku dirto lacgta account to account");
        } else {
            System.out.println("mahadsanid!");
        }
    }

    static void maareyntaBankiga(Scanner input) {
        System.out.println(" Maareynta Bankiga");
        System.out.println("1. Bedel PIN-ka Bangiga");
        System.out.println("2.Bedel Passwordka Ebank");
        int maareynta = input.nextInt();
        switch (maareynta) {
            case 1:
                System.out.println("Fadlan Geli numberkaaga sirta ee bangiga");
                String oldPin = input.next();
                if (!oldPin.equals(ac_password)) {
                    System.out.println("numberkaaga sirta ee bangiga waa qalad");
                    return;
                }
                String newPin = askNewPin(input);
                ac_password = newPin;
                System.out.println("waad ku guuleysay inaa badasho pin-kaaga bangiga");
                break;
            case 2:
                System.out.println("Fadlan Geli numberkaaga sirta ee bangiga");
                String pin = input.next();
                System.out.println("error occurred ,please try again later");
                break;
            default:
                System.out.println("fadlan soo geli number sax ah");
        }
    }
    //                       7. MAAREYNTA

    public static void maareyntaSystem(Scanner input) {
        System.out.println("Maareynta ");
        System.out.println("1. Bedel Lambarka Sirta");
        System.out.println("2. Bedel Luqadda");
        System.out.println("3. Wargellin Mobile Lumay");
        System.out.println("4. Lacag Xirasho");
        System.out.println("5. U celli Lacag Qaldantay");
        System.out.println("6. Enable Mobile Banking");

        int Maareynta = input.nextInt();
        switch (Maareynta) {
            case 1:
                System.out.println("Fadlan Geli PIN-kaaga hadda");
                String oldPin = input.next();
                if (!oldPin.equals(pin_keyga)) {
                    System.out.println("Kuma aadan guuleysan inaad badasho PIN-kaaga, PIN-ka hore waa qalad.");
                    break;
                }
                String newPin = askNewPin(input);
                pin_keyga = newPin;
                System.out.println("<-JEEP-> Waad ku guuleysatay in aad badasho PIN-kaaga");
                break;

            case 2:
                System.out.println("Fadlan Dooro luqada:");
                System.out.println("1. English");
                System.out.println("2. Soomaali");
                int luqadda = input.nextInt();
                switch (luqadda) {
                    case 1:
                        System.out.println("<-EVCPlus-> You have successfully changed your language.");
                        break;
                    case 2:
                        System.out.println("<-EVCPlus-> Waad ku guuleysatey inaad bedesho luqadda.");
                        break;
                    default:
                        System.out.println("Fadlan soo geli number sax ah.");
                }
                break;

            case 3:
                while (true) {
                    String mobile_lumay = askPhone(input, "Fadlan geli mobile-ka lumay:");
                    System.out.println("Ma hubtaa in aad u diiwaan geliso lumid number-kan " + mobile_lumay + "?");
                    int confirm = askConfirm(input);
                    if (confirm == 2) {
                        System.out.println("OK");
                        break;
                    }
                    if (!isValidPhone(mobile_lumay)) {
                        System.out.println("invalid input lenght");
                        continue;
                    }
                    System.out.println("Waad ku guuleysay in aad diiwaan geliso mobile-ka lumay.");
                    break;
                }
                break;

            case 4:
                String num_khalad = askPhone(input, "Fadlan geli numberka khaldan:");
                String num_loo_rabay = askPhone(input, "Fadlan geli numberkii loo rabay:");
                if (!isValidPhone(num_khalad) || !isValidPhone(num_loo_rabay)) {
                    System.out.println("invalid input lenght");
                    break;
                }
                if (num_khalad.equals(num_loo_rabay)) {
                    System.out.println("Ma hubtaa inaad xirto lacagtan?");
                    int confirm = askConfirm(input);
                    if (confirm == 1) {
                        System.out.println("Waad ku guuleysay in aad xirto lacagtaan.");
                    } else {
                        System.out.println("OK");
                    }
                } else {
                    System.out.println("Dhaqdhaqaaqaan ma ahan mid jira.");
                }
                break;

            case 5:
                String mob_celis = askPhone(input, "Fadlan geli aqoonsiga lacag diridda:");
                if (!isValidPhone(mob_celis)) {
                    System.out.println("invalid input lenght");
                    break;
                }
                System.out.println("Ma hubtaa inaad celiso lacagtan? " + mob_celis);
                int confirm = askConfirm(input);
                if (confirm == 1) {
                    System.out.println("Waad ku guuleysay inaad celiso lacagta.");
                } else {
                    System.out.println("OK");
                }
                break;

            case 6:
                String num_is_diiwan = askPhone(input, "Fadlan geli number-ka isdiiwaan gelinta:");
                if (!isValidPhone(num_is_diiwan)) {
                    System.out.println("invalid input lenght");
                    break;
                }
                System.out.println(num_is_diiwan + " Activation record was found.");
                break;

            default:
                System.out.println("Fadlan dooro number sax ah.");
        }
    }

    //                    8. BILL PAYMENT
    static void billPayment(Scanner input) {
        int reference = 612665118;
        System.out.println("jeep");
        System.out.println("1. itus haraaaga bill ka\n2. Wada Bixi bill ka\n3. Qayb ka bixi Bill");
        int BixiBill = input.nextInt();
        if (BixiBill < 1 || BixiBill > 3) {
            System.out.println("Fadlan dooro number sax ah");
            return;
        }

        if (BixiBill == 1) {
            System.out.println("Fadlan Geli bill reference number");
            int user_reference = input.nextInt();
            if (reference != user_reference) {
                System.out.println("some parameters are missing. please check your request");
            } else {
                System.out.println("Haraagaaga bill ku waa $" + haraa);
            }
            return;
        }

        String action = BixiBill == 2 ? "wada bixisay" : "Qayb ka bixisay";

        System.out.println("Fadlan Geli bill reference number");
        int user_reference = input.nextInt();
        if (reference != user_reference) {
            System.out.println("some parameters are missing. please check your request");
            return;
        }

        while (true) {
            double amount = askAmount(input, "Fadlan Geli lagacta bill ka");
            System.out.println("Ma hubtaa in aad " + action + " lacagta bill ka una udirtay " + user_reference + " ?");
            int confirm = askConfirm(input);
            if (confirm == 2) {
                System.out.println("Mahadsanid!");
                break;
            }
            if (!isValidAmount(amount)) {
                System.out.println("invalid amount");
                continue;
            }
            if (amount > haraa) {
                System.out.println("Haraagaagu kuguma filna");
                break;
            }
            haraa -= amount;
            System.out.println("waxaad " + action + " lacagta bill ka waxaad na udirtay " + user_reference +
                    " haraagaagu waa $" + haraa);
            break;
        }
    }
}
