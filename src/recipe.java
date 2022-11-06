import java.sql.*;
import java.util.Scanner;

public class recipe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String recipeTitle, recipeDesc, recipePreparedBy, recipeIngredients, recipeCategory;
        while (true) {
            System.out.println("Recipe Management App");
            System.out.println("1. Add a Recipe");
            System.out.println("2. View all Recipes");
            System.out.println("3. Search a Recipe");
            System.out.println("4. Update a Recipe");
            System.out.println("5. Delete a Recipe");
            System.out.println("10. Exit");

            System.out.println("Enter the choice: ");
            int choice = input.nextInt();
        }
    }
}