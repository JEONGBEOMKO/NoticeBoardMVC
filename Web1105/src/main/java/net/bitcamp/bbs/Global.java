package net.bitcamp.bbs;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date ;

public class Global { //�Ϲ�Ŭ����
	   Connection CN ;
	   Statement ST ;
	   PreparedStatement PST;
	   ResultSet RS ;
	   
	   int Grn, Grow, Gsabun, Gcode, Gpay, Ghit, Gtotal, GGtotal, GStotal ;   
       String Gname, Gtitle, Gemail, Gmemo, GID, GPWD ; 
       java.util.Date Gdate, Gwdate ;
       String Gmsg, msg, Gdata;
       
       int Rrn, Rnum, Rsabun, Rcode;
       String Rwriter, Rcontent;
       
       int dcode, dpay ; 
       String dtitle,demail ;  
   
}//class END



