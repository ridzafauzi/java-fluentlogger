package org.hackathon.logger;

import java.util.HashMap;
import java.util.Map;
import org.fluentd.logger.FluentLogger;

import java.io.*;


public class App
{
    private static FluentLogger LOG = FluentLogger.getLogger("app","127.0.0.1", 5141);

    public static void main( String[] args ) throws IOException
    {
        Map<String, Object> data = new HashMap<String, Object>();

        FileInputStream fstream = new FileInputStream("../data_example/HDFS_aa.log");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
        String strLine;
        String[] arr;
        while ((strLine = br.readLine()) != null)   {

          try {
            Thread.sleep(1000);
          } catch(Exception e) {
            System.out.println("Exception : "+e.getMessage());
          }

          //arr = strLine.split(" ");
          arr = strLine.split(" ", 5);
          for ( String ss : arr) {
            //System.out.println (arr[3]);
            //System.out.println (arr[4]);
            data.put("source", "java");
            data.put("level", arr[3]);
            data.put("msg", arr[4]);
          }
          LOG.log("follow", data);
        }

        fstream.close();

        LOG.close();

    }
}

