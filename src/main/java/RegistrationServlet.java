import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        description = "Registration Servlet Page",
        urlPatterns = {"/registrationServlet"}
)

public class RegistrationServlet extends HttpServlet {
    static final String NAME_PATTERN = "[A-Z]{1}[a-z]{2,}";
    static final String EMAIL_PATTERN = "^[A-Za-z]{3,}([-|+|.]?[A-Za-z0-9]+)?[@][A-Za-z0-9]+[.][A-Za-z]{2,4}([.][A-Za-z]{2,4})?$";
    static final String MOBILE_NO_PATTERN="[0-9]{1,3}[ ][1-9]{1}[0-9]{9}$";
    static final String PASSWORD_PATTERN ="^(?=.*[A-Z])(?=.*[0-9])(?=[^@|#|$|%|&]*[@|#|$|%|&][^@|#|$|%|&]*$)[A-Za-z0-9@#$%^&]{8,}$";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String mobileNo = request.getParameter("mobileNo");

        if(username.matches(NAME_PATTERN) && email.matches(EMAIL_PATTERN) && mobileNo.matches(MOBILE_NO_PATTERN) && password.matches(PASSWORD_PATTERN)){
            request.setAttribute("username",username);
            request.setAttribute("email",email);
            request.setAttribute("mobileNo",mobileNo);
            request.setAttribute("password",password);
            request.getRequestDispatcher("registrationSuccess.jsp").forward(request,response);
        }else {
            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/registration.jsp");
            PrintWriter out = response.getWriter();
            out.println("<font color=red>Something Is Wrong.</font>");
            requestDispatcher.include(request,response);
        }
    }
}
