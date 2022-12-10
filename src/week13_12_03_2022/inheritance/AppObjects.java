package week13_12_03_2022.inheritance;

public class AppObjects {
    public static void main(String[] args) {

        Instagram instagram= new Instagram(2.1);
        System.out.println(instagram);
        instagram.postPhoto();
        instagram.useTheApp(20);


        Discord discord= new Discord(1.5);
        System.out.println(discord);
        discord.chat();
        discord.useTheApp(15);

    }


}
