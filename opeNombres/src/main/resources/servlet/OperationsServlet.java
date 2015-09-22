package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OperationsServlet
 */
@WebServlet("/OperationsServlet")
public class OperationsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OperationsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ope1 = request.getParameter("ope1");
		String ope2 = request.getParameter("ope2");
		String type = request.getParameter("type");
		Integer result = null;
		
		if(ope1!=null && ope2!=null && type!=null){
			
			try{
				int ope1Value = Integer.parseInt(ope1);
				int ope2Value = Integer.parseInt(ope2);
				
				switch (type) {
				case "+":
					result = ope1Value+ope2Value;
					request.setAttribute("result", result);
					getServletContext().getRequestDispatcher("/addition.jsp").forward(request,response);
					break;
				case "-":
					result = ope1Value-ope2Value;
					request.setAttribute("result", result);
					getServletContext().getRequestDispatcher("/soustraction.jsp").forward(request,response);
					break;
				case "*":
					result = ope1Value*ope2Value;
					request.setAttribute("result", result);
					getServletContext().getRequestDispatcher("/multiplication.jsp").forward(request,response);
					break;
				case "/":
					result = ope1Value/ope2Value;
					request.setAttribute("result", result);
					getServletContext().getRequestDispatcher("/division.jsp").forward(request,response);
					break;
				default:
					break;
				}
				
			} catch(NumberFormatException nfe){
				//TODO
			} catch(ArithmeticException nfe){
				//TODO
			}
		}

		getServletContext().getRequestDispatcher("/index.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
