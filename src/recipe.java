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
            System.out.println("6. Exit");

            System.out.println("Enter the choice: ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Add a Recipe");

                    System.out.println("Enter the Recipe Name: ");
                    recipeTitle = input.next();
                    System.out.println("Enter the Recipe Description: ");
                    recipeDesc = input.next();
                    System.out.println("Ingredients : ");
                    recipeIngredients = input.next();
                    System.out.println("Recipe author: ");
                    recipeCategory = input.next();


                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/recipiedb", "root", "");
                        String sql = "INSERT INTO `reciepie`( `reciepie_name`, `reciepie_description`, `reciepie_incredient`, `recipie_author`)  VALUES (?,?,?,?)";
                        PreparedStatement stmt = con.prepareStatement(sql);
                        stmt.setString(1, recipeTitle);
                        stmt.setString(2, recipeDesc);

                        stmt.setString(3, recipeIngredients);
                        stmt.setString(4, recipeCategory);
                        stmt.executeUpdate();
                        System.out.println("Recipe created...");


                    } catch (Exception e) {
                        System.out.println(e);
                    }


                    break;

            }
        }
    }
}