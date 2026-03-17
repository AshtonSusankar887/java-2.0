
import java.io.IOException;
import java.sql.*;
//For compiling on the shell on repl: Same on mac
//javac -cp sqlite-jdbc-3.23.1.jar: Main.java

//Use for windows
//javac -cp sqlite-jdbc-3.23.1.jar; ServerExample.java
class Main {

 public static void main(String[] args)throws IOException{
    (new Main()).init();
  }

  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init() {
   

    String queryResult="";
    String sql ="";

		Database db = new Database("jdbc:sqlite:" );	
    
//1
String sql = "Select * from cr101 Where ID='STUDENT1001' and PD=3;";
sql += "update cr101 ";
sql += "Set ROOM=122 ";
sql += "Where ID='STUDENT1001' and PD=3";
queryResult = db.runSQL(sql, "table-auto");

//2 
String sql = "Select * from cr101 Where ID='STUDENT1200' and COURSE='ZQCTEDA';";
sql += "delete from cr101 ";
sql += "Where ID='STUDENT1200' and COURSE='ZQCTEDA'";
queryResult = db.runSQL(sql, "table-auto");

//3
String sql = "Select * from cr101 Where TEACHER='DOYLE' and (PD=4 or PD=5);";
sql += "update cr101 ";
sql += "Set ROOM=213 ";
sql += "Where TEACHER='DOYLE' and (PD=4 or PD=5)";
queryResult = db.runSQL(sql, "table-auto");
print(queryResult);	
//4
String sql = "Select * from cr101 Where TEACHER='ARCHETTI' and COURSE='MQF44QGF' and SEC=1;";
sql += "update cr101 ";
sql += "Set TEACHER='ROFFLER' ";
sql += "Where TEACHER='ARCHETTI' and COURSE='MQF44QGF' and SEC=1";
queryResult = db.runSQL(sql, "table-auto");
print(queryResult);	
//5
String sql = "Select * from cr101 Where ID='STUDENT999';";
sql += "update cr101 ";
sql += "Set GRADE=11, OFFCCLASS='Junior' ";
sql += "Where ID='STUDENT999'";
queryResult = db.runSQL(sql, "table-auto");
print(queryResult);	
//6
String sql = "insert into cr101 (ID, COURSE, SEC, TEACHER, PD, ROOM) ";
sql += "values ('student1231', 'MKUFTC6', 1, 'CASTRO R', 9, 322);";
sql += "Select * from cr101 Where ID='student1231'";
queryResult = db.runSQL(sql, "table-auto");
print(queryResult);	

      }    
}