/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
public class ontapServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<html>\n" +
"    <head>\n" +
"        <title>TODO supply a title</title>\n" +
"        <link href=\"css/newcss.css\" rel=\"stylesheet\" type=\"text/css\"/>\n" +
"        <meta charset=\"UTF-8\">\n" +
"        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"    </head>\n" +
"    <body>\n" +
"        <div class=\"menu\">\n" +
"\n" +
"        <nav class=\"navbar  navbar-inverse  \">\n" +
"            <div class=\"container-fluid\">\n" +
"                <div class=\"navbar-header\">\n" +
"                    <a href=\"#\" class=\"navbar-brand\"><img src=\"http://goldidea.com.vn/upload/images/adidas(3).jpg\" style=\"width:100px;\" >  </a>\n" +
"                </div>\n" +
"                <div class=\"navbar-collapse collapse\" id=\"main-menu\">\n" +
"                    <ul class=\"nav navbar-nav\">\n" +
"                        <li>\n" +
"                            <a href=\"file:///C:/Users/USER/Desktop/images/New%20folder/thihocki.html\">Trang Chủ</a>\n" +
"                        </li>\n" +
"                        <li>\n" +
"                            <a href=\"#\" data-toggle=\"dropdown\">Danh Mục<span class= \"caret\"></span></a>\n" +
"                            <ul class=\"dropdown-menu\">\n" +
"                                <li>\n" +
"                                    <a href=\"https://fandy.vn/wp-content/uploads/2017/05/adidas-ultra-boost-3-0-mystery-grey-release-date-02.jpg\">Giày - Ultra Boost</a>\n" +
"                                </li>\n" +
"                                <li class=\"divider\"></li>\n" +
"                                <li>\n" +
"                                    <a href=\"https://cdn-images-1.medium.com/max/1600/0*kyQUuEDNCGkB8fLh.jpg\">Giày - Adidas Prophere</a>\n" +
"                                </li>\n" +
"                                <li class=\"divider\"></li>\n" +
"                                <li>\n" +
"                                    <a href=\"https://thoitrangaz.com.vn/upload/image/sanpham/giay-adidas-nmd/n018/big-5-.jpg\">Giày - Adidas NOMAD</a>\n" +
"                                </li>\n" +
"                                <li class=\"divider\"></li>\n" +
"                                <li>\n" +
"                                    <a href=\"http://www.elle.vn/wp-content/uploads/2016/12/02/gia%CC%80y-adidas-TUBULAR-ENTRAP-SHOES-490x327.jpg\">Giày - Adidas Tubular</a>\n" +
"                                </li>\n" +
"                            </ul>\n" +
"                        </li>\n" +
"                        <li>\n" +
"                            <a href=\"#\" data-toggle=\"dropdown\">Liên Hệ<span class=\"caret\"></span></a>\n" +
"                                <ul class=\"dropdown-menu\">\n" +
"                                    <li>\n" +
"                                        <a href=\"https://www.facebook.com/phan.luong.3597\">FACEBOOK</a>\n" +
"\n" +
"                                    </li>\n" +
"                                    <li class=\"divider\"></li>\n" +
"                              \n" +
"                                   \n" +
"                                <li>\n" +
"                                   <a href=\"https://www.instagram.com/luong.9779/\">Instagram</a>\n" +
"                                </li>\n" +
"                             \n" +
"                                 </ul>   \n" +
"                        </li>\n" +
"                    </ul>\n" +
"                    <form class=\"navbar-form navbar-left\" action=\"https://www.google.com/\">\n" +
"                        <div class=\"form-group\">\n" +
"                            <input type=\"text\" class=\"form-control\" placeholder=\"Search\" name=\"search\">\n" +
"                        </div>\n" +
"                        <button type=\"submit\" class=\"btn btn-default\" style=\"width: 50%;\">Submit</button>\n" +
"                    </form>\n" +
"                    <ul class=\"nav navbar-nav navbar-right\">\n" +
"                       \n" +
"\n" +
"                    </ul>\n" +
"\n" +
"                </div>\n" +
"            </div>\n" +
"        </nav>\n" +
"    </div>\n" +
"    </body>\n" +
"</html>");
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
