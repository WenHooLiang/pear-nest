package com.sakila.mesh;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Description:
 * Auther: sakila
 * Date: 2020/1/14 20:11
 */
@FeignClient(value = "mesh-server")
public interface IServerFeign {
    @GetMapping("server/init/{serviceId}")
    String init(@PathVariable("serviceId") Long serviceId);
}
