package cn.tx.demo2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @Author: xiazidong
 * @Date: 2020/11/3
 */
@Controller
public class UploadController {
    /**
     * 文件上传
     * 文件上传解析器对象解析request后的文件上传对象
     * @param upload 因为 file name保持一致
     * @return
     */
    @RequestMapping("/upload.do")
    public String upload(MultipartFile upload, HttpServletRequest request) throws IOException {
        //把文件上传的位置
        String realPath = request.getSession().getServletContext().getRealPath("/uploads");
        //创建该文件
        File file = new File(realPath);
        System.out.println(realPath);
        //判断该文件夹是否存在
        if (!file.exists()){
            file.mkdirs();
        }

        //获得上传文件的名称
        String filename = upload.getOriginalFilename();
        String uuid = UUID.randomUUID().toString().replace("_", "").toUpperCase();

        //如果不是覆盖而是唯一的名字可以用uuid
        filename=uuid+filename;
        //上传文件 new File(file,filename)//文件夹file里new一个文件名filename的文件
        upload.transferTo(new File(file,filename));



        return "suc";
    }
}
