package com.qf.swagger;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * //
 * //                          菩提偈
 * //
 * //                  菩提本无树，明镜亦非台。
 * //                  佛性常清净，何处有尘埃！
 * //                  身是菩提树，心为明镜台。
 * //                  明镜本清净，何处染尘埃！
 * //                  菩提本无树，明镜亦非台。
 * //                  本来无一物，何处惹尘埃！
 * //                  菩提只向心觅，何劳向外求玄？
 * //
 * Description:
 * Auther: sakila
 * Date: 2020/1/7 17:24
 */
@ConfigurationProperties(prefix = "swagger-cawbutler")
public class SwaggerProperties {
    private String title = "默认标题";

    private String apiBasePackage;

    private String description;

    private String termsOfServiceUrl;

    private String version;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getApiBasePackage() {
        return apiBasePackage;
    }

    public void setApiBasePackage(String apiBasePackage) {
        this.apiBasePackage = apiBasePackage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTermsOfServiceUrl() {
        return termsOfServiceUrl;
    }

    public void setTermsOfServiceUrl(String termsOfServiceUrl) {
        this.termsOfServiceUrl = termsOfServiceUrl;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
