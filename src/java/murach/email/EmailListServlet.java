package murach.email;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import murach.business.User;


@WebServlet(name = "EmailListServlet", urlPatterns = {"/emailList"})
public class EmailListServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url="/index.php";
        String action=request.getParameter("action");
        if(action==null)
        {
            action="join";
        }
        if(action.equals("join"))
        {
            url="/index.jsp";
        }
        else if(action.equals("add"))
        {
            String firstName=request.getParameter("firstName");
            String lastName=request.getParameter("lastName");
            String email=request.getParameter("email");
            String message;
            
            User user=new User(firstName,lastName,email);
            //UserDB.insert(user);
            if(firstName==null || lastName==null || email==null || firstName.isEmpty() || lastName.isEmpty() || email.isEmpty())
            {
                log("Email: " + email);
                message="Please fill out all the three text boxes.";
                url="/index.jsp";
            }
            else
            {
                message="";
                url="/thanks.jsp";
            }
            request.setAttribute("user", user);
            request.setAttribute("message", message);
        }
        else if(action.equals("checkAnchor"))
        {
            url="/chkAnchorTag.jsp";
        }
        ServletContext sc=getServletContext();
        RequestDispatcher rd=sc.getRequestDispatcher(url);
        rd.forward(request, response);
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
