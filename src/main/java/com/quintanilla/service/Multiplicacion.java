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
@WebService(serviceName = "Multiplicacion")
public class Multiplicacion {

    /**
     * This is a sample web service operation
     * @param Numone
     * @param Numtwo
     * @return 
     */
    @WebMethod(operationName = "Multiplicacion")
    public String multiplicacion(@WebParam(name = "Numone") Double Numone,@WebParam(name="Numtwo")Double Numtwo)
    {
        double result= Numone*Numtwo;
        return "resultado " + result + " !";
    }
}
