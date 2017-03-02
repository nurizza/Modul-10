
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Izza
 */
public class setor {
    private int saldo;
    public void menabung (int bal, int s){
        if (s%100!=0)
            JOptionPane.showInternalMessageDialog(null, "Mesin ATM BRI tidak menerima uang koin \n Silahkan ulangi kembali!", "Transaksi Gagal", 0);
        
        else if (s<50000)
            JOptionPane.showInternalMessageDialog(null, "Besaran minimal setor tunai adalah Rp 50000,00", "Error", 0);
        else if (s<=50000)
            JOptionPane.showInternalMessageDialog(null, "Saldo Anda Saat Ini : " + saldo );   
    }

public int getsaldo(){
return saldo;
}}

