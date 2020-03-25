package com.atguigu.controller;

import com.atguigu.service.OssService;
import com.atguigu.vo.response.RetVal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/oss")
@CrossOrigin
public class OssController {
    @Autowired
    private OssService ossService;


    //1.文件上传
    @PostMapping("uploadFile")
    public RetVal uploadFile(@RequestParam("file") MultipartFile file){
        String url=ossService.uploadFile(file);
        return RetVal.success().data("url",url);
    }
    //2.文件删除
    @PostMapping("deleteFile")
    public RetVal deleteFile(String fileName){
        boolean flag=ossService.deleteFile(fileName);
        return RetVal.success();
    }
}
