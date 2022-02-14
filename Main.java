import java.util.Scanner;

public class Main {
    public static Book[][] books;
    public static void main(String[] args) {
        books = new Book[2][5];
        books[0][0]= new ProgrammingBook("p1","JavaBasic1","Dat",1000,"Java","someWhat");
        books[0][1]= new ProgrammingBook("p2","JavaBasic2","Dat",1100,"Java","someWhat");
        books[0][2]= new ProgrammingBook("p3","JavaBasic3","Dat",1200,"Java","someWhat");
        books[0][3]= new ProgrammingBook("p4","PHP1","Dat",1300,"PHP","someWhat");
        books[0][4]= new ProgrammingBook("p5","PHP2","Dat",1200,"PHP","someWhat");
        books[1][0]= new FrictionBook("f1","MasterJava","Dat",1200,"NotEvenReal");
        books[1][1]= new FrictionBook("f1","MasterPHP","Dat",1200,"NotEvenReal");
        books[1][2]= new FrictionBook("f1","MasterPython","Dat",1200,"NotEvenReal");
        books[1][3]= new FrictionBook("f1","MasterC++","Dat",1200,"NotEvenReal");
        books[1][4]= new FrictionBook("f1","MasterIT","Dat",3200,"NotEvenReal");
        double totalPrice=0;
        for (int i = 0; i < books.length; i++) {
            for (int j = 0; j < books[i].length; j++) {
               totalPrice+= books[i][j].getPrice();
            }
        }
        System.out.printf("TotalPrice = %f\n",totalPrice);
        System.out.printf("Numb of Books use Java language: %d\n",checkNumbOfBooksWithLanguage("Java"));
        double price=0.0 ;
        boolean check=true;
        String display;
        while (check){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Book's name u wanna check Price: ");
            String name = input.nextLine();
            for (int i = 0; i < books.length; i++) {
                for (int j = 0; j < books[i].length; j++) {
                    if(name.equals(books[i][j].getName())){
                        price = books[i][j].getPrice();
                        break;
                    }
                }
            }
            display= (price==0.0?"Book not found!":"Book's price: "+price);
            System.out.println(display);
            System.out.println("Enter 0 to exit, any number not 0 to continue.");
            int n = input.nextInt();
            if(n==0){
                check=false;
            }else {
                price = 0.0;
                display = "";
            }
        }
    }
    public static int checkNumbOfBooksWithLanguage(String l){
        int numb =0;
        for (int i = 0; i < books.length; i++) {
            for (int j = 0; j < books[i].length; j++) {
                String id = "p" + (j + 1);
                if (id.equals(books[i][j].getId())) {
                    String language = ((ProgrammingBook) books[i][j]).getLanguage();
                    if (language.equals(l)) {
                        numb++;
                    }
                }
            }
        }
        return numb;
    }
}
