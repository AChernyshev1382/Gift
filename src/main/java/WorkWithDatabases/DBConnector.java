package WorkWithDatabases;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnector{

//    private static final String DB_DRIVER="org.postgresql.Driver";
//    private static final String DB_CONNECTION="jdbc:postgresql://s-msk-t-ver-db1:5432/testdb";
//    private static final String DB_USER="trainee";
//    private static final String DB_PASSWORD="123456";


//    private static void initConnectionPostgre(){
//
//
//        try{
//            Class.forName("org.postgresql.Driver");
//        }catch(ClassNotFoundException e){
//            System.out.println("Where is your postgresql JDBC Driver?");
//            e.printStackTrace();
//            return;
////            Connection connection = DriverManager.getConnection();
////                    //("jdbc:postgresql://"+ "s-msk-t-ver-db1" + ":" + "5432" + "/testdb", "trainee", "123456");
////        } catch (Exception e) {
////            throw new RuntimeException(e.getMessage());
//        }
//   }

    private static Connection getDBConnection(){
        Connection dbConnection=null;
        try{
            Class.forName("org.postgresql.Driver");
//            Class.forName(DB_DRIVER);
        } catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            dbConnection=DriverManager.getConnection("jdbc:postgresql://s-msk-t-ver-db1:5432/testdb", "trainee", "123456");
//            dbConnection=getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
            return dbConnection;
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return dbConnection;
    }

    static void createDbUserTable() throws SQLException{
        Connection dbConnection=null;
        Statement statement=null;

        String createTableSQL="CREATE TABLE PERSON_TEST("+"PERSON_CODE  VARCHAR(3) NOT NULL,"+"FIRST_NAME VARCHAR(15) NOT NULL, "+"LAST_NAME VARCHAR(20) NOT NULL, "+"HIREDATE DATE, "+"PRIMARY KEY (PERSON_CODE) "+")";

        try{
            dbConnection=getDBConnection();
            statement=dbConnection.createStatement();

            // выполнить SQL запрос
            statement.execute(createTableSQL);
            System.out.println("Table \"PERSON_TEST\" is created!");
        } catch(SQLException e){
            System.out.println(e.getMessage());
        } finally{
            if(statement!=null){
                statement.close();
            }
            if(dbConnection!=null){
                dbConnection.close();
            }
        }
    }


}


