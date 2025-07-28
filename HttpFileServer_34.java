import com.sun.net.httpserver.*;
import java.io.*;
import java.net.*;
import java.nio.file.*;

public class HttpFileServer_34{
    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/", exchange -> {
            URI uri = exchange.getRequestURI();
            File file = new File("." + uri.getPath()).getCanonicalFile();
            if (!file.exists() || file.isDirectory()) {
                String res = "404 Not Found";
                exchange.sendResponseHeaders(404, res.length());
                exchange.getResponseBody().write(res.getBytes());
            } else {
                byte[] data = Files.readAllBytes(file.toPath());
                exchange.sendResponseHeaders(200, data.length);
                exchange.getResponseBody().write(data);
            }
            exchange.close();
        });
        server.setExecutor(null);
        server.start();
        System.out.println("Server started at http://localhost:8000");
    }
}
