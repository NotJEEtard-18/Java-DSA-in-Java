import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InternetSpeedTest {

    public static void main(String[] args) {
        String url = "http://speedtest.tele2.net/1MB.zip"; // URL to a file for testing

        long startTime = System.currentTimeMillis();
        try {
            HttpClient httpClient = HttpClients.createDefault();
            HttpGet httpGet = new HttpGet(url);
            HttpResponse response = httpClient.execute(httpGet);
            HttpEntity entity = response.getEntity();

            if (entity != null) {
                try (InputStream inputStream = new BufferedInputStream(entity.getContent())) {
                    // Read the content to calculate the download speed
                    byte[] buffer = new byte[1024];
                    int bytesRead;
                    long totalBytesRead = 0;
                    while ((bytesRead = inputStream.read(buffer)) != -1) {
                        totalBytesRead += bytesRead;
                    }

                    long endTime = System.currentTimeMillis();
                    long elapsedTime = endTime - startTime; // Time taken in milliseconds
                    double downloadSpeedMbps = calculateSpeed(totalBytesRead, elapsedTime); // Speed in Mbps
                    System.out.println("Download Speed: " + downloadSpeedMbps + " Mbps");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static double calculateSpeed(long bytes, long timeInMillis) {
        // Convert bytes to megabits and time to seconds
        double bytesPerSecond = (bytes / (double) timeInMillis) * 1000;
        return bytesPerSecond * 8 / 1_000_000; // Convert bytes per second to Mbps
    }
}
