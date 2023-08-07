import java.util.Scanner;

class Demo1 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String blueColourUpper = "\033[34;1m";
        String noColour = "\033[0;0m";
        String show = "+---------+---------+-------------------------+\n";
        String red = "\033[31m";
        String green = "\033[32m";
        String blue = "\033[34m";
        String yellow ="\033[33m";

        Block:
        {
            System.out.print("Enter Your Name : ");
            String name = scanner.nextLine();
            String nameWithoutSpace = name.stripLeading();

            if(nameWithoutSpace.length()>0){
            name = nameWithoutSpace;
            }else{
            System.out.println(red+"Invalid Name"+noColour);
            if (true) break Block;
            }

            System.out.print("Enter Your Age : ");
            int age = scanner.nextInt();

            if(age <10 || age > 18 ){
            System.out.println(red+"Invalid Age"+noColour);
            if (true) break Block;

            }
            System.out.print("Enter Your Subject 1 : ");
            String sub1 = scanner.next();
            boolean startWithSE = sub1.startsWith("SE-");

            if(!startWithSE){
            System.out.println(red+"Invalid Subject Name"+noColour);
            if (true) break Block; 
            }

            System.out.print("Enter Your Subject 1 Marks : ");
            double sub1_Marks = scanner.nextDouble();

            if(sub1_Marks<0 || sub1_Marks>100){
            System.out.println(red+"Invalid Marks"+noColour);
            if (true) break Block;
            }

            System.out.print("Enter Your Subject 2 : ");
            String sub2 = scanner.next();
            startWithSE = sub2.startsWith("SE-");

            if(!startWithSE){
            System.out.println(red+"Invalid Subject Name"+noColour);
            if (true) break Block; 
            }else if (sub2.equals(sub1)){
            System.out.println(red+"Subject Name Alredy Exists"+noColour);
            if (true) break Block;
            }

            System.out.print("Enter Your Subject 2 Marks : ");
            double sub2_Marks = scanner.nextDouble();

            if(sub2_Marks<0 || sub2_Marks>100){
            System.out.println(red+"Invalid Marks"+noColour);
            if (true) break Block;
            }

            System.out.print("Enter Your Subject 3 : ");
            String sub3 = scanner.next();
            startWithSE = sub3.startsWith("SE-");

            if(!startWithSE){
            System.out.println(red+"Invalid Subject Name"+noColour);
            if (true) break Block; 
            }else if(sub3.equals(sub1)||sub3.equals(sub2)){
            System.out.println(red+"Subject Name Alredy Exists"+noColour);
            if (true) break Block;
            }

            System.out.print("Enter Your Subject 3 Marks : ");
            double sub3_Marks = scanner.nextDouble();

            if(sub3_Marks<0 || sub3_Marks>100){
            System.out.println(red+"Invalid Marks"+noColour);
            }
            System.out.println();

            name = name.toUpperCase();
            System.out.println("Name : "+blueColourUpper+name+noColour);
            System.out.println("Age : "+age+" Years Old");

            double total =sub1_Marks+sub2_Marks+sub3_Marks;
            double avarage =(sub1_Marks+sub2_Marks+sub3_Marks)/3;

            String statusAll = avarage>=75?blue+"Distinguished Pass(DP)"+noColour: avarage>=65?green+"Credit Pass(CP)"+noColour:avarage>=55?yellow+"Pass(P)"+noColour:red+"Fail(F)"+noColour;
            String statusSub1 = sub1_Marks>=75?blue+"Distinguished Pass(DP)"+noColour: sub1_Marks>=65?green+"Credit Pass(CP)"+noColour:sub1_Marks>=55?yellow+"Pass(P)"+noColour:red+"Fail(F)"+noColour;
            String statusSub2 = sub2_Marks>=75?blue+"Distinguished Pass(DP)"+noColour: sub2_Marks>=65?green+"Credit Pass(CP)"+noColour:sub2_Marks>=55?yellow+"Pass(P)"+noColour:red+"Fail(F)"+noColour;
            String statusSub3 = sub3_Marks>=75?blue+"Distinguished Pass(DP)"+noColour: sub3_Marks>=65?green+"Credit Pass(CP)"+noColour:sub3_Marks>=55?yellow+"Pass(P)"+noColour:red+"Fail(F)"+noColour;
            System.out.println("Status : "+statusAll);

            int NumberSub1 = Integer.valueOf(sub1.substring(3));
            int NumberSub2 = Integer.valueOf(sub2.substring(3));
            int NumberSub3 = Integer.valueOf(sub3.substring(3));

            System.out.printf("Total : %.2f Avg : %.2f\n",total,avarage);
            System.out.println(show);
            System.out.printf("|%-9s|%-9s|%-25s|\n","Subject","Marks","Status");
            System.out.println(show);
            System.out.printf("|SE-%03d|%-9.2f|%-36s|\n",NumberSub1,sub1_Marks,statusSub1);
            System.out.printf("|SE-%03d|%-9.2f|%-36s|\n",NumberSub2, sub2_Marks,statusSub2);
            System.out.printf("|SE-%03d|%-9.2f|%-36s|\n",NumberSub3, sub3_Marks,statusSub3);
             System.out.println(show);



        }
    }
}


    

