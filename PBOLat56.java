/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan56.umurbarangantik;

/**
 *
 * @author ACER
 */
public class PBOLat56 {
    private int umur;

    public PBOLat56(int umur) {
        this.umur = umur;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}

// Radio.java
class Radio extends PBOLat56 {
    private String name;

    public Radio(int umur, String name) {
        super(umur);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// ContohPenggunaan.java
class ContohPenggunaan {
    public static void main(String[] args) {
        Radio radioAntik = new Radio(234, "Radio AM");

        System.out.println("Nama Barang Antik: " + radioAntik.getName());
        System.out.println("Umur Barang Antik ini adalah: " + radioAntik.getUmur() + " tahun");
    }
}