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
@WebService(serviceName = "ConvertidorCtoF")
public class ConvertidorCtoF {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "Celcius2Farenheit")
    public Double Celcius2Farenheit(@WebParam(name = "TempCelcius") Double TempCelcius) {
        return TempCelcius * (9.00/5.00)+32  ;
    }
}
