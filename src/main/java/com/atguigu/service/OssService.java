package com.atguigu.service;

import org.springframework.web.multipart.MultipartFile;

public interface OssService {
    String uploadFile(MultipartFile file);

    boolean deleteFile(String fileName);
}
