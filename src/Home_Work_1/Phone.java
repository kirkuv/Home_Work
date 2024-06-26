package Home_Work_1;

public class Phone {
    public static void main(String[] args) {
        int [] ph = {1,2,3,4,5,6,7,8,9,0};
        System.out.println(createPhoneNumber(ph));

        }

    public static String createPhoneNumber (int[] ph)
   {
       String str="(";
       for (int i= 0; i<3; i++)
           str+=Integer.toString(ph[i]); // берем по одному символу
       str+=") ";
      // String str1="";
       for (int i= 3; i<6; i++)
           str+=Integer.toString(ph[i]);
       //String str2 = "";
       str+="-";
       for (int i= 6; i<10; i++)
           str+=Integer.toString(ph[i]);

      // System.out.println("("+ str+ ")"+ " " +str1+ "-"+ str2);
       return str;
   }
}