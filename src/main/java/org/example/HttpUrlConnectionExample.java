package org.example;

import javax.net.ssl.SSLContext;
import java.io.*;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.NoSuchAlgorithmException;

public class HttpUrlConnectionExample {

    public void getMethodExample() throws IOException {
        URL url = new URL("https://dummy.restapiexample.com/api/v1/employees");
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        //HttpURLConnection is a parent of URLConnection. Stored in parent class by using typecasting
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        int responseCode = httpURLConnection.getResponseCode();
        System.out.println("Response code is " + responseCode);
        String responseMessage = httpURLConnection.getResponseMessage();
        System.out.println("Response message is " + responseMessage);
        InputStream inputStream = httpURLConnection.getInputStream();
        //getInputStream method is used to read the response body
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        //for reading the inputstream we need inputstreamreader
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        //for reading the inputstreamreader we need bufferreader
        String line;
        //For taking the response line by line take buffer reader
        StringBuffer stringBuffer = new StringBuffer(); // mutable
        while ((line=bufferedReader.readLine()) != null) {
            stringBuffer.append(line);
        }
        System.out.println(stringBuffer);
    }

    public void postRequestExample() throws IOException {
        //@Deprecated(since = "20")
        URL url = new URL("https://dummy.restapiexample.com/api/v1/create");
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        urlConnection.setRequestMethod("POST");
        urlConnection.connect();
        urlConnection.setRequestProperty("Content-Type", "application/json");
        //As we creating something new we need to inform in which format we are creating that
        urlConnection.setDoInput(true);
        //For get request also it will be available by default it is false so not mentioned there
        String jsonBody = "{\"name\":\"Naveen\",\"salary\":\"30000\",\"age\":\"23\"}";
        byte[] bytes = jsonBody.getBytes();
        OutputStream outputStream = urlConnection.getOutputStream();
        outputStream.write(bytes);
        int responseCode = urlConnection.getResponseCode();
        System.out.println("Response code is " + responseCode);
        String responseMessage = urlConnection.getResponseMessage();
        System.out.println("Response message is " + responseMessage);
        InputStream inputStream = urlConnection.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line;
        StringBuffer stringBuffer = new StringBuffer();
        while ((line = bufferedReader.readLine())!=null) {
            stringBuffer.append(line);
        }
        System.out.println(stringBuffer);
    }

    public void putRequestExample() throws IOException {
        //@Deprecated(since = "20")
        URL url = new URL("https://dummy.restapiexample.com/api/v1/create/2641");
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        urlConnection.setRequestMethod("PUT");
        urlConnection.connect();
        urlConnection.setRequestProperty("Content-Type", "application/json");
        //As we creating something new we need to inform in which format we are creating that
        urlConnection.setDoInput(true);
        //For get request also it will be available by default it is false so not mentioned there
        String json = "{\"name\":\"Naveen\",\"salary\":\"31000\",\"age\":\"23\"}";
        byte[] bytes = json.getBytes();
        OutputStream outputStream = urlConnection.getOutputStream();
        outputStream.write(bytes);
        int responseCode = urlConnection.getResponseCode();
        System.out.println("Response code is " + responseCode);
        String responseMessage = urlConnection.getResponseMessage();
        System.out.println("Response message is " + responseMessage);
        InputStream inputStream = urlConnection.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line;
        StringBuffer stringBuffer = new StringBuffer();
        while ((line = bufferedReader.readLine())!=null) {
            stringBuffer.append(line);
        }
        System.out.println(stringBuffer);
    }

    public void deleteRequestExample() throws IOException {
        //@Deprecated(since = "20")
        URL url = new URL("https://dummy.restapiexample.com/api/v1/delete/7821");
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        urlConnection.setRequestMethod("DELETE");
        urlConnection.connect();
        urlConnection.setRequestProperty("Content-Type", "application/json");
        //As we creating something new we need to inform in which format we are creating that
        urlConnection.setDoInput(true);
        //For get request also it will be available by default it is false so not mentioned there
        int responseCode = urlConnection.getResponseCode();
        System.out.println("Response code is " + responseCode);
        String responseMessage = urlConnection.getResponseMessage();
        System.out.println("Response message is " + responseMessage);
        InputStream inputStream = urlConnection.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line;
        StringBuffer stringBuffer = new StringBuffer();
        while ((line = bufferedReader.readLine())!=null) {
            stringBuffer.append(line);
        }
        System.out.println(stringBuffer);
    }

    public static void main(String[] args) throws IOException {
        HttpUrlConnectionExample example = new HttpUrlConnectionExample();
        example.getMethodExample();
        //example.postRequestExample();
        //example.putRequestExample();
        //example.deleteRequestExample();
    }
}
