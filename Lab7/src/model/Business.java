/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author rithwikvarma
 */
public class Business {
    
    MasterOrderList masterOderList;
    SupplierDirectory supplierDirectory;

    public Business() {
        
        masterOderList = new MasterOrderList();   
        supplierDirectory = new SupplierDirectory();
    
    }

    public MasterOrderList getMasterOderList() {
        return masterOderList;
    }

    public void setMasterOderList(MasterOrderList masterOderList) {
        this.masterOderList = masterOderList;
    }

    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

    public void setSupplierDirectory(SupplierDirectory supplierDirectory) {
        this.supplierDirectory = supplierDirectory;
    }
    
    
    
}
