/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fwtj.XmltoObjeto;

/**
 *
 * @author Junior
 */
public class Icms {
    
    private String CST;
    private String orig;
    private String pCredSN;

    public String getCST() {
        return CST;
    }

    public void setCST(String CST) {
        this.CST = CST;
    }

    public String getOrig() {
        return orig;
    }

    public void setOrig(String orig) {
        this.orig = orig;
    }

    public String getpCredSN() {
        return pCredSN;
    }

    public void setpCredSN(String pCredSN) {
        this.pCredSN = pCredSN;
    }

    @Override
    public String toString() {
        return "Icms{" + "CST=" + CST + ", orig=" + orig + ", pCredSN=" + pCredSN + '}';
    }

    
    
    

    
    
    
    
}
