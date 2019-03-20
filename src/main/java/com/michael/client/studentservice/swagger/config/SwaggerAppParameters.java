/**
 * 
 */
package com.michael.client.studentservice.swagger.config;


import springfox.documentation.service.Parameter;

import java.util.List;
/**
 * @author 109726
 *
 */
public interface SwaggerAppParameters {

    List<Parameter> globalOperationParameters();
}