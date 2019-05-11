package com.github.attemper.sys.conf;

import com.github.attemper.config.base.conf.ConfigConfiguration;
import com.github.attemper.sys.aspect.ControllerAspect;
import com.github.attemper.sys.controller.ResourceController;
import com.github.attemper.sys.controller.TagController;
import com.github.attemper.sys.controller.TenantController;
import com.github.attemper.sys.dao.mapper.ResourceMapper;
import com.github.attemper.sys.dao.mapper.TagMapper;
import com.github.attemper.sys.dao.mapper.TenantMapper;
import com.github.attemper.sys.ext.service.SecretService;
import com.github.attemper.sys.service.ResourceService;
import com.github.attemper.sys.service.TagService;
import com.github.attemper.sys.service.TenantService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        ConfigConfiguration.class
})
@ComponentScan(basePackageClasses = {
        ControllerAspect.class,

        //mapper
        TenantMapper.class,
        ResourceMapper.class,
        TagMapper.class,

        //service
        TenantService.class,
        ResourceService.class,
        TagService.class,
        SecretService.class,

        //controller
        TenantController.class,
        ResourceController.class,
        TagController.class,
})
public class SysConfiguration {
}
