import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DemoServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

                            //response.setContentType("text/html");
//                PrintStream stream = new PrintStream(output);
//                PrintWriter writer = new PrintWriter(new OutputStreamWriter(output, "UTF-8"));
//		PrintWriter out = response.getWriter();
//		
//		ServletConfig config=getServletConfig();
//		String driver=config.getInitParameter("HovaTen");
//		out.print("Name is: "+driver);
//		
//		out.close();

            response.setContentType("text/html");
            PrintWriter pw=response.getWriter();  
  
            //creating ServletContext object  
            ServletContext context=getServletContext();  
  
            //Getting the value of the initialization parameter and printing it  
            String driverName=context.getInitParameter("dname");  
            pw.println("driver name is="+driverName);  
  
            pw.close();  
	}

}
