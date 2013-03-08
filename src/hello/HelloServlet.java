package hello;

import java.io.*;

import javax.servlet.http.*;


public class HelloServlet
    extends HttpServlet
{
    @Override
    public void doGet( HttpServletRequest req, HttpServletResponse res )
        throws IOException
    {
        PrintWriter out = res.getWriter();

        out.println( "Hot swap me 1234" );
        out.close();
    }
}
