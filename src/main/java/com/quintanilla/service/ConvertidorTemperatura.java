/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.quintanilla.service;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;

/**
 *
 * @author kevinS
 */
@WebService(serviceName = "ConvertidorTemperatura")
public class ConvertidorTemperatura {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "Farenheit2Celcius")
    public Double Farenheit2Celcius(@WebParam(name = "FarenheitTemp") Double FarenheitTemp) 
    {
        return (FarenheitTemp -32)*(5.00/9.00);
    }
}
