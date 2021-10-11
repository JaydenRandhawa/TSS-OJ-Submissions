import java.util.Scanner; 

class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int grade = Integer.parseInt(inp.nextLine());

        if(grade < 50){
            System.out.println("Level R");
        }

        else if(grade > 50 && grade < 60){
            System.out.println("Level 1");
        }

        else if(grade > 60 && grade < 70){
            System.out.println("Level 2");
        }

        else if(grade > 70 && grade < 80){
            System.out.println("Level 3");
        }

        else{
            System.out.println("Level 4");
        }
    }
  }