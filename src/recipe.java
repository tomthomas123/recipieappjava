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
                case 2:
                    System.out.println("View all Recipes");
                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/recipiedb","root","");
                        String sql ="SELECT `reciepie_name`, `reciepie_description`, `reciepie_incredient`, `recipie_author` FROM `reciepie` ";
                        Statement stmt = con.createStatement();
                        ResultSet rs = stmt.executeQuery(sql);
                        while(rs.next()){
                            String fetchRecipeName = rs.getString("reciepie_name");
                            String fetchRecipeDesc = rs.getString("reciepie_description");
                            //String fetchRecipePreparedBy = rs.getString("preparedby");
                            String fetchRecipeIngredients = rs.getString("reciepie_incredient");
                            String fetchRecipeCategory = rs.getString("recipie_author");

                            System.out.println("Recipe Name: "+fetchRecipeName);
                            System.out.println("Description : "+fetchRecipeDesc);
                            //System.out.println("Prepared By : "+fetchRecipePreparedBy);
                            System.out.println("Ingredients : "+fetchRecipeIngredients);
                            System.out.println("Category : "+fetchRecipeCategory+"\n");


                        }
                    }
                    catch (Exception e){
                        System.out.println(e);
                    }


                    break;
                case 3:
                    System.out.println("Search a Recipe");
                    System.out.println("Enter Recipe Name: ");
                    recipeTitle = input.next();
                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/recipiedb", "root", "");
                        String sql = "SELECT `reciepie_description`, `reciepie_incredient`, `recipie_author` FROM `reciepie` WHERE `reciepie_name`='"+recipeTitle+"'";


                        Statement stmt = con.createStatement();
                        ResultSet rs = stmt.executeQuery(sql);
                        while(rs.next()){

                            String fetchRecipeDesc = rs.getString("reciepie_description");

                            String fetchRecipeIngredients = rs.getString("reciepie_incredient");
                            String fetchRecipeCategory = rs.getString("recipie_author");


                            System.out.println("Description : "+fetchRecipeDesc);

                            System.out.println("Ingredients : "+fetchRecipeIngredients);
                            System.out.println("Category : "+fetchRecipeCategory+"\n");

                        }

                    }
                    catch (Exception e){
                        System.out.println(e);
                    }


                    break;
                case 4:
                    System.out.println("Update a Recipe");
                    System.out.println("Enter Recipe name: ");
                    recipeTitle = input.next();

                    System.out.println("Enter the Recipe Description to update: ");
                    recipeDesc = input.next();

                    System.out.println("Update Ingredients : ");
                    recipeIngredients = input.next();
                    System.out.println("Update author of recipe: ");
                    recipePreparedBy = input.next();


                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/recipiedb", "root", "");
                        String sql = "UPDATE `reciepie` SET `reciepie_description`='"+recipeDesc+"',`reciepie_incredient`='"+recipeIngredients+"' WHERE `reciepie_name` ='"+recipeTitle+"'";
                        Statement stmt = con.createStatement();
                        stmt.executeUpdate(sql);
                        System.out.println("Recipie updated successfully.");
                    }
                    catch (Exception e){
                        System.out.println(e);
                    }



                    break;
                case 5:
                    System.out.println("Delete a Recipe");
                    System.out.println("Enter the Recipe name: ");
                    recipeTitle = input.next();

                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/recipiedb", "root", "");
                        String sql = "DELETE FROM `reciepie` WHERE `reciepie_name` = '" +recipeTitle+"'";
                        Statement stmt = con.createStatement();
                        stmt.executeUpdate(sql);
                        System.out.println("Recipe deleted successfully.");
                    }
                    catch (Exception e){
                        System.out.println(e);
                    }


                    break;
                case 6:
                    System.out.println("Exited Menu..");
                    System.exit(0);



            }
        }
    }
}