package strategy;

import strategy.taxStrategy.Form1040A;
import strategy.taxStrategy.Form1040EZ;

public class Main {

    public static void main(String[] args) {
	    printDescription();
	    demonstratePattern();
    }

    private static void printDescription(){
        System.out.println("*****************************************************************");
        System.out.println("Design Pattern: STRATEGY");
        System.out.println("Pattern Type: BEHAVIORAL");
        System.out.println("Bottom Line");
        System.out.println("* Define a family of algorithms");
        System.out.println("* Encapsulate each algorithm");
        System.out.println("* Make them interchangeable within that family AT RUNTIME");
        System.out.println("*****************************************************************");
    }

    private static void demonstratePattern(){
        TaxFiler filer = new TaxFiler(new Form1040EZ());
        filer.file();

        // identify more deductions, update strategy
        filer.setFilingAlgorithm(new Form1040A());
        filer.file();
    }
}
