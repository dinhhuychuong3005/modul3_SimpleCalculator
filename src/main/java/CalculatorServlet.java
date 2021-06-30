import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", value = "/calculator")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double number1 = Double.parseDouble(request.getParameter("number1"));
        double number2 = Double.parseDouble(request.getParameter("number2"));
        String operator = request.getParameter("operator");
        PrintWriter writer = response.getWriter();
        double result;
        try {
            result = Calculator.calculate(number1,number2,operator);
            writer.println(number1 + " " + operator + " " + number2 + " = " + result);
        }catch (Exception e){
            writer.println("Không chia được cho 0");
        }
    }
}
