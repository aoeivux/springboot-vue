package com.aoeivux.helloworld.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileController {
    @PostMapping("/up")
    public String upload(String nickname , MultipartFile f)  {
        System.out.println("文件大小: " + f.getSize());
        System.out.println("文件名称: " + nickname);
        System.out.println(System.getProperty("user.dir"));
        return "上传成功!!!";
    }
}
