package basic;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/thankYou")
public class ThankYouServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println(getHTML());
    }

    private String getHTML() {
        return "<!DOCTYPE html>"
                + "<html lang=\"en\">"
                + "<head>"
                + "<meta charset=\"UTF-8\">"
                + "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">"
                + "<title>Thank You</title>"
                + "<style>"
                + "body { font-family: Arial, sans-serif; background-color: #f4f4f9; color: #333; text-align: center; margin-top: 20%; }"
                + "h1 { color: #4a90e2; }"
                + "</style>"
                + "</head>"
                + "<body>"
                + "<h1>Thanks for visiting!</h1>"
                + "</body>"
                + "</html>";
    }
}
