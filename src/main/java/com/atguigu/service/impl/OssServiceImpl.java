package com.atguigu.service.impl;

import com.atguigu.oss.OssTemplate;
import com.atguigu.service.OssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

@Service
public class OssServiceImpl implements OssService {
    @Autowired
    private OssTemplate ossTemplate;

    @Override
    public String uploadFile(MultipartFile file) {
        try {
            //文件原始名称
            String fileName = file.getOriginalFilename();
            fileName = UUID.randomUUID().toString().replaceAll("-", "") + fileName;
            String url = ossTemplate.upload(fileName, file.getInputStream());
            return url;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean deleteFile(String fileName) {
        ossTemplate.deleteFile(fileName);
        return true;
    }
}
