package com.example.hp1.language;

/**
 * Created by hp 1 on 1/19/2017.
 */
public class word {

    private String pmylang, pmiwok;
    private int pimageid;

    public  int noimage = 0;

    word(String mylang, String miwok) {
        pmylang = mylang;
        pmiwok = miwok;

    }

    word(String mylang, String miwok, int imageid) {
        pmylang = mylang;
        pmiwok = miwok;
        pimageid = imageid;

    }

    public String getmylang() {

        return pmylang;
    }

    public String getmiwok() {

        return pmiwok;

    }

    public int getimageid() {
        return pimageid;


    }

    public boolean hasimage() {

return pimageid!=noimage;
    }



}
