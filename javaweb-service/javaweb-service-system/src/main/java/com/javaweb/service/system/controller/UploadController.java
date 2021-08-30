package com.javaweb.service.system.controller;

import com.javaweb.common.framework.common.BaseController;
import com.javaweb.service.system.service.IUploadService;
import com.javaweb.common.framework.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 角色菜单关联表 前端控制器
 * </p>
 *
 * @author 鲲鹏
 * @since 2020-02-26
 */
@RestController
@RequestMapping("/upload")
public class UploadController extends BaseController {

    @Autowired
    private IUploadService uploadService;

    /**
     * 上传图片
     *
     * @param request 网络请求
     * @param name    目录名
     * @return
     */
    @PostMapping("/uploadImage/{name}")
    public JsonResult uploadImage(HttpServletRequest request, @PathVariable("name") String name) {
        return uploadService.uploadImage(request, name);
    }

    /**
     * 上传文件
     *
     * @param request
     * @param name    目录名
     * @return
     */
    @PostMapping("/uploadFile")
    public JsonResult uploadFile(HttpServletRequest request, String name) {
        return uploadService.uploadFile(request, name);
    }

}
