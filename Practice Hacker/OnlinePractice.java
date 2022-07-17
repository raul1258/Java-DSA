public class OnlinePractice {
    public static void main(String args[]){
        System.out.println("Hello world");
        int N = scanner.nextInt();
        if(N%2!=0){
            System.out.println("Weird");
        }else if(N%2==0 && N<5){
            System.out.println("Not Weird");
        }else if(N%2==0 && N>6 ){
            System.out.println("Weird");
        }else if(N%2==0 && N>20){
            System.out.println("Not Weird");
        }
    }
}
