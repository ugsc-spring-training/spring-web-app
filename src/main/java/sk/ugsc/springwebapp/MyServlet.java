package sk.ugsc.springwebapp;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "myServlet", urlPatterns = "/test", loadOnStartup = 1)
public class MyServlet extends HttpServlet {

    private TestClass testClass;

    @Override
    public void init() throws ServletException {
        super.init();

        WebApplicationContext ctx = WebApplicationContextUtils
                .getRequiredWebApplicationContext(getServletContext());
        this.testClass = ctx.getBean(TestClass.class);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getOutputStream().println(testClass.test());
    }
}
