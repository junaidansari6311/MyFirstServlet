import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        description = "Login Servlet Testing",
        urlPatterns = {"/loginServlet"},
        initParams = {
                @WebInitParam(name = "user",value = "Junaid"),
                @WebInitParam(name = "password",value = "junaid@123")
        }
)
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");
        String pwd = request.getParameter("pwd");

        String userName = getServletConfig().getInitParameter("user");
        String password = getServletConfig().getInitParameter("password");

        if(userName.equals(user)&&password.equals(pwd)){
            request.setAttribute("user",user);
            request.getRequestDispatcher("loginSuccess.jsp").forward(request,response);
        }else {
            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/login.html");
            PrintWriter out = response.getWriter();
            out.println("<font color=red>Either UserName Or Password Is Wrong.</font>");
            requestDispatcher.include(request,response);
        }
    }
}
