package com.lds.demo.controller;

import com.lds.demo.bean.Student;
import com.lds.demo.service.IDemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2018/10/31 下午4:34
 */
@RestController
public class DemoController {

    @Resource(name ="service1")
    private IDemoService iDemoService;

    @RequestMapping("/test")
    public String demo(){
        openExe("http://hot.media.ysten.com/media/new/2012/11/02/sd_zy_gqjyxbb_20121102.ts");

        return "success";

    }

    private void openExe(String file) {
        Runtime rn = Runtime.getRuntime();
        Process p = null;
        try {
//            p = rn.exec("/Applications/VLC.app/Contents/MacOS/VLC* " + file);
            p = rn.exec("open -n /Applications/Utilities/Terminal.app " + file);
        } catch (Exception e) {
            System.out.println("Error exec.." + e);
        }
    }


    public static void main(String[] args) throws IOException, InterruptedException {
       /* ServerSocket serverSocket=new ServerSocket(8888);
        //循环监听
        while(true){
            System.out.println("#####");
            Thread.sleep(100);
            Socket socket=serverSocket.accept();
            //里面有输入流 / 输出流
            OutputStream out=socket.getOutputStream();
            out.write("hello world".getBytes());
            out.flush();//清空缓冲区
            out.close();//关闭流
        }*/

       String str = "{\n" +
               "    \"code\": \"00000\",\n" +
               "    \"data\": {\n" +
               "        \"deviceId\": \"86682220-f8b2-11ea-b6f5-61dd201adc37\"\n" +
               "    },\n" +
               "    \"msg\": \"Success\"\n" +
               "}";
        System.out.println(str.length());

    }
}
