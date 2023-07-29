public class Main {
    public static void main(String[] args) {

        for(int i=0;i<6;i++){
            if(i == 0){
                System.out.println("*"); //İlk satır yıldız
            }else {
                String st = "*".repeat(i * 2);
                System.out.println(st);
            }
        }


    }

}




