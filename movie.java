package movie_names;


	
import java.sql.*;
import java.sql.Connection;
import java.util.*;
import java.sql.Statement;
public class movie {
	public static void main(String[] args) {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection con=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\DELL\\Desktop\\sqlite\\sqlite-tools-win32-x86-3390000\\movie.db");
			System.out.println("Database Connection opened.");
			Statement st=con.createStatement();
			st.executeUpdate("create table moviemule(moviename varchar(20),actor varchar(20),actress varchar(20),relesae varchar(10),director varchar(20))");
			System.out.println("Table Created");
			
			st.executeUpdate("INSERT INTO moviemule (moviename,actor,actress,relesae,director) VALUES ('bahubali','prabhas','anushka','2015','rajamouli')");
			st.executeUpdate("INSERT INTO moviemule (moviename,actor,actress,relesae,director) VALUES ('chatrapati','prabhas','shreya','2005','rajamouli')");
			st.executeUpdate("INSERT INTO moviemule (moviename,actor,actress,relesae,director) VALUES ('hit','vishwak sen','ruhani sharma','2020','sailesh')");
			st.executeUpdate("INSERT INTO moviemule (moviename,actor,actress,relesae,director) VALUES ('vikramarkudu','ravi teja','anushka','2006','rajamouli')");
			st.executeUpdate("INSERT INTO moviemule (moviename,actor,actress,relesae,director) VALUES ('eega','nani','samantha','2012','rajamouli')");
			st.executeUpdate("INSERT INTO moviemule (moviename,actor,actress,relesae,director) VALUES ('bahubali 2','prabhas','anushka','2015','rajamouli')");
			st.executeUpdate("INSERT INTO moviemule (moviename,actor,actress,relesae,director) VALUES ('kgf2','yash','srinidhi','2022','prashanth')");
			st.executeUpdate("INSERT INTO moviemule (moviename,actor,actress,relesae,director) VALUES ('rrr','ramcharan','oliva','2022','rajamouli')");
			
			
			ResultSet rb = st.executeQuery("select * from moviemule");
			
			while(rb.next()) {
				System.out.println(rb.getString(1)+" : " +(rb.getString(2)+" : "+rb.getString(3)+" : "+ rb.getString(4)+" : "+rb.getString(5)));
			}
			
			con.close();
			System.out.println("Connection closed.");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
