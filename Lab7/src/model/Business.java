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
    private SupplierDirectory supplierDirectory;
    private MasterOrderList masterOrderList;

    public Business() {
        supplierDirectory = new SupplierDirectory();
        masterOrderList = new MasterOrderList();
    }

    public SupplierDirectory getSupplierDirectory() { return supplierDirectory; }
    public MasterOrderList getMasterOrderList() { return masterOrderList; }
}
